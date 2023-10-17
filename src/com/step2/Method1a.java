package com.step2;

public class Method1a {

	public String login(String id, String pw) {
		System.out.println("사용자가 입력한 id ==>" + id + ", 사용자가 입력한 비번은 ==>" + pw);
		String name = "나신입";
		return name; 
	}

	public static void main(String[] args) {
		Method1a m = new Method1a();
		String name = m.login("kiwi","123");
		System.out.println(name);		
	}
}
