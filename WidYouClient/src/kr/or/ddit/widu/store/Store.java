package kr.or.ddit.widu.store;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;

public class Store {

    /**
     * 새로운 FXML 띄울 때 사용하는 메소드
     * @param loc : FXML 경로를 입력 ex) getClass().getResource("/controller/example.fxml")
     * @param title : FXML 제목을 입력
     * @param parentStage : 부모 Stage를 입력 (없으면 null)
     */
    public static void newWindow(URL loc, String title, Stage parentStage) {
        Object controller = null;
        try {
            FXMLLoader loader = new FXMLLoader(loc);
            Parent root = loader.load();
            controller = loader.getController();
            Stage stage = null;
            if (parentStage != null) {
                stage = parentStage;
            }else {
                stage = new Stage();
            }
            stage.setTitle(title);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 새로운 FXML 띄울 때 사용하는 메소드(Modal)
     * @param loc : FXML 경로를 입력 ex) getClass().getResource("/controller/example.fxml")
     * @param title : FXML 제목을 입력
     * @param parentStage : 부모 Stage를 입력 (없으면 null)
     */
    public static void newWindow_Modal(URL loc, String title, Stage parentStage) {
        Object controller = null;
        try {
            FXMLLoader loader = new FXMLLoader(loc);
            Parent root = loader.load();
            controller = loader.getController();
            Stage stage = null;
            if (parentStage != null) {
                stage = parentStage;
            }else {
                stage = new Stage();
            }

            stage.setTitle(title);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root));
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   /* public static Object newWindow_change(URL loc, String title, Stage parentState) {

    }*/


    public static void newWindow_Modal_withoutBar(URL loc, String title, Stage parentStage) {
        Object controller = null;
        try {
            FXMLLoader loader = new FXMLLoader(loc);
            Parent root = loader.load();
            controller = loader.getController();
            Stage stage = null;
            if (parentStage != null) {
                stage = parentStage;
            }else {
                stage = new Stage();
            }

            stage.setTitle(title);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.setScene(new Scene(root));
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    // ---------------------------------------------------------------------------------------------------- //
    // [ Alert ]

    /**
     * INFORMATION Alert창 띄울 때 사용하는 메소드
     * @param title : 제목을 입력
     * @param header : headerText를 입력
     * @param content : contentText를 입력
     */
    public static void alertInformation(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

    /**
     * CONFIRMATION Alert창 띄울 때 사용하는 메소드
     * @param title : 제목을 입력
     * @param header : headerText를 입력
     * @param content : contentText를 입력
     */
    public static void alertConfirm(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

    /**
     * WARNING Alert창 띄울 때 사용하는 메소드
     * @param title : 제목을 입력
     * @param header : headerText를 입력
     * @param content : contentText를 입력
     */
    public static void alertWarning(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

    /**
     * ERROR Alert창 띄울 때 사용하는 메소드
     * @param title : 제목을 입력
     * @param header : headerText를 입력
     * @param content : contentText를 입력
     */
    public static void alertError(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

}
