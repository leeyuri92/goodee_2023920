package com.step1;
import javax.swing.JButton;
import javax.swing.JFrame;
public class JFrameTest6 {
	
	static JFrameTest6 jft = new JFrameTest6();	
	JFrame j6 = new JFrame();	 
	JButton jbtnAccount = new JButton("연산하기");
	JButton jbtnExit = new JButton("종료하기");

	public static void main(String[] args) {
		// 해결방법은 주소번지를 2번 접근
		jft.j6.setTitle("난 6번이야");
		jft.j6.add("North",jft.jbtnExit); // 오늘의 최종 학습목표
		jft.j6.add("South",jft.jbtnAccount);
		jft.j6.setSize(500, 400);
		jft.j6.setVisible(true);
	}	
}


