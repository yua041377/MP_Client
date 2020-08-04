package kr.or.ddit.widu.main;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;

import javafx.scene.shape.Circle;
import kr.or.ddit.widu.util.Store;
import javafx.scene.layout.BorderPane;

public class WidUClientMainController implements Initializable{

	@FXML AnchorPane header;
	@FXML ImageView go_home;
	@FXML Label session_nickname;
	@FXML ImageView go_shop;
	@FXML ImageView go_cart;
	@FXML ImageView show_alarm;
	@FXML Label alarm_count;
	@FXML JFXHamburger hamburger;
	@FXML public BorderPane borderPane;
	
	@FXML Circle go_mypage;
    @FXML JFXDrawer drawer;
    
    private Registry reg;
    private HamburgerBackArrowBasicTransition bugerTask2;
    
    
    
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		drawer.setVisible(false);
		/*
		rmi 부분
		*/
		try {
			reg = LocateRegistry.getRegistry("localhost", 8413);
			System.out.println("방가방가");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 사진 세팅
		/*
		String pic_name
		File file = new File("../../../../../../img/main/userpicture_sample.PNG");
		Image im = new Image(file.toURI().toString(), false);
		go_mypage.setFill(new ImagePattern(im));
		*/
		FXMLLoader loader = new FXMLLoader(getClass().getResource("menu.fxml"));
		Parent hamMenu = null;
		try {
			hamMenu = loader.load();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		drawer.setSidePane(hamMenu);
		
		HamburgerBackArrowBasicTransition burgerTask2 = new HamburgerBackArrowBasicTransition(hamburger);
		burgerTask2.setRate(-1);
		hamburger.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) ->{
			drawer.setVisible(true);
			drawer.open();
			
			hamburger.setVisible(false);
		});
		session_nickname.setText(LoginSession.session.getMem_nick());
		
		/*
		 * 기본 메인화면 세팅
		 */
		FXMLLoader mainloader = new FXMLLoader(getClass().getResource("/kr/or/ddit/widu/main/mainView.fxml"));
		Parent mainView = null;
		
		try {
			mainView = mainloader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		borderPane.setCenter(mainView);
		
		LoginSession.maincon = this;
	}


	@FXML public void go_shopClicked(MouseEvent event) {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/kr/or/ddit/widu/view/shop/shopMainBorderPane.fxml"));
		Parent shopMain = null;
		
		try {
			shopMain = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		borderPane.setCenter(shopMain);
		
	}


	@FXML public void ho_homeClicked(MouseEvent event) {
		
		/*
		 * 기본 메인화면 세팅
		 */
		FXMLLoader mainloader = new FXMLLoader(getClass().getResource("/kr/or/ddit/widu/main/mainView.fxml"));
		Parent mainView = null;
		
		try {
			mainView = mainloader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		borderPane.setCenter(mainView);
		
		LoginSession.maincon = this;
		
	}

}

















