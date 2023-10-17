package com.step2;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPanel1 {
	// setSize메소드의 파라미터는 int이다. 따라서 int타입을 선언한다.
	int width = 300;
	int height = 500;
	boolean isView = false;
	// false이면 메모리에는 로딩중이나 화면에만 안보임
	// true이면 메모리에도 존재하고 실제 화면상에도 보임
	
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JTextField jtf = new JTextField("");
	
	// 화면그리는 메소드 선언
	public void initDisplay() {
		jp.setBackground(Color.gray);
		jf.add("Center",jp); // add메소드는 파라미터를 2개 입력해야 한다.
		jf.add("South",jtf); 
		// setSize메소드와 setVisible메소드는 JFrame클래스가 정의하고 있는 메소드이다.		
		jf.setSize(width,height); 
		jf.setVisible(isView); // setVisible메소드의 파라미터 자리에는 true 혹은 false가 올 수 있음		
	}
	public static void main(String[] args) {
		JPanel1 jp1 = new JPanel1();
		jp1.isView = true;
		jp1.initDisplay();
	}
}
