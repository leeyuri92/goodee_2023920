package com.step5;

import javax.swing.JButton;
import javax.swing.JFrame;

public class M {
	JFrame jf = new JFrame();
	JButton jbtn = new JButton("조회");
	JButton jbtn2 = jbtn;
	
	public void initDisplay() {
		jf.add("North",jbtn);
		jf.add("Center",jbtn2);
		jf.setSize(400, 500);
		jf.setVisible(true);
	}

	public static void main(String[] args) {

	}

}
