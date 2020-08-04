package kr.or.ddit.widu.view.profile;

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
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import kr.or.ddit.widu.main.LoginSession;
import kr.or.ddit.widu.service.board.IBoardService;
import kr.or.ddit.widu.util.Store;
import kr.or.ddit.widu.vo.member.MemberVO;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;

public class ProfileController implements Initializable{
	
	
	
	@FXML Circle profile_picture;
	@FXML Label mem_nick_name;
	@FXML ImageView closed_btn;
	@FXML Button pofile_modify_btn;
	@FXML ImageView go_gift;
	@FXML ImageView like_image;
	@FXML ImageView hate_image;
	@FXML Label like_count;
	@FXML Label hate_count;
	@FXML Button matching_list_btn;
	@FXML Button chatting_btn;
	@FXML Button show_profile_list_btn;
	@FXML Button my_board_list_btn;
	@FXML Button center_list_btn;
	@FXML Button buy_list_btn;
	@FXML Button item_box_btn;

	private Registry reg;
	private IBoardService boardService;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		try {
			reg = LocateRegistry.getRegistry("localhost", 8413);
			
			boardService = (IBoardService) reg.lookup("boardService");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
		MemberVO loginMem = LoginSession.session;
		
		mem_nick_name.setText(loginMem.getMem_nick());
		
		
	}

	/**
	 * 닫기
	 * @param event
	 */
	@FXML public void closed_btnClicked(MouseEvent event) {
		((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
	}
	

	/**
	 * 작성한 게시물 읽기
	 * @param event
	 */
	@FXML public void myBoardBtnClicked(ActionEvent event) {
		
		Store.show_new_window(getClass().getResource("/kr/or/ddit/widu/view/profile/show_my_board.fxml"), "내가 작성한 게시물");
		
		((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
		
	}
	
	
}









