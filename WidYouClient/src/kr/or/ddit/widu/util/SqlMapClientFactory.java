package kr.or.ddit.widu.util;

import java.io.IOException;
import java.io.Reader;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class SqlMapClientFactory {
	
	private static SqlMapClient smc;  // SqlMapClient객체 변수 선언
	
	public static SqlMapClient getInstance(){
		
		if(smc == null) {
			
			Reader rd;
			
			try {
				rd = Resources.getResourceAsReader("SqlMapConfig.xml");
				smc = SqlMapClientBuilder.buildSqlMapClient(rd);
				rd.close();
			} catch (IOException e) {
				System.out.println("SqlMapClient객체 생성 실패!!");
				e.printStackTrace();
			}
		}
		
		return smc;
	}
	public static void main(String[] args) {
		SqlMapClientFactory smc = new SqlMapClientFactory();
		System.out.println(smc);
	}
}
