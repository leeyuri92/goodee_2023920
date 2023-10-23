package com.step2;

public class Method2 {

	public String login(String id, String pw) {
		String name = "나신입";
		return name; 
	}
	public int methodD() {
		return 0;
	}
	public static void main(String[] args) {
		Method2 m = new Method2();
		// println메소드 호출할 때 파라미터 자리에서 리턴타입이 있다면 호출 가능
		System.out.println(m.login("kiwi","123"));	
		System.out.println(m.methodD());
	}
}
