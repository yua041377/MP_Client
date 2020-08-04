package kr.or.ddit.widu.main;

import kr.or.ddit.widu.vo.member.MemberVO;


// 세션 클래스
public class LoginSession {
	
	// 로그인 정보를 임시저장하는 MemberVO 객체
	// 로그아웃시 null로 만들어줘야 함.
	public static MemberVO session = new MemberVO();
	public static WidUClientMainController maincon;
	public static int boardCategory;
	public static int boardID;
	
}
