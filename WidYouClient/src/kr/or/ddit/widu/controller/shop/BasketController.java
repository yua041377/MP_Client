package kr.or.ddit.widu.controller.shop;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import kr.or.ddit.widu.store.Store;

public class BasketController implements Initializable{


	
	@FXML JFXButton buy_btn; //구매하기 버튼
	@FXML JFXButton back_btn; // 뒤로가기 버튼
	
	@FXML JFXTextField sumcount; //총 상품 수량
	@FXML JFXTextField sumruby; //총 상품 루비 가격
	@FXML JFXTextField holdruby; // 보유 루비 수
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	// 상품에 대한 수량추가를 클릭했을 때
	@FXML public void addclick(ActionEvent event) {
		
		
	}
	
	// 장바구니에 담은 상품을 삭제했을 떄
	@FXML public void delclick(ActionEvent event) {}
	
	// 구매하기 버튼을 클릭했을 때
	@FXML public void buyclick(ActionEvent event) {
		
		//만약에 루비가 부족하다면
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/rubyresspopup.fxml"), "☆ 루비 부족 ☆", null);
		
		//구매에 성공했다면

		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/buycommit.fxml"), "☆ 구매 성공 ☆", null);
	}
	
	// 뒤로가기 버튼을 클릭했을 때 메인 상점 화면으로 이동
	@FXML public void backclick(ActionEvent event) {
		
		// 메인 상점 화면으로 이동
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/shopmain.fxml"), "◀◀◀◀◀ Wid you Shop에 오신걸 환영합니다 ▶▶▶▶▶ ", null);
		
	}

}
