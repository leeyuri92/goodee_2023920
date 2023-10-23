package com.step2;

import javax.swing.JFrame;

public class JFrame2 {

	public static void main(String[] args) {
		JFrame jf1 = new JFrame();
		JFrame jf2 = new JFrame();
		jf1.setTitle("첫번째");
		jf2.setTitle("두번째");
		jf1.setSize(300, 500);
		jf2.setSize(500, 300);
		jf1.setVisible(true);
		jf2.setVisible(true);
	}
}