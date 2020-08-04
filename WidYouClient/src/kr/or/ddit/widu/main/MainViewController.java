package kr.or.ddit.widu.main;

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
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.image.ImageView;
import kr.or.ddit.widu.service.board.IBoardService;
import kr.or.ddit.widu.vo.board.BoardVO;

public class MainViewController implements Initializable{
	
	
	
	

	@FXML TableView<BoardVO> board_table_view;
	@FXML TableColumn<BoardVO, Integer> board_id;
	@FXML TableColumn<BoardVO, String> board_title;
	@FXML TableColumn<BoardVO, String> board_writer;
	@FXML Label wordcloud;
	@FXML Pagination paging;
	@FXML Label news_title;
	@FXML ImageView event_image;

	private List<BoardVO> list;
	private Registry reg;
	private IBoardService boardService;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		try {
			reg = LocateRegistry.getRegistry("localhost", 8413);
			
			boardService = (IBoardService) reg.lookup("boardService");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
		
		board_id.setCellValueFactory(new PropertyValueFactory<>("board_id"));
		board_title.setCellValueFactory(new PropertyValueFactory<>("board_title"));
		board_writer.setCellValueFactory(new PropertyValueFactory<>("board_writer"));
		
		try {
			list = boardService.selectAllBoard();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ObservableList<BoardVO> oblist = FXCollections.observableArrayList(list);
		
		board_table_view.setItems(oblist);
		
	}

}
















