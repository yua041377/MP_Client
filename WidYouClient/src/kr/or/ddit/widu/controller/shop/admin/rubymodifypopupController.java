package kr.or.ddit.widu.controller.shop.admin;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import kr.or.ddit.widu.service.shop.IShopService;
import kr.or.ddit.widu.store.Store;

import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

public class rubymodifypopupController implements Initializable{

	@FXML JFXButton modify_btn;
	@FXML JFXButton reset_btn;
	
	
	private IShopService service;
	private Registry reg;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		try {
			reg = LocateRegistry.getRegistry("localhost",8413);
			
			service = (IShopService) reg.lookup("shopService");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
		// 수정 버튼!
		modify_btn.setOnAction(event -> {
			try {
				int chk = service.rubymodifyItem(shopDataManage.itemInfo_1);
				
				if (chk > 0) {
					Store.alertInformation("안내", null, "정상적으로 수정되었습니다.");
					shopDataManage.flag = true;
				} else {
					Store.alertInformation("안내", null, "수정에 실패했습니다.");
					shopDataManage.flag = false;
				}
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			
			Stage stage = (Stage) modify_btn.getScene().getWindow();
			stage.close();
		});
		
		
		// 취소 버튼!
		reset_btn.setOnAction(event -> {
			Stage stage = (Stage) modify_btn.getScene().getWindow();
			stage.close();
		});
		
	}

}
