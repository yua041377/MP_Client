package kr.or.ddit.widu.main;

import java.io.IOException;
import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import kr.or.ddit.widu.service.board.IBoardService;
import kr.or.ddit.widu.util.Store;
import kr.or.ddit.widu.vo.board.BoardVO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class WidUClientMenuController implements Initializable{

	@FXML Label user_nickName;
	@FXML Label user_rank;
	@FXML Label user_ruby;
	@FXML ImageView close_btn;
	@FXML Button log_out_btn;
	@FXML ImageView go_minihomepi;
	@FXML Circle profile_img;
	@FXML Button profile_search_btn;
	@FXML Button random_matching_btn;
	@FXML Button show_rank_btn;
	@FXML Button con_info_btn;
	@FXML Button con_matching_btn;
	@FXML Button free_board_btn;
	@FXML Button tip_board_btn;
	@FXML Button lfl_board_btn;
	@FXML Button location_board_btn;
	@FXML Button mf_board_btn;
	@FXML Button review_board_btn;
	@FXML Button hob_board_btn;
	@FXML Button att_btn;
	@FXML Button roulette_btn;
	@FXML Button word_btn;
	@FXML Button talot_btn;
	@FXML Button name_game_btn;
	@FXML Button same_idol_btn;
	@FXML Button notice_btn;
	@FXML Button qna_board_btn;
	@FXML Button sos_board_btn;

	private Registry reg;
	private IBoardService boardService;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		try {
			reg = LocateRegistry.getRegistry("localhost", 8413);
			
			boardService = (IBoardService) reg.lookup("boardService");
			System.out.println("드디어 성공");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		///////
		System.out.println(LoginSession.session);
		
		user_nickName.setText(LoginSession.session.getMem_nick());
		
	}
	
	/**
	 * 메뉴판 사라지기
	 * @param event
	 */
	@FXML public void clicked(MouseEvent event) {
		
		hidMenu();
		
	}

	@FXML public void free_board_clicked(ActionEvent event) {
		LoginSession.boardCategory = 3;
		
		Store.connectMain(getClass().getResource("/kr/or/ddit/widu/view/board/board4.fxml"));
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/kr/or/ddit/widu/view/board/board4.fxml"));
		Parent freeBoard = null;
		
		try {
			freeBoard = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		hidMenu();
	}
	/**
	 * 문의사항 게시판 출력하기
	 * @param event
	 */
	@FXML public void qnaBoaedClicked(ActionEvent event) {
		Store.connectMain(getClass().getResource("/kr/or/ddit/widu/view/question/qu_board4.fxml"));
		
		hidMenu();
		
	}
	/**
	 * 연애팁 게시판 출력하기
	 * @param event
	 */
	@FXML public void tip_board_clicked(ActionEvent event) {
		LoginSession.boardCategory = 4;
		
		Store.connectMain(getClass().getResource("/kr/or/ddit/widu/view/board/board4.fxml"));
		
		hidMenu();
	}
	/**
	 * look for love 게시판 출력하기
	 * @param event
	 */
	@FXML public void lfl_board_clicked(ActionEvent event) {
		LoginSession.boardCategory = 7;
		
		Store.connectMain(getClass().getResource("/kr/or/ddit/widu/view/board/board4.fxml"));
		
		hidMenu();
	}
	
	/**
	 * 지역게시판 출력하기
	 * @param event
	 */
	@FXML public void location_board_clicked(ActionEvent event) {
		LoginSession.boardCategory = 6;
		
		Store.connectMain(getClass().getResource("/kr/or/ddit/widu/view/board/board4.fxml"));
		
		hidMenu();
	}
	/**
	 * 친구만들기 게시판 출력하기
	 * @param event
	 */
	@FXML public void mf_board_clicked(ActionEvent event) {
		LoginSession.boardCategory = 5;
		
		Store.connectMain(getClass().getResource("/kr/or/ddit/widu/view/board/board4.fxml"));
		
		hidMenu();
	}
	
	/**
	 * 리뷰 게시판 출력하기
	 * @param event
	 */
	@FXML public void review_board_clicked(ActionEvent event) {
		LoginSession.boardCategory = 8;
		
		Store.connectMain(getClass().getResource("/kr/or/ddit/widu/view/board/board4.fxml"));
		
		hidMenu();
	}
	/**
	 * 관심분야 게시판 출력하기
	 * @param event
	 */
	@FXML public void hob_board_clicked(ActionEvent event) {
		LoginSession.boardCategory = 11;
		
		Store.connectMain(getClass().getResource("/kr/or/ddit/widu/view/board/board4.fxml"));
		
		hidMenu();
	}
	/**
	 * 메뉴판 사라지게하는 메소드
	 */
	public void hidMenu() {
		LoginSession.maincon.drawer.close();
		LoginSession.maincon.hamburger.setVisible(true);
		LoginSession.maincon.drawer.setVisible(false);
	}
	
	/**
	 * 내 프로필띄우기
	 * @param event
	 */
	@FXML public void goMyProfile(MouseEvent event) {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/kr/or/ddit/widu/view/profile/profile.fxml"));
		Parent root = null;
		try {
			root = loader.load();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		Scene scene = new Scene(root);
		Stage mainStage = new Stage();

		
		mainStage.setTitle("나의 운명을 Wid U ~~ ♥");
		mainStage.setScene(scene);
		mainStage.show();
		
	}

	@FXML public void sos_boardClicked(ActionEvent event) {
		
		Store.connectMain(getClass().getResource("/kr/or/ddit/widu/view/sos/sos_board4.fxml"));
		
		hidMenu();
		
	}

	@FXML public void logOutBtnClicked(ActionEvent event) {
		
		LoginSession.session = null;
		
		((Stage) (LoginSession.maincon.borderPane.getScene().getWindow())).close();
		
		/**
		 * 로그인 화면 띄우기
		 */
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/kr/or/ddit/widu/view/login/login_main.fxml"));
		Parent root = null;
		try {
			root = loader.load();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		Scene scene = new Scene(root);
		Stage mainStage = new Stage();

		
		mainStage.setTitle("나의 운명을 Wid U ~~ ♥");
		mainStage.setScene(scene);
		mainStage.show();
		
		
	}
}



