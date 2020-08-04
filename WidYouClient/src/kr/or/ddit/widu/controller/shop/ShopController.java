package kr.or.ddit.widu.controller.shop;

import java.io.IOException;
import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import kr.or.ddit.widu.service.board.IBoardService;
import kr.or.ddit.widu.service.shop.IShopService;
import kr.or.ddit.widu.store.Store;
import kr.or.ddit.widu.vo.shop.Shop_ItemVO;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

public class ShopController implements Initializable{
	
	@FXML VBox recent_product_box;
	@FXML HBox new_box;
	@FXML HBox popular_box;
	
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
		
		// 신상품 정보 조회
		List<Shop_ItemVO> newItemList = null;
		try {
			newItemList = service.newItemList();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		List<Shop_ItemVO> popularList = null;
		try {
			popularList = service.popularItemList();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		// 신상품 출력!
		for (int i = 0; i < newItemList.size(); i++) {
			if (i < 4) {
				Image image = new Image("/shop/" + newItemList.get(i).getShop_picture());
				
				VBox box = new VBox();
				ImageView imageView = new ImageView();
				imageView.setImage(image);
				
				Label tf_name = new Label();
				Label tf_price = new Label();
				tf_name.setText("이름 : " + newItemList.get(i).getShop_name());
				tf_price.setText("가격 : " + String.valueOf(newItemList.get(i).getShop_price()));
				
				HBox buttonBox = new HBox();
				JFXButton btn_addCart = new JFXButton();
				JFXButton btn_present = new JFXButton();
				
				btn_addCart.setText("담기");
				btn_present.setText("선물하기");
				
				buttonBox.getChildren().addAll(btn_addCart, btn_present);
				
				box.getChildren().addAll(imageView, tf_name, tf_price, buttonBox);
				
				new_box.getChildren().add(box);
			}
		}
		
		// 인기 상품 출력!
		for (int i = 0; i < popularList.size(); i++) {
			if (i < 4) {
				Map<String, String> params = new HashMap<String, String>();
				params.put("shop_id", String.valueOf(popularList.get(i).getShop_id()));
				
				Shop_ItemVO itemInfo = null;
				try {
					itemInfo = service.itemInfo(params);
				} catch (RemoteException e) {
					e.printStackTrace();
				}
				
				System.out.println(itemInfo);
				
				Image image = new Image("/shop/" + itemInfo.getShop_picture());
				
				VBox box = new VBox();
				ImageView imageView = new ImageView();
				imageView.setImage(image);
				
				Label tf_name = new Label();
				Label tf_price = new Label();
				tf_name.setText("이름 : " + itemInfo.getShop_name());
				tf_price.setText("가격 : " + itemInfo.getShop_price());
				
				HBox buttonBox = new HBox();
				JFXButton btn_addCart = new JFXButton();
				JFXButton btn_present = new JFXButton();
				
				btn_addCart.setText("담기");
				btn_present.setText("선물하기");
				
				buttonBox.getChildren().addAll(btn_addCart, btn_present);
				
				box.getChildren().addAll(imageView, tf_name, tf_price, buttonBox);
				
				popular_box.getChildren().add(box);
			}
		}
	}

}
