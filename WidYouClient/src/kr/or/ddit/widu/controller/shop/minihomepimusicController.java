package kr.or.ddit.widu.controller.shop;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.scene.control.Pagination;
import javafx.scene.media.MediaView;
import kr.or.ddit.widu.store.Store;

public class minihomepimusicController implements Initializable{

	@FXML JFXButton ruby_btn; // 메뉴바 루비 버튼
	@FXML JFXButton rubypackge_btn; // 메뉴바 루비 패키지 버튼
	@FXML JFXButton minihompibackground_btn; // 메뉴바 미니홈피 배경색 버튼
	@FXML JFXButton minihompimusic_btn; // 메뉴바 미니홈피 음악 버튼
	@FXML JFXButton nickname_btn; // 메뉴바 닉네임 변경권 버튼	
	@FXML Pagination musicpage; // 상품 페이지수 넘어가는것
	@FXML JFXTextField sing_title1; // 음악 1에 대한 제목
	@FXML JFXTextField sing_title2; // 음악 2에 대한 제목
	@FXML JFXTextField sing_title3; // 음악 3에 대한 제목
	@FXML JFXTextField sing_name1; // 음악 1에 대한 가수 이름
	@FXML JFXTextField sing_name2; // 음악 2에 대한 가수 이름
	@FXML JFXTextField sing_name3; // 음악 3에 대한 가수 이름 
	@FXML MediaView musicmv; //동영상 뮤비 

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		
		
		
		
	}
	
	// 루비 상점 이동 버튼 클릭
	@FXML public void rubyclick(ActionEvent event) {
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/rubyshop.fxml"), "루비 상점", null);
		
	}
	
	// 루비 패키지 상점 이동 버튼
	@FXML public void rubypackgeclick(ActionEvent event) {
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/rubypackageshop.fxml"), "루비 패키지 상점", null);
		
	}

	// 미니홈피 배경색 상점 이동 버튼 클릭
	@FXML public void backgroundclick(ActionEvent event) {
		
		
	}

	// 미니홈피 배경음악 상점 이동 버튼 클릭
	@FXML public void musicclick(ActionEvent event) {
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/minihomepimusicshop.fxml"), "미니홈피 배경음악 상점", null);
		
	}

	// 닉네임 변경권 상점 이동 버튼 클릭
	@FXML public void nicknameclick(ActionEvent event) {
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/nicknameshop.fxml"), "닉네임 변경권 상점", null);
		
	}

	

}
