package kr.or.ddit.widu.controller.board;

import java.io.IOException;
import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import kr.or.ddit.widu.main.LoginSession;
import kr.or.ddit.widu.service.board.IBoardService;
import kr.or.ddit.widu.util.Store;
import kr.or.ddit.widu.vo.board.BoardVO;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class WriteBoardController implements Initializable{


	@FXML ImageView boardImg;
	@FXML Label boardTitle;
	@FXML Label board;
	@FXML Label boardNick;
	@FXML TextArea boardCont;
	@FXML TextField boardName;
	@FXML Button boardBtnO;
	@FXML Button boardBtnX;
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
		
		
		
		
		
		
	}

	@FXML public void insertBtnClicked(ActionEvent event) {
		
		String title = boardName.getText();
		String content = boardCont.getText();
		int board_cate = LoginSession.boardCategory;
		String name = LoginSession.session.getMem_id();
		
		BoardVO board = new BoardVO();
		board.setBoard_title(title);
		board.setBoard_content(content);
		board.setCategory_id(board_cate);
		//board.setBoard_writer("test1");
		board.setBoard_writer(name);
		
		int cnt = 0;
		try {
			cnt = service.insertBoard(board);
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(cnt > 0) {
			
			Store.connectMain(getClass().getResource("/kr/or/ddit/widu/view/board/board4.fxml"));
			
		}else {
			errMsg("작성오류", "다시작성해주세요");
		}
	}

	@FXML public void mainBoard(ActionEvent event) {
		
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
