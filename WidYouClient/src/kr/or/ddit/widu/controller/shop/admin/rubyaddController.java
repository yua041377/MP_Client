package kr.or.ddit.widu.controller.shop.admin;

import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.fxml.Initializable;
import javafx.stage.Stage;
import kr.or.ddit.widu.service.shop.IShopService;
import kr.or.ddit.widu.store.Store;
import kr.or.ddit.widu.vo.shop.Shop_RubbyVO;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class rubyaddController implements Initializable{

 public JFXTextField product_name;
 public JFXTextField ruby_price;
 public JFXButton item_add;
 public JFXButton item_close;
 public JFXTextField ruby_count;
	
 private IShopService service;
 private Registry reg;
@FXML ImageView picture;
@FXML JFXButton picture_upload;
 
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
				item_add.setOnAction(event -> {
					
					String price = ruby_price.getText();
					for (int i = 0; i < price.length(); i++) {
						String character = String.valueOf(price.charAt(i));
						
						try {
							int temp = Integer.parseInt(character);
						} catch (Exception e) {
							Store.alertInformation("안내", null, "가격 정보에는 숫자만 입력 가능합니다.");
							return;
						}
					}
					
					String count= ruby_count.getText();
					for (int i = 0; i < price.length(); i++) {
						String character = String.valueOf(price.charAt(i));
						
						try {
							int temp = Integer.parseInt(character);
						} catch (Exception e) {
							Store.alertInformation("안내", null, "루비 개수는 숫자만 입력 가능합니다.");
							return;
						}
					}
					
					
					try {
						Shop_RubbyVO itemInfo = new Shop_RubbyVO();
						itemInfo.setRubby_name(product_name.getText());
						itemInfo.setRubby_count(Integer.parseInt(ruby_count.getText()));
						itemInfo.setRubby_price(Integer.parseInt(ruby_price.getText()));
						
						shopDataManage.itemInfo_1 = itemInfo;
					} catch (Exception e) {
						Store.alertInformation("안내", null, "빈 항목이 있습니다.");
						return;
					}
					
					Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/admin/rubyaddpopup.fxml"), "추가", null);
					
					if (shopDataManage.flag == true) {
						shopDataManage.flag = false;
						Stage stage = (Stage) item_close.getScene().getWindow();
						stage.close();
					}
				});
				
				// 닫기 버튼
				item_close.setOnAction(event -> {
					Stage stage = (Stage) item_close.getScene().getWindow();
					stage.close();
				});
		
		
}
}
