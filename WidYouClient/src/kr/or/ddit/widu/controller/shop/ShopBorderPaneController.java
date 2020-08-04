package kr.or.ddit.widu.controller.shop;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class ShopBorderPaneController implements Initializable{
	
	public BorderPane border;
	public JFXButton rubybtn;
	public JFXButton rubypackgebtn;
	public JFXButton minihompibackgroundbtn;
	public JFXButton minihompimusicbtn;
	public JFXButton nicknamebtn;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/kr/or/ddit/widu/view/shop/shopMainVer2.fxml"));
			border.setCenter(root);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		rubybtn.setOnAction(event -> {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/kr/or/ddit/widu/view/shop/rubyShopVer2.fxml"));
				border.setCenter(root);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		rubypackgebtn.setOnAction(event -> {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/kr/or/ddit/widu/view/shop/RubyPackageShopVer2.fxml"));
				border.setCenter(root);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		nicknamebtn.setOnAction(event -> {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/kr/or/ddit/widu/view/shop/nicknameshopver2.fxml"));
				border.setCenter(root);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		minihompimusicbtn.setOnAction(event -> {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/kr/or/ddit/widu/view/shop/minihomepimusicshopVer2.fxml"));
				border.setCenter(root);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		minihompibackgroundbtn.setOnAction(event -> {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/kr/or/ddit/widu/view/shop/minihomepibackgroundVer2.fxml"));
				border.setCenter(root);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
	}

}
