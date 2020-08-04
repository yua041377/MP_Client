package kr.or.ddit.widu.controller.shop;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import kr.or.ddit.widu.store.Store;
import javafx.fxml.FXML;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;

public class PayMentCommitController implements Initializable{
	
	
	
	@FXML JFXButton pay_btn; //결제하기 버튼 클릭
	@FXML JFXButton reset_btn; //취소하기 버튼 클릭

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

	
	// 취소하기 버튼 클릭했을 때
	@FXML public void resetclick(ActionEvent event) {
		
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/shopmain.fxml"), "◀◀◀◀◀ Wid you Shop에 오신걸 환영합니다 ▶▶▶▶▶", null);
		
	}


	// 결제하기 버튼 클릭했을 때
	@FXML public void payclick(ActionEvent event) {
		//결제 완료 창
		Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/paymentcomplete.fxml"), "결제 완료", null);
	}

}
