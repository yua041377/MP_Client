package kr.or.ddit.widu.util;

import java.io.IOException;
import java.net.URL;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kr.or.ddit.widu.main.LoginSession;

public class Store {
	
	/**
	 * 메인화면에 출력해주는 메소드
	 * @param url
	 */
	public static void connectMain(URL url) {
		FXMLLoader loader = new FXMLLoader(url);
		Parent parent = null;
		
		try {
			parent = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		LoginSession.maincon.borderPane.setCenter(parent);
	}
	
	/**
	 * 새로운 화면을 띄우는 메소드
	 * @param url 파일경로
	 * @param title 새로운창의 제목
	 */
	public static void show_new_window(URL url, String title) {
		FXMLLoader loader = new FXMLLoader(url);
		Parent root = null;
		try {
			root = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		Stage mainStage = new Stage();

		
		mainStage.setTitle(title);
		mainStage.setScene(scene);
		mainStage.show();
	}
	
	public static void closedWindow(Event event) {
		((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
	}
	
}
