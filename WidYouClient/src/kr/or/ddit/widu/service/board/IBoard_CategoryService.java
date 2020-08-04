package kr.or.ddit.widu.service.board;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.widu.vo.board.Board_categoryVO;

public interface IBoard_CategoryService extends Remote{
	
	/**
	 * 유저가 사용할수있는 카테고리 정보를 담아오는 메소드
	 * @return 카테고리 테이블에 있는 모든 데이터
	 */
	public List<Board_categoryVO> selectAllUserCate() throws RemoteException;
	
}
