package com.step1;
import javax.swing.JFrame;
// 이름 지어진 소스이름과 선언된 클래스이름이 다르다.
public class JFrameTest2 { // 클래스 선언하기 {}
	JFrame j2 = new JFrame();
	//int i; // 선언만 - 전변
	//i = 10;  // 선언부에서는 나눠서 정의할 수 없다.
	//int i = 10; // 재선언 할 수 없다.
	int j = 20; // 새로 선언한 변수이다.
	// 사용자 정의 메소드인 initDisplay() 지웠는데 에러가 나지않았다. 
	public static void main(String[] args) {
		// insert here
		// 누구를 인스턴스화 해야 할까?
		JFrameTest2 jft = new JFrameTest2();
		// 왜 에러가 떳나 - 내가 선언한 클래스 안에 initDisplay() 구현되지 않았다.		
		//jft.initDisplay(); // 메소드 뒤에 {} , 메소드 이름 뒤에 세미콜론이 오면 호출이다.
		
		//JFrameTest1 jft = new JFrameTest1(); // 같은 패키지 안에서 호출이 가능하다.
		//jft.initDisplay();
		
		
	}
}