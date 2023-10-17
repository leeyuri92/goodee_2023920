package com.step1;
import javax.swing.JFrame;
// 이름 지어진 소스이름과 선언된 클래스이름이 다르다.
public class JFrameTest5 { // 클래스 선언하기 {}
	JFrame j5 = new JFrame();	 
	public static void main(String[] args) {
		JFrameTest5 jft = new JFrameTest5();
		// 해결방법은 주소번지를 2번 접근
		jft.j5.setTitle("난 5번이야");
		jft.j5.setSize(500, 400);
		jft.j5.setVisible(true);
	}
}

