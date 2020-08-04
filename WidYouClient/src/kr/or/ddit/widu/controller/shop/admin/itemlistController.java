package kr.or.ddit.widu.controller.shop.admin;

import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import kr.or.ddit.widu.service.shop.IShopService;
import kr.or.ddit.widu.store.Store;
import kr.or.ddit.widu.vo.shop.Shop_ItemVO;

public class itemlistController implements Initializable {

	public JFXTextField product_name;
	public JFXTextArea product_detail;
	public JFXTextField ruby_price;
	public JFXButton btn_modify;
	public JFXButton item_close;
	
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
		
		product_name.setText(shopDataManage.itemInfo.getShop_name());
		product_detail.setText(shopDataManage.itemInfo.getShop_detail());
		ruby_price.setText(String.valueOf(shopDataManage.itemInfo.getShop_price()));
		
		// 수정 버튼
		btn_modify.setOnAction(event -> {
			String name = product_name.getText().trim();
			String detail = product_detail.getText().trim();
			String price = ruby_price.getText().trim();
			
			for (int i = 0; i < price.length(); i++) {
				String character = String.valueOf(price.charAt(i));
				
				try {
					int temp = Integer.parseInt(character);
				} catch (Exception e) {
					Store.alertInformation("안내", null, "가격 정보에는 숫자만 입력 가능합니다.");
					return;
				}
			}
			
			if (name.equals("") || detail.equals("") || price.equals("")) {
				Store.alertInformation("안내", null, "비어있는 항목이 있습니다.");
				return;
			}
			
			// 실제 수정 적용 코드!
			Shop_ItemVO itemInfo = new Shop_ItemVO();
			shopDataManage.itemInfo.setShop_name(name);
			shopDataManage.itemInfo.setShop_detail(detail);
			shopDataManage.itemInfo.setShop_price(Integer.parseInt(price));
			
			Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/admin/itemmodifypopup.fxml"), "수정", null);
			
			if (shopDataManage.flag == true) {
				shopDataManage.flag = false;
				Stage stage = (Stage) item_close.getScene().getWindow();
				stage.close();
			}
		});
		
		//닫기 버튼
		item_close.setOnAction(event -> {
			
			Stage stage = (Stage) item_close.getScene().getWindow();
			stage.close(); 
			
		});
		
	}

}
