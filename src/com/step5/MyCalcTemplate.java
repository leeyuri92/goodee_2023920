package com.step5;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalcTemplate implements ActionListener{
	//선언부
	JFrame jf = new JFrame();
	//북쪽에 들어갈 JTextField
	JTextField jtf = new JTextField("0");
	//중앙에는 속지를 생성하여 레이아웃을 GridLayout(4,4)설정함
	JPanel jp_center = new JPanel();//디폴트레이아웃은 FlowLayout임-> 강제로 GridLayout
	JButton jbtns[] = new JButton[16];
	String labels[] = {"7","8","9","+"
			                       ,"4","5","6","-"
			                       ,"1","2","3","*"
			                       ,"C","0","=","/"};
	//생성자
	MyCalcTemplate(){
		initDisplay();
	}
	//화면처리부
	public void initDisplay() {
		jp_center.setLayout(new GridLayout(4,4));
		jp_center.setBackground(Color.green);
		for(int i=0;i<jbtns.length;i++) {
			jbtns[i] = new JButton(labels[i]);
			jp_center.add(jbtns[i]);
			jbtns[i].addActionListener(this);
		}
		jf.add("Center", jp_center);
		jf.add("North", jtf);
		jf.setTitle("처음만들어보는 전자계산기");
		jf.setSize(400, 500);
		jf.setVisible(true);
	}
	//메인메소드
	public static void main(String[] args) {
		new MyCalcTemplate();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
