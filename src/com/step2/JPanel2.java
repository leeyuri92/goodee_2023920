package com.step2;

import javax.swing.JFrame;

public class JPanel2 {
	JFrame jf = new JFrame();
	//화면그리는 메소드 선언 - 자바에서는 같은 이름의 메소드를 종복 선언할 수 있다.
	//메소드 오버로딩 검색해 본다
	public void initDisplay(int width, int height) {
		jf.setSize(width, height);
		jf.setVisible(true);
	}
	public void initDisplay(int width, int height, boolean isView) {
		jf.setSize(width, height);
		jf.setVisible(isView);
	}
	public static void main(String[] args) {
		JPanel2 jp1 = new JPanel2();
		jp1.initDisplay(600,500);
	}
}