package kr.or.ddit.widu.controller.shop.admin;

import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.Initializable;
import javafx.stage.Stage;
import kr.or.ddit.widu.service.shop.IShopService;
import kr.or.ddit.widu.store.Store;

public class itemaddpopupController implements Initializable {
	public JFXButton add_btn;
	public JFXButton reset_btn;
	
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
		
		// 추가 버튼
		add_btn.setOnAction(event -> {
			try {
				int chk = service.insertItem(shopDataManage.itemInfo);
				
				if (chk == 1) {
					Store.alertInformation("안내", null, "아이템이 정상적으로 등록되었습니다.");
					shopDataManage.flag = true;
				} else {
					Store.alertInformation("안내", null, "아이템 등록에 실패했습니다.");
					shopDataManage.flag = false;
				}
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			
			Stage stage = (Stage) reset_btn.getScene().getWindow();
			stage.close();
		});
		
		// 취소 버튼
		reset_btn.setOnAction(event -> {
			Stage stage = (Stage) reset_btn.getScene().getWindow();
			stage.close();
		});
		
	}

}
