package kr.or.ddit.widu.controller.shop;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import kr.or.ddit.widu.store.Store;

public class PaymentCompleteController implements Initializable{
	
	

	@FXML JFXButton confirm_btn; //확인 버튼 클릭

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

	// 확인 버튼을 클릭했을 때
	@FXML public void confirmclick(MouseEvent event) {
		// 창을 닫는
		//Stage.close()
		
	}

}
