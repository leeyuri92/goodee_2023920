package com.step3;

public class MReturn1 {
	String login(String mem_id, String mem_pw) {
		String msg = null;
		String db_id = "kiwi";
		String db_pw = "123";
		String db_name =null;
		if(mem_id.equals(db_id)) {
			System.out.println("아이디가 존재합니다.");
			if(mem_pw.equals(db_pw)) {
				db_name = "키위";
				msg = db_name+"님 환영합니다.";
			}else {
				msg = "비번이 틀렸습니다.";
			}
		}
		else {
			//System.out.println("아이디가 없습니다.");
			msg = "아이디가 없습니다.";
		}
		return  msg;
	}
	public static void main(String[] args) {
		MReturn1 mr = new MReturn1();
		String msg = mr.login("kiwi", "1235555");
		System.out.println(msg);//로그인 성공하였습니다. 출력될꺼야
	}

}
