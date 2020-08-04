package kr.or.ddit.widu.service.join;

import java.rmi.Remote;
import java.rmi.RemoteException;

import kr.or.ddit.widu.vo.member.MemberVO;

public interface IJoinService extends Remote {
	
	public int insertMember (MemberVO mv) throws RemoteException;
}
