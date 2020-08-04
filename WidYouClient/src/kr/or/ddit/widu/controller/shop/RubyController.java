package kr.or.ddit.widu.controller.shop;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import kr.or.ddit.widu.store.Store;
import javafx.fxml.FXML;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;

public class RubyController implements Initializable{

	
	
	@FXML JFXButton ruby_btn; // 메뉴바 루비 버튼 이동
	@FXML JFXButton rubypackage_btn; // 메뉴바 루비 패키지 버튼 이동
	@FXML JFXButton minihomepibackground_btn; // 미니홈피 배경 색 버튼 이동
	@FXML JFXButton minihomepimusic_btn; // 미니홈피 배경음악 버튼 이동
	@FXML JFXButton nickname_btn; // 닉네임 변경권 버튼 이동
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	// 루비 상점 버튼 이동
	@FXML public void rubyclick(ActionEvent event) {
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/rubyshop.fxml"), "루비 상점", null);
		
	}
	// 루비 패키지 상점 버튼 이동
	@FXML public void rubypackageclick(ActionEvent event) {
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/rubypackageshop.fxml"), "루비 패키지 상점", null);
	}
	// 미니홈피 배경 색 상점 버튼 이동
	@FXML public void backgroundclick(ActionEvent event) {
		
		
	}
	// 미니홈피 배경 음악 상점 버튼 이동
	@FXML public void musicclick(ActionEvent event) {
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/minihomepimusicshop.fxml"), "미니홈피 배경음악 상점", null);
		
	}
	// 닉네임 변경권 상점 버튼 이동
	@FXML public void nicknameclick(ActionEvent event) {
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/nicknameshop.fxml"), "닉네임 변경권 상점", null);
		
	}
	
}
