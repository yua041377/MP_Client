package kr.or.ddit.widu.service.board;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.widu.vo.board.BoardVO;

public interface IBoardService extends Remote{


	/**
	 * DB에 있는 모든 게시판 데이터를 불러오는 메소드
	 * @return study_board에 있는 모든 데이터
	 */
	public List<BoardVO> selectAllBoard() throws RemoteException;
	
	/**
	 * DB에 있는 게시판제목을 검색해서 데이터를 불러오는 메소드
	 * @param board_title
	 * @return 파라미터값을 검색한 데이터
	 */
	public List<BoardVO> selelectTitleBoard(String board_title) throws RemoteException;
	
	/**
	 * board테이블에 데이터 추가하기
	 * @param board
	 * @return 성공하면 1, 실패하면 0
	 */
	public int insertBoard(BoardVO board) throws RemoteException;
	
	/**
	 * 날짜를 최근부터 내림차순으로 불러오는 메소드
	 * @return 날짜를 최근부터 내림차순으로 정렬해서 나온 데이터
	 */
	public List<BoardVO> selectOderByBoard(int category_id) throws RemoteException;
	
	/**
	 * board_num을 이용한 게시물데이터 가져오기
	 * @param board_num 게시글 번호
	 * @return 파라미터랑 일치한 게시물 받아오기
	 */
	public BoardVO selectBoardId(int board_id) throws RemoteException;
	
	/**
	 * board_writer를 이용한 게시물 데이터 가져오기
	 * @param board_writer
	 * @return board_writer랑 일치하는데이터를 가진 List<BoardVO>
	 */
	public List<BoardVO> selectWriter(String board_writer) throws RemoteException;
	
	/**
	 * 게시글을 수정하는 메소드
	 * @param board
	 * @return 성공 1이상 실패 0
	 * @throws RemoteException
	 */
	public int updateBoard(BoardVO board) throws RemoteException;

	/**
	 * 게시글을 삭제하는 메소드
	 * @param int board_id
	 * @return 성공하면 1이상 실패0
	 * @throws RemoteException
	 */
	public int deleteBoard(int board_id) throws RemoteException;

	/**
	 * mem_id로 받은 아이디 주인이 쓴 게시글을 조회하는 메소드
	 * @param mem_id
	 * @return board_writer가 mem_id랑 일치하는 데이터들
	 * @throws RemoteException
	 */
	public List<BoardVO> selectMyBoard(String mem_id) throws RemoteException;
	/**
	 * 카테고리 아이디와 멤버 아이디를 가지고 게시글 조회하는 기능
	 * @param board
	 * @return 카테고리아이디와 멤버 아이디가 일치하는 데이터
	 * @throws RemoteException
	 */
	public List<BoardVO> selectMyBoardBycate(BoardVO board) throws RemoteException;
}
