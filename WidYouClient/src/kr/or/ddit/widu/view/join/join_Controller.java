package kr.or.ddit.widu.view.join;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import kr.or.ddit.widu.service.join.IJoinService;
import kr.or.ddit.widu.vo.member.MemberVO;
import kr.or.ddit.widu.vo.photo.PhotoInfoVO;

public class join_Controller implements Initializable {
	
	private Registry reg;
	private IJoinService join;
	
	@FXML TextField id;
	@FXML TextField pw;
	@FXML TextField pwc;
	@FXML TextField name;
	@FXML TextField nick;
	@FXML ToggleGroup gender;
	@FXML TextField birth;
	@FXML TextField height;
	@FXML TextField weight;
	@FXML ToggleGroup smokeTF;
	@FXML ToggleGroup drinkTF;
	@FXML TextField religion;
	@FXML TextField pnum;
	@FXML TextField email;
	@FXML TextField photo;
	@FXML ComboBox locationbox;
	@FXML ComboBox jobbox;
	@FXML ImageView insertphoto;
	
	private ObservableList<String> loclist = 
			FXCollections.observableArrayList("수도권/경기", "충청권/대전", "강원도", "경남권/부산/대구", "전라권/광주");
	private ObservableList<String> joblist = 
			FXCollections.observableArrayList("의회의원/고위임직원 및 관리자", "전문가", "기술공 및 준전문가", "사무종사자", "판매종사자", 
					             "농업,임업 및 어업 숙련 종사자", "기능원 및 관련 기능 종사자", "장치, 기계조작 및 조립 종사자", "단순노무 종사자");

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		try {
			reg = LocateRegistry.getRegistry("localhost", 8413);
			join = (IJoinService) reg.lookup("join");
			
			System.out.println("방가방가");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
		locationbox.setItems(loclist);
		locationbox.setValue(loclist.get(0));
				
		jobbox.setItems(joblist);
		jobbox.setValue(joblist.get(0));
	}

	@FXML public void btnclick(ActionEvent event) {
		
		String mem_id = id.getText();
		String mem_pw = pw.getText();
		String mem_name = name.getText();
		String mem_nick = nick.getText();
		String mem_gender = (String) gender.getSelectedToggle().getUserData();
		String mem_birth = birth.getText();
		String mem_location = locationbox.getSelectionModel().getSelectedItem().toString();
		String mem_job = jobbox.getSelectionModel().getSelectedItem().toString();
		int mem_height = Integer.parseInt(height.getText());
		int mem_weight = Integer.parseInt(weight.getText());
		String mem_smoke = (String) smokeTF.getSelectedToggle().getUserData();
		String mem_drink = (String) drinkTF.getSelectedToggle().getUserData();
		String mem_religion = religion.getText();
		String mem_pnum = pnum.getText();
		String mem_email = email.getText();
//		String mem_photo = insertphoto.get
		
		MemberVO joinMV = new MemberVO();
		
		joinMV.setMem_id(mem_id);
		joinMV.setMem_pw(mem_pw);
		joinMV.setMem_name(mem_name);
		joinMV.setMem_nick(mem_nick);
		joinMV.setMem_gender(mem_gender);
		joinMV.setMem_birth(mem_birth);
		joinMV.setMem_height(mem_height);
		joinMV.setMem_location(mem_location);
		joinMV.setMem_job(mem_job);
		joinMV.setMem_weight(mem_weight);
		joinMV.setMem_smoke(mem_smoke);
		joinMV.setMem_drink(mem_drink);
		joinMV.setMem_religion(mem_religion);
		joinMV.setMem_hp(mem_pnum);
		joinMV.setMem_email(mem_email);
//		joinMV.setMem_picture(mem_photo);
		
		int cnt = 0;
		
		try {
			cnt = join.insertMember(joinMV);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(cnt > 0) {
			infoMsg("회원가입", "회원가입 완료!!");
		}
		else {
			errMsg("오류", "회원가입에 실패했습니다");
			
			return;
		}
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

	@FXML public void photoBtnClick(ActionEvent event) {
				
		FileChooser fc = new FileChooser();
		fc.setTitle("이미지 선택");
		fc.setInitialDirectory(new File("C:/"));
		
		ExtensionFilter imgType = new ExtensionFilter("image file", "*.jpg", "*.gif", "*.png");
		ExtensionFilter txtType = new ExtensionFilter("text file", "*.txt", "*.doc");
        fc.getExtensionFilters().addAll(imgType, txtType);
        
        File selectedFile =  fc.showOpenDialog(null); 
        System.out.println(selectedFile);             

//        File[] files = new File[1];
//        files[0] = new File(selectedFile);
//        
//        PhotoInfoVO[] fInfos = new PhotoInfoVO[files.length];

        try {
		// 파일 읽어오기
		FileInputStream fis = new FileInputStream(selectedFile);
		BufferedInputStream bis = new BufferedInputStream(fis);
		// 이미지 생성하기
		Image img = new Image(bis);
		// 이미지 띄우기
		insertphoto.setImage(img);
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		}

	}
	

}
