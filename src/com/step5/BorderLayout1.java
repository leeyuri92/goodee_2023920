package com.step5;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayout1 {
	JFrame jf = new JFrame();
	JButton jbtns[] = new JButton[5];//5개 생성됨 - null
	String labels[] = {"동","서","남","북","중앙"};
	public void initDisplay() {
		jbtns[0] = new JButton("동");
		jbtns[1] = new JButton("서");
		jbtns[2] = new JButton("남");
		jbtns[3] = new JButton("북");
		jbtns[4] = new JButton("중앙");
		/*
		for(int i=0;i<jbtns.length;i++) {
			JButton jbtn = new JButton(labels[i]);
			System.out.println(jbtns[i]);
		}
		*/
		jf.add("East",jbtns[0]);
		jf.add("North",jbtns[3]);
		jf.add("South",jbtns[2]);
		jf.add("Center",jbtns[4]);
		jf.add("West",jbtns[1]);
		jf.setSize(500, 400);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		BorderLayout1 bl = new BorderLayout1();
		bl.initDisplay();
	}

}
