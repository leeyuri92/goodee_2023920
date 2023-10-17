package com.step2;

import java.util.jar.Attributes.Name;

public class Method3 {

	public String login(String id, String pw) {
		String name = "나초보";
		return name; 
	}
	public void methodD(String name) {      // public void methodD() 라면
		//return 0;
		
		System.out.println("methodD 호출 성공 " + name);
	}
	public static void main(String[] args) {
		Method3 m = new Method3();
		//int i = m.methodD();        // 타입이 맞지않아 에러발생
		String name = m.login("apple","123");
		m.methodD(name);
		
	}
}
