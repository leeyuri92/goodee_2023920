package com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// 테스트 시나리오를 작성 할 수 있다.
// 무엇을 테스트 할 것인가?
// 예외처리를 하는 것은 서비스의 안정활르 위한 필수이다.
public class Exception1 {
	
	DBConnectionMgr dbMgr = null; 
	// 인스턴스화를 직접하지않는다.
	// 전역변수 자리에 추가한 인스턴스화는 언제 메모리에 상주하는가?
	// new Exception1() 했을 때 비로소 그 때에야 메모리에 상주됨 - 시점
	Connection con = null;
	PreparedStatement pstmt = null; // 쿼리문을 스캔
	ResultSet rs = null;
	
    Exception1() {
		dbMgr = DBConnectionMgr.getInstance();
		System.out.println("Exception1() : "+dbMgr);
		test();
	}
	public void test(){
		System.out.println("test() : "+dbMgr);
		System.out.println(con);
		try {
			// 인터페이스가 getConnection 메소드 호출을 통해서 주소번지 갖게 되었다.(메모리에 상주하게 되었다) -> NullPointerException
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement("SELECT deptno, dname, loc From dept WHERE deptno=?");
			pstmt.setInt(1,50);
			rs = pstmt.executeQuery(); // 오라클서버에게 select 처리해줘
			System.out.println(rs.isFirst());
			
		} catch (Exception e) {
			e.printStackTrace();  // 디버깅하는 코드
		}
		
	}

	public static void main(String[] args) {
		// new Exception1();

	}

}
