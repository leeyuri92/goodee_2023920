package com.step5;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Reload1 extends JFrame implements ActionListener {
	// 선언부
	JPanel jp = new JPanel();
	JButton jbtnNew = new JButton("새로고침");
	JButton jbtn = new JButton("조회");
	// 생성부
	
	// 화면처리
	public void initDisplay() {
		jbtnNew.addActionListener(this);
		jp.setBackground(Color.red);
		this.add("Center",jp);
		this.add("North",jbtnNew);
		this.setSize(500, 400);
		this.setVisible(true);
	}
	
	// 메인 메소드
	public static void main(String[] args) {
		Reload1 r = new Reload1();
		r.initDisplay();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbtnNew) {
			Container cp = this.getContentPane();
			cp.remove(jp);
			JPanel jpCopy = null;
			jp = null;
			jp = new JPanel(); // 기존에 객체는 Candidate상태로 빠진다(gc)
			jpCopy = jp;
			jpCopy.setBackground(Color.pink);
			this.add("Center",jpCopy);
			this.revalidate();
			this.repaint();
		}
		
		
//		if(e.getSource()==jbtnNew) {
//			Container cp = this.getContentPane();
//			cp.remove(jp);
//			this.add("Center",jbtn);
//			this.revalidate();
//			this.repaint();			
//		}		
	}
}
