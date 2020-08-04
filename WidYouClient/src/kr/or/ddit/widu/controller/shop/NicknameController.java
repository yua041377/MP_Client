package kr.or.ddit.widu.controller.shop;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import kr.or.ddit.widu.store.Store;
import javafx.fxml.FXML;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;

public class NicknameController implements Initializable{

	
	
	@FXML JFXButton ruby_btn; // 메뉴바 루비 버튼 클릭
	@FXML JFXButton rubypackge_btn; // 메뉴바 루비 패키지 버튼 클릭
	@FXML JFXButton minihomepibackground_btn; // 메뉴바 미니홈피 배경색 클릭
	@FXML JFXButton minihomepimusic_btn; // 메뉴바 미니홈피 배경음악 클릭
	@FXML JFXButton nickname_btn; //메뉴바 닉네임 변경권 클릭
	@FXML JFXButton cart_1; //상품 1에 대한 장바구니 담기
	@FXML JFXButton present_1; // 상품 1에 대한 선물보내기
	@FXML JFXButton cart_2; //상품 2에 대한 장바구니 담기
	@FXML JFXButton present_2; // 상품 2에 대한 선물보내기
	@FXML JFXButton cart_3; //상품 3에 대한 장바구니 담기
	@FXML JFXButton present_3; // 상품 3에 대한 선물보내기
	@FXML JFXTextField ruby_price1; // 상품 1에 대한 루비 가격
	@FXML JFXTextField ruby_price2; // 상품 2에 대한 루비 가격
	@FXML JFXTextField ruby_price3; // 상품 3에 대한 루비 가격
	@FXML JFXTextField product_name1; // 상품1에 대한 상품 이름
	@FXML JFXTextField product_name2; // 상품2에 대한 상품 이름
	@FXML JFXTextField product_name3; // 상품3에 대한 상품 이름
	

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
	@FXML public void backgroundclick(ActionEvent event) {}
	// 미니홈피 배경 음악 상점 이동 버튼 클릭
	@FXML public void musicclick(ActionEvent event) {
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/minihomepimusicshop.fxml"), "미니홈피 배경음악 상점", null);
		
	}
	// 닉네임 변경권 상점 이동 버튼 클릭
	@FXML public void nicknameclick(ActionEvent event) {
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/nicknameshop.fxml"), "닉네임 변경권 상점", null);
		
	}
	// 상품 1에 대한 장바구니 이동
	@FXML public void cart_1click(ActionEvent event) {
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/basket.fxml"), "♡ Wid you 장바구니♡", null);
	}
	// 상품 1에 대한 선물보내기 이동
	@FXML public void present_1click(ActionEvent event) {
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/presentshop.fxml"), "♡ Wid you 선물보내기♡", null);
	}
	// 상품 2에 대한 장바구니 이동
	@FXML public void cart_2click(ActionEvent event) {
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/basket.fxml"), "♡ Wid you 장바구니♡", null);
	}
	// 상품 2에 대한 선물보내기 이동
	@FXML public void present_2click(ActionEvent event) {
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/presentshop.fxml"), "♡ Wid you 선물보내기♡", null);
	}
	// 상품 3에 대한 장바구니 이동
	@FXML public void cart_3click(ActionEvent event) {
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/basket.fxml"), "♡ Wid you 장바구니♡", null);
	}
	// 상품 3에 대한 선물보내기 이동
	@FXML public void present_3click(ActionEvent event) {
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/presentshop.fxml"), "♡ Wid you 선물보내기♡", null);
	}

}
