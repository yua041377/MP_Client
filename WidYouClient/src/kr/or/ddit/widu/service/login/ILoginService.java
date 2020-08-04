package kr.or.ddit.widu.service.login;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.widu.vo.member.MemberVO;

public interface ILoginService extends Remote {
	
	public boolean memberlogin(MemberVO mv) throws RemoteException;
	
	public MemberVO getID(String mem_id) throws RemoteException;

}
