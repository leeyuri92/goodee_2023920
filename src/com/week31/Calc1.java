package com.week31;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Calc1 {
	//선언부
	JFrame jf = new JFrame();
	JButton jbtn = new JButton();
	JButton jbtn1 = new JButton("1");
	//
	Calc1(){
		
	}
	public void initDisplay() {
		jbtn.setText("2");
		jf.add("North", jbtn);
		jf.add("South", jbtn1);
		jf.setSize(400, 500);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		Calc1 c1 = new Calc1();
		c1.initDisplay();
	}
}
