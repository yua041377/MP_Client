package kr.or.ddit.widu.controller.board;

import java.io.IOException;
import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import kr.or.ddit.widu.main.LoginSession;
import kr.or.ddit.widu.service.board.IBoardService;
import kr.or.ddit.widu.util.Store;
import kr.or.ddit.widu.vo.board.BoardVO;
import oracle.net.ns.SessionAtts;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class ShowBoardController implements Initializable{

	@FXML ImageView boardImg;
	@FXML Label boardTitle;
	@FXML Label boardName;
	@FXML Label boardNicd;
	@FXML Label boardDate;
	@FXML TextArea boardCont;
	@FXML TextArea boardReText;
	@FXML Button boardmoBtu;
	@FXML Button boardTextdelBtu;
	@FXML Button boardRemoBtn;
	@FXML Button boardRedeBtn;
	@FXML Button boardlistBtu;
	@FXML TextArea boardReTextO;
	@FXML Label boardreIdO;
	@FXML Label boardreId;
	@FXML Button boardReBtn;
	private Registry reg;
	IBoardService service;	
	
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
		
		boardName.setText(board.getBoard_title());
		boardNicd.setText(board.getBoard_writer());
		boardDate.setText(board.getBoard_date());
		boardCont.setText(board.getBoard_content());
		
		if(board.getBoard_writer().equals(LoginSession.session.getMem_id())) {
			boardmoBtu.setVisible(true);
			boardTextdelBtu.setVisible(true);
		}else {
			boardmoBtu.setVisible(false);
			boardTextdelBtu.setVisible(false);			
		}
	}


	@FXML public void updateClicked(ActionEvent event) {
		//게시글 수정
		int board_cate = LoginSession.boardCategory;
		String name = LoginSession.session.getMem_id();

		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/kr/or/ddit/widu/view/board/board3.fxml"));
		Parent updateBoard = null;
		
		try {
			updateBoard = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		LoginSession.maincon.borderPane.setCenter(updateBoard);

	}


	@FXML public void deleteBoard(ActionEvent event) {
		//게시글 삭제
		int board_id = LoginSession.boardID;
		
		int cnt=0;
		
		try {
			cnt = service.deleteBoard(board_id);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		if(cnt >0 ) {
			infoMsg("삭제성공!", "삭제되었습니다!");
			Store.connectMain(getClass().getResource("/kr/or/ddit/widu/view/board/board4.fxml"));
		}else {
			errMsg("삭제 실패!", "삭제 실패되었습니다!");
		}
		

	}

	@FXML public void saveboard(ActionEvent event) {
		//게시글 댓글 등록
		
	}

	@FXML public void reupdateClicked(ActionEvent event) {
		//게시글 댓글 수정
		
	}

	@FXML public void redeleteClicked(ActionEvent event) {
		//게시글 댓글 삭제
		
	}
	
	@FXML public void mainClicked(ActionEvent event) {
		//게시글 목록		
		Store.connectMain(getClass().getResource("/kr/or/ddit/widu/view/board/board4.fxml"));
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
