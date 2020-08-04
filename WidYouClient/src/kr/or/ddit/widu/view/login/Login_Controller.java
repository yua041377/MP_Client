package kr.or.ddit.widu.view.login;

import java.io.IOException;
import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import kr.or.ddit.widu.main.LoginSession;
import kr.or.ddit.widu.service.login.ILoginService;
import kr.or.ddit.widu.vo.member.MemberVO;

public class Login_Controller implements Initializable {
	
	@FXML TextField inputID;
	@FXML TextField inputPW;
	@FXML ImageView kakaologin;
	@FXML ImageView naverlogin;
	@FXML Button loginbtn;
	
	boolean chk;
	
	MemberVO mem = new MemberVO();
	
	private MemberVO logMV = new MemberVO();
	
	MemberVO seMV = LoginSession.session;
	private Registry reg;
	private ILoginService login;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		/*
		rmi 부분
		*/
		try {
			reg = LocateRegistry.getRegistry("localhost", 8413);
			login = (ILoginService) reg.lookup("login");
			
			System.out.println("방가방가");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
		
	}

	@FXML public void loginclick(ActionEvent event) {
		
		if(inputID.getText().isEmpty() || inputPW.getText().isEmpty()) {
			errMsg("작업 오류", "아이디 또는 비밀번호가 입력되지 않았습니다");
			
			inputID.clear();
			inputPW.clear();
			
			return;
		}
				
		String mem_id = inputID.getText();
		String mem_pw = inputPW.getText();
		
		MemberVO logMV = new MemberVO();
		logMV.setMem_id(mem_id);
		logMV.setMem_pw(mem_pw);

		try {
			chk = login.memberlogin(logMV);
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			if(chk == true) {
				infoMsg("로그인", "로그인에 성공하셨습니다");
				MemberVO mem = new MemberVO();
				
				try {
					mem = (MemberVO) login.getID(mem_id);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(mem);
				if(mem.getMem_id().equals(inputID.getText())) {
					
					LoginSession.session = mem;
				
					System.out.println("확인 "+LoginSession.session.getMem_id());
				}
				
				
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/kr/or/ddit/widu/main/main.fxml"));
				Parent root = null;
				try {
					root = loader.load();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				Scene scene = new Scene(root);
				Stage mainStage = new Stage();

				
				mainStage.setTitle("나의 운명을 Wid U ~~ ♥");
				mainStage.setScene(scene);
				mainStage.show();
				
				((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
				
			}
			
			else {
				errMsg("작업 오류", "아이디 또는 비밀번호가 다릅니다");
				
				inputID.clear();
				inputPW.clear();
				
				return;
			}
		} 
	@FXML public void joinclick(ActionEvent event) {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/kr/or/ddit/widu/view/join/join.fxml"));
		Parent root = null;
		try {
			root = loader.load();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		Scene scene = new Scene(root);
		Stage joinStage = new Stage();

		
		joinStage.setTitle("나의 운명을 Wid U ~~ ♥");
		joinStage.setScene(scene);
		joinStage.show();
	}

	private void errMsg(String headerText, String msg) {
		Alert errAlert = new Alert(AlertType.ERROR);
		errAlert.setTitle("오류");
		errAlert.setHeaderText(headerText);
		errAlert.setContentText(msg);
		errAlert.showAndWait();
	}
	
	private void infoMsg(String headerText, String msg) {
		Alert infoAlert = new Alert(AlertType.INFORMATION);
		infoAlert.setTitle("정보 확인");
		infoAlert.setHeaderText(headerText);
		infoAlert.setContentText(msg);
		infoAlert.showAndWait();
	}


	
}