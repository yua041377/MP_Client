package kr.or.ddit.widu.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.FocusModel;
import javafx.stage.Stage;

public class WidUClientMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("나의 운명을 Wid U");
		primaryStage.setScene(scene);
		primaryStage.show();
		 
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
