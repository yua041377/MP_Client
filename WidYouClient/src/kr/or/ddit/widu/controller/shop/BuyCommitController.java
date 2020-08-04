package kr.or.ddit.widu.controller.shop;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import kr.or.ddit.widu.store.Store;
import javafx.fxml.FXML;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;

public class BuyCommitController implements Initializable{

	@FXML JFXButton items_btn; //아이템 보관함 버튼 클릭
	@FXML JFXButton back_btn; // 뒤로가기 버튼 클릭

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

	// 아이템 보관함 클릭 이동
	@FXML public void itemsclick(ActionEvent event) {
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/아이템보관함 fxml"), "아이템 보관함", null);
		
	}

	// 뒤로가기 버튼 클릭 이동
	@FXML public void backclick(ActionEvent event) {
		// 상점 메인 화면 이동
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/shopmain.fxml"), "◀◀◀◀◀ Wid you Shop에 오신걸 환영합니다 ▶▶▶▶▶", null);
		
	}
	
	

}
