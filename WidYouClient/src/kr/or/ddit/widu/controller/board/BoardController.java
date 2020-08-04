package kr.or.ddit.widu.controller.board;

import java.io.IOException;
import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import kr.or.ddit.widu.main.LoginSession;
import kr.or.ddit.widu.service.board.IBoardService;
import kr.or.ddit.widu.util.Store;
import kr.or.ddit.widu.vo.board.BoardVO;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Pagination;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class BoardController implements Initializable{

	@FXML ImageView boardImg;
	@FXML Label boardTitle;
	@FXML Button boardStart;
	@FXML Pagination board;
	@FXML TableView<BoardVO> boardList;
	@FXML TableColumn<BoardVO, Integer> boardTableNo;
	@FXML TableColumn<BoardVO, String> boardTableTilte;
	@FXML TableColumn<BoardVO, String> boardTableID;
	@FXML TableColumn<BoardVO, String> boardTableDate;
	@FXML ComboBox<String> combo;
	@FXML Button boardSearch;
	@FXML TextField boardSerchText;
	
	private IBoardService service;
	private Registry reg;
	
	private Stage primaryStage;
	
	private ObservableList<BoardVO> obblist;
	private ObservableList<String> comlist;

	
	public void setAllObblist(List<BoardVO> board) {
		obblist.setAll(board);
	}
	
	public Stage setStage(Stage primaryStage) {
		return this.primaryStage = primaryStage;
	}
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		try {
			reg = LocateRegistry.getRegistry("localhost",8413);
			
			service = (IBoardService) reg.lookup("boardService");
			
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
		boardTableNo.setCellValueFactory(new PropertyValueFactory<>("board_id"));
		boardTableTilte.setCellValueFactory(new PropertyValueFactory<>("board_title"));
		boardTableID.setCellValueFactory(new PropertyValueFactory<>("board_writer"));
		boardTableDate.setCellValueFactory(new PropertyValueFactory<>("board_date"));
		int category_id = LoginSession.boardCategory;
		List<BoardVO> list = null;
		try {
			list = service.selectOderByBoard(category_id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list);
		obblist = FXCollections.observableArrayList(list);
		
		boardList.setItems(obblist);
		
		comlist = FXCollections.observableArrayList(
				"게시글 번호", "제목", "작성자" 
				);
		combo.setItems(comlist);
		combo.setValue(comlist.get(0));	
		
		if(LoginSession.boardCategory == 1) {
			boardTitle.setText("공지사항");
		}
		else if(LoginSession.boardCategory == 2) {
			boardTitle.setText("이벤트게시판");
		}
		else if(LoginSession.boardCategory == 3) {
			boardTitle.setText("자유게시판");
		}
		else if(LoginSession.boardCategory == 4) {
			boardTitle.setText("연애팁게시판");
		}
		else if(LoginSession.boardCategory == 5) {
			boardTitle.setText("친구만들기 게시판");
		}
		else if(LoginSession.boardCategory == 6) {
			boardTitle.setText("지역게시판");
		}
		else if(LoginSession.boardCategory == 7) {
			boardTitle.setText("Look for Love 게시판");
		}
		else if(LoginSession.boardCategory == 8) {
			boardTitle.setText("리뷰게시판");
		}
		else if(LoginSession.boardCategory == 11) {
			boardTitle.setText("관심분야게시판");
		}
	}

	
	
	@FXML public void insertBtnClicked(ActionEvent event) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/kr/or/ddit/widu/view/board/board1.fxml"));
		Parent insertBoard = null;
		
		try {
			insertBoard = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		LoginSession.maincon.borderPane.setCenter(insertBoard);
		/*
		Stage childStage = new Stage(StageStyle.UTILITY);
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/main/board1.fxml"));
		Parent root = null;
		
		
		try {
			root = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		WriteBoardController wbc = loader.getController();
		wbc.setCon(this);
		
		Scene scene = new Scene(root);
		
		childStage.setTitle("게시판 작성하기");
		childStage.setScene(scene);
		childStage.initOwner(primaryStage);
		childStage.initModality(Modality.APPLICATION_MODAL);
		childStage.show();
		*/
		
		
		
	}

	
	
	
	@FXML public void clickBoard(MouseEvent event) {

		Stage showBoard = new Stage(StageStyle.UTILITY);
		
		LoginSession.boardID = boardList.getSelectionModel().getSelectedItem().getBoard_id();
		
		Store.connectMain(getClass().getResource("/kr/or/ddit/widu/view/board/board2.fxml"));
		
	}

}
