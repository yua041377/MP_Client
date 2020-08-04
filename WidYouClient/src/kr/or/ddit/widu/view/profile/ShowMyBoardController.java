package kr.or.ddit.widu.view.profile;

import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import kr.or.ddit.widu.main.LoginSession;
import kr.or.ddit.widu.service.board.IBoardService;
import kr.or.ddit.widu.service.board.IBoard_CategoryService;
import kr.or.ddit.widu.util.Store;
import kr.or.ddit.widu.vo.board.BoardVO;
import kr.or.ddit.widu.vo.board.Board_categoryVO;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.StringConverter;
import javafx.event.ActionEvent;

public class ShowMyBoardController implements Initializable{
	
	@FXML Tab board_tab;
	@FXML TableView<BoardVO> board_tableview;
	@FXML TableColumn<BoardVO, Integer> board_id;
	@FXML TableColumn<BoardVO, String> board_title;
	@FXML TableColumn<BoardVO, String> board_writer;
	@FXML TableColumn<BoardVO, String> board_date;
	@FXML ComboBox<Board_categoryVO> board_combox;
	@FXML Tab comment_tab;
	@FXML ImageView closed_btn;
	
	private Registry reg;
	private IBoardService board;
	private IBoard_CategoryService board_cate;
	private ObservableList<Board_categoryVO> cateoblist;
	private List<BoardVO> list;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		try {
			reg = LocateRegistry.getRegistry("localhost", 8413);
			
			board = (IBoardService) reg.lookup("boardService");
			board_cate = (IBoard_CategoryService) reg.lookup("board_CategoryService");
			
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
		
		board_id.setCellValueFactory(new PropertyValueFactory<>("board_id"));
		board_title.setCellValueFactory(new PropertyValueFactory<>("board_title"));
		board_writer.setCellValueFactory(new PropertyValueFactory<>("board_writer"));
		board_date.setCellValueFactory(new PropertyValueFactory<>("board_date"));
		
		
		try {
			list = board.selectMyBoard(LoginSession.session.getMem_id());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		ObservableList<BoardVO> oblist = FXCollections.observableArrayList(list);
		board_tableview.setItems(oblist);
		
		List<Board_categoryVO> cateList = null;
		try {
			cateList = board_cate.selectAllUserCate();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		cateoblist = FXCollections.observableArrayList(cateList);
		
		board_combox.setItems(cateoblist);
		board_combox.setValue(cateoblist.get(0));
		
		board_combox.setCellFactory(new Callback<ListView<Board_categoryVO>, ListCell<Board_categoryVO>>() {
			
			@Override
			public ListCell<Board_categoryVO> call(ListView<Board_categoryVO> param) {
				return new ListCell<Board_categoryVO>() {
					
					@Override
					protected void updateItem(Board_categoryVO cate, boolean empty) {
						super.updateItem(cate, empty);
						if(cate == null || empty) {
							setText(null);
						}else {
							setText(cate.getCategory_name());
						}
					}
				};
			}
		});
		
		board_combox.setConverter(new StringConverter<Board_categoryVO>() {
			@Override
			public String toString(Board_categoryVO object) {
				if(object == null) {
					return null;
				}else {
					return object.getCategory_name();
				}
			}
			@Override
			public Board_categoryVO fromString(String string) {
				return null;
			}
		});
		
		
	}


	@FXML public void closed_btnClicked(MouseEvent event) {
		
		//((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
		
		Store.closedWindow(event);
		Store.show_new_window(getClass().getResource("/kr/or/ddit/widu/view/profile/profile.fxml"), "마이페이지");
	}


	@FXML public void board_comboxClicked(ActionEvent event) {
		if(board_combox.getValue().getCategory_id() == 0) {
			try {
				list = board.selectMyBoard(LoginSession.session.getMem_id());
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			
			ObservableList<BoardVO> oblist = FXCollections.observableArrayList(list);
			board_tableview.setItems(oblist);
		}
		else {
			int cate_id = board_combox.getValue().getCategory_id();
			String name = LoginSession.session.getMem_id();
			BoardVO boardVo = new BoardVO();
			boardVo.setCategory_id(cate_id);
			boardVo.setBoard_writer(name);
			
			List<BoardVO> blist = null;
			try {
				blist = board.selectMyBoardBycate(boardVo);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			ObservableList<BoardVO> oblist = FXCollections.observableArrayList(list);
			board_tableview.setItems(oblist);
		}
		
	}
	

}














