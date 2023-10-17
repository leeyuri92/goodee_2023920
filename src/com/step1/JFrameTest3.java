package com.step1;
import javax.swing.JFrame;
// 이름 지어진 소스이름과 선언된 클래스이름이 다르다.
public class JFrameTest3 { // 클래스 선언하기 {}
	static JFrame j3 = new JFrame();	 
	public static void main(String[] args) {		
		JFrameTest3 jft = new JFrameTest3();
		j3.setSize(500, 400);
		j3.setVisible(true);
	}
}