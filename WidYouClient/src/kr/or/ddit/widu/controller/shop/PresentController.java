package kr.or.ddit.widu.controller.shop;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import kr.or.ddit.widu.store.Store;
import javafx.fxml.FXML;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;

public class PresentController implements Initializable{

	@FXML JFXButton ruby_btn; //메뉴바 루비 상점 이동
	@FXML JFXButton rubypackge_btn; // 메뉴바 루비 패키지 상점 이동
	@FXML JFXButton minihomepibackground_btn; // 메뉴바 미니홈피 배경색 상점 이동
	@FXML JFXButton minihomepimusic_btn; // 메뉴바 미니홈피 배경음악 상점 이동
	@FXML JFXButton nickname_btn; // 닉네임 변경권 상점 이동
	@FXML JFXButton presentsend_btn; // 선물보내기 버튼
	@FXML JFXButton presentreset_btn; // 취소하기 버튼
	@FXML JFXTextField othernickname; // 다른 사용자 닉네임
	@FXML JFXTextArea presentmessage; // 선물 메세지 란
	@FXML JFXCheckBox paymentcommit; // 결제 정보 수집 동의
	@FXML JFXTextField ruby_price; // 루비 가격
	@FXML JFXTextField product_name; // 제품 이름

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	// 루비 상점 이동 버튼 클릭
	@FXML public void rubyclick(ActionEvent event) {
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/rubyshop.fxml"), "루비 상점", null);
	}
	
	// 루비 패키지 상점 이동 버튼 클릭
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

	// 선물보내기 버튼 클릭
	@FXML public void presentsendclick(ActionEvent event) {
		
		// 루비가 부족할 떄
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/rubyresspopup.fxml"), "루비 부족", null);
		
		// 루비가 충분히 있고 선물을 보낼 수 있을 떄
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/presentsend.fxml"), "선물 보내기", null);
		
	}
	// 취소하기 버튼 클릭
	@FXML public void presentresetclick(ActionEvent event) {
		
		// 상점으로 이동
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/shopmain.fxml"), "◀◀◀◀◀ Wid you Shop에 오신걸 환영합니다 ▶▶▶▶▶", null);
	}
	
	

}
