package kr.or.ddit.widu.controller.shop.admin;

import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.stage.Stage;
import kr.or.ddit.widu.service.shop.IShopService;
import kr.or.ddit.widu.store.Store;
import javafx.fxml.FXML;
import com.jfoenix.controls.JFXButton;

public class itemdeletepopupController implements Initializable {

	@FXML JFXButton del_btn;
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
		
		// 삭제 버튼!
		del_btn.setOnAction(event -> {
			Map<String, String> params = new HashMap<String, String>();
			params.put("shop_id", String.valueOf(shopDataManage.itemInfo.getShop_id()));
			
			try {
				int chk = service.deleteItem(params);
				
				if (chk > 0) {
					Store.alertInformation("안내", null, "정상적으로 삭제되었습니다.");
				} else {
					Store.alertInformation("안내", null, "삭제에 실패했습니다.");
				}
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			
			Stage stage = (Stage) del_btn.getScene().getWindow();
			stage.close();
		});
		
		// 취소 버튼!
		reset_btn.setOnAction(event -> {
			Stage stage = (Stage) del_btn.getScene().getWindow();
			stage.close();
		});
	}

}
