package kr.or.ddit.widu.controller.board;

import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import kr.or.ddit.widu.main.LoginSession;
import kr.or.ddit.widu.service.board.IBoardService;
import kr.or.ddit.widu.util.Store;
import kr.or.ddit.widu.vo.board.BoardVO;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class MoBoardController implements Initializable {

	@FXML ImageView boardImg;
	@FXML Label boardTitle;
	@FXML Label boardNick;
	@FXML Label boardDate;
	@FXML TextArea boardCont;
	@FXML TextField boardName;
	@FXML Button boardMoBtn;
	@FXML Button boardCanBtn;
	private Registry reg;
	private IBoardService service;	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			reg = LocateRegistry.getRegistry("localhost", 8413);
			
			service = (IBoardService) reg.lookup("boardService");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
		BoardVO board = null;
		try {
			board = service.selectBoardId(LoginSession.boardID);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		//System.out.println(board);
		boardName.setText(board.getBoard_title());
		boardNick.setText(board.getBoard_writer());
		boardDate.setText(board.getBoard_date());
		boardCont.setText(board.getBoard_content());
		
	}
	

	@FXML public void updateBut(ActionEvent event) {
		String title = boardName.getText();
		String content = boardCont.getText();
		 int boardId = LoginSession.boardID;
		 
		 BoardVO board = new BoardVO(); 
		 board.setBoard_title(title);
		 board.setBoard_content(content); 
		 board.setBoard_id(boardId);
		 
		 //board.setBoard_writer("test1"); board.setBoard_writer(name);
		 
		 int cnt = 0; 
		 try { 
			 cnt = service.updateBoard(board); 
			 
		 } catch (RemoteException e1) {
			 e1.getStackTrace(); 
		 }
		 
		 if(cnt > 0) {
			 infoMsg("수정완료!", "수정이 완료되었습니다!");
			 Store.connectMain(getClass().getResource("/kr/or/ddit/widu/view/board/board2.fxml"));
		 
		 }else { 
			 errMsg("작성오류", "다시작성해주세요"); 
		 }
		 
		 
	}
	@FXML public void canBut(ActionEvent event) {
		Store.connectMain(getClass().getResource("/kr/or/ddit/widu/view/board/board2.fxml"));
	}
	
	private void errMsg(String headerText, String msg) {
		Alert errAlert = new Alert(AlertType.ERROR);
		errAlert.setTitle("오류");
		errAlert.setHeaderText(headerText);
		errAlert.setContentText(msg);
		errAlert.showAndWait();
	}
	
	private void infoMsg(String headerText, String msg) {
		Alert infoAlert = new Alert(AlertType.INFORMATION);
		infoAlert.setTitle("정보 확인");
		infoAlert.setHeaderText(headerText);
		infoAlert.setContentText(msg);
		infoAlert.showAndWait();
	}

}
