package kr.or.ddit.widu.controller.shop.admin;

import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import kr.or.ddit.widu.service.shop.IShopService;
import kr.or.ddit.widu.store.Store;
import kr.or.ddit.widu.vo.shop.Shop_ItemVO;
import kr.or.ddit.widu.vo.shop.Shop_RubbyVO;

public class ShopMainAdminController implements Initializable {

	public TabPane tab_pane;
	public Tab shop_item;
	public TableView<Shop_ItemVO> item_tableview;
	public TableColumn<Shop_ItemVO, Integer> item_num;
	public TableColumn<Shop_ItemVO, String> item_productname;
	public TableColumn<Shop_ItemVO, String> item_productcontent;
	public TableColumn<Shop_ItemVO, Integer> item_rubyprice;
	public Tab shop_ruby;
	public TableView<Shop_RubbyVO> ruby_tableview;
	public TableColumn<Shop_RubbyVO, Integer> ruby_num;
	public TableColumn<Shop_RubbyVO, String> ruby_productname;
	public TableColumn<Shop_RubbyVO, Integer> ruby_rubycount;
	public TableColumn<Shop_RubbyVO, Integer> ruby_rubyprice;
	public ComboBox<String> shop_combobox;
	public JFXTextField shop_content_input;
	public JFXButton shop_select;
	public JFXButton shop_add;
	public JFXButton shop_delete;

	private IShopService service;
	private Registry reg;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			reg = LocateRegistry.getRegistry("localhost", 8413);

			service = (IShopService) reg.lookup("shopService");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}

		Map<String, String> param = new HashMap<String, String>();
		update(param);
		
		tab_pane.getSelectionModel().selectedItemProperty().addListener(
			    new ChangeListener<Tab>() {
			        @Override
			        public void changed(ObservableValue<? extends Tab> ov, Tab t, Tab t1) {
			        	Map<String, String> params = new HashMap<String, String>();
			        	update(params);
			        }
			    }
			);
		
		shop_combobox.setPromptText("카테고리");
		ObservableList<String> ob_comboList = FXCollections.observableArrayList("이름", "가격");
		shop_combobox.setItems(ob_comboList);

		// 추가 버튼 이벤트
		
		shop_add.setOnAction(event -> {
			
			//아이템 추가
			if(tab_pane.getSelectionModel().getSelectedIndex() == 0) {
				
			Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/admin/itemadd.fxml"), "추가", null);
			Map<String, String> params = new HashMap<String, String>();
			update(params);
			
			}
			//루비 추가
			else {
			Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/admin/rubyadd.fxml"), "추가", null);
			Map<String, String> params = new HashMap<String, String>();
			update(params);
				
			}
		});

		// 목록 출력 이벤트
		item_tableview.setOnMouseClicked(event -> {
			
			if (event.getClickCount() > 1) {
				Shop_ItemVO itemInfo = item_tableview.getSelectionModel().getSelectedItem();
				
				if (itemInfo == null) {
					return;
				}
				
				shopDataManage.itemInfo = itemInfo;

				Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/admin/itemlist.fxml"), "목록보여주기",
						null);
				
				Map<String, String> params = new HashMap<String, String>();
				update(params);
			}
		});
		
		//루비 목록 보여주기
		ruby_tableview.setOnMouseClicked(event -> {
			if (event.getClickCount() > 1) {
				Shop_RubbyVO itemInfo = ruby_tableview.getSelectionModel().getSelectedItem();
				
				if (itemInfo == null) {
					return;
				}
				
				shopDataManage.itemInfo_1 = itemInfo;

				Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/admin/rubymodify.fxml"), "목록보여주기",
						null);
				
				Map<String, String> params = new HashMap<String, String>();
				update(params);
			}
		});
		
		// 삭제 버튼!
		shop_delete.setOnAction(event -> {
			if(tab_pane.getSelectionModel().getSelectedIndex() == 0) {
				Shop_ItemVO itemInfo = item_tableview.getSelectionModel().getSelectedItem();
				
				if (itemInfo == null) {
					return;
				}
				shopDataManage.itemInfo = itemInfo;
				
				Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/admin/itemdeletepopup.fxml"), "삭제", null);
			} else if (tab_pane.getSelectionModel().getSelectedIndex() == 1) {
				Shop_RubbyVO itemInfo = ruby_tableview.getSelectionModel().getSelectedItem();
				
				if (itemInfo == null) {
					return;
				}
				
				shopDataManage.itemInfo_1 = itemInfo;
				
				Store.newWindow_Modal(getClass().getResource("/kr/or/ddit/widu/view/shop/admin/rubydeletepopup.fxml"), "삭제", null);
			}
			
			Map<String, String> params = new HashMap<String, String>();
			update(params);
		});
		
		// 검색 버튼
		shop_select.setOnAction(event -> {
			String search_keycode = shop_combobox.getValue().trim();
			String search_keyword = shop_content_input.getText().trim();
			
			if (search_keycode == null) {
				Store.alertInformation("안내", null, "카테고리를 선택해주세요!");
				return;
			}
			
			Map<String, String> params = new HashMap<String, String>();
			params.put("search_keycode", search_keycode);
			params.put("search_keyword", search_keyword);
			
			update(params);
		});
	}

	public void update(Map<String, String> params) {
		if(tab_pane.getSelectionModel().getSelectedIndex() == 0) {
			
			item_num.setCellValueFactory(new PropertyValueFactory<>("shop_id"));
			item_productname.setCellValueFactory(new PropertyValueFactory<>("shop_name"));
			item_productcontent.setCellValueFactory(new PropertyValueFactory<>("shop_detail"));
			item_rubyprice.setCellValueFactory(new PropertyValueFactory<>("shop_price"));
			
			List<Shop_ItemVO> list = null;
			try {
				list = service.selectAllItems(params);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			
			ObservableList<Shop_ItemVO> obblist = FXCollections.observableArrayList(list);

			item_tableview.setItems(obblist);
			
			
		}
		
		else {
			
			ruby_num.setCellValueFactory(new PropertyValueFactory<>("rubby_id"));
			ruby_productname.setCellValueFactory(new PropertyValueFactory<>("rubby_name"));
			ruby_rubycount.setCellValueFactory(new PropertyValueFactory<>("rubby_count"));
			ruby_rubyprice.setCellValueFactory(new PropertyValueFactory<>("rubby_price"));
			
			List<Shop_RubbyVO> list = null;
			try {
				list = service.rubyselectallitems(params);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			
			ObservableList<Shop_RubbyVO> obblist = FXCollections.observableArrayList(list);

			ruby_tableview.setItems(obblist);
			
			
		}
		
	}

}
