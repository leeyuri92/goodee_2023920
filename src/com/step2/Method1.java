package com.step2;

public class Method1 {
	// 메소드 리턴타입에 void가 아닌 원시형 또는 참조형이 오면
	// 반드시 마지막에(맨끝에) return 예약어를 쓴다.
	public String login(String id, String pw) {
		System.out.println("사용자가 입력한 id ==>" + id + ", 사용자가 입력한 비번은 ==>" + pw);
		return "나신입";  // return 값은 string타입에 맞춰야 한다.
	}
	public int methodA() {
		return 10;
	}
	public double methodB() {
		return 10.0 ;
	}
	public boolean methodC() {
		return true ;
	}
	public void methodD() {
		// void가 있으므로 return 예약어를 쓰지않아도 됨
	}
	public static void main(String[] args) {
		Method1 m = new Method1();
		String name = m.login("kiwi","123");
		System.out.println(name);
		
		// 타입에 맞춰서 입력하지 않아서 모두 에러
		//name = m.login("1",false); 
		//name = m.login(1);
		//name = m.login();
		//name = m.login("","","");
	}
}
/*
 메소드 선언하기
 1. 리턴타입을 결정해 주세요
 2. 파라미터가 필요한가요?
 필요하다면 몇개가 필요하지?
 3. 나만 사용할건지 아님 공유할 건지 결정하자 - private, public
 public > protected > friendly > private

메소드를 선언하는 문장
(접근제한자) 리턴타입(void, 원시형타입, 참조형타입) 메소드이름(빈상태, 한 개, 두 개 이상) 
 */
