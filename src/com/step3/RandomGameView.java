package com.step3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//JFrame을 상속받아서 사용자 정의 클래스를 선언하였다.
//ActionListener는 엔터 쳤을 때 이벤트 처리를 위해서 선언한 인터페이스 이다.
public class RandomGameView extends JFrame  implements ActionListener{
	//FlowLayout설정해서 중앙- 다중문쓰는 JTextArea배치, 남쪽에는 싱글로우작성하는 JTextField
	JPanel 			jp_center 			= new JPanel();
	JPanel 			jp_east 				= new JPanel();//새게임,정답,지우기,종료버튼 배치하기
	JMenuBar 	    jmb						= new JMenuBar();
	JMenu				jm_game				= new JMenu("Play");
	JMenuItem	    jmi_new				= new JMenuItem("새게임");
	JMenuItem	    jmi_dap				= new JMenuItem("정답");
	JMenuItem	    jmi_clear			= new JMenuItem("지우기");
	JSeparator    js_exit				= new JSeparator();
	JMenuItem	    jmi_exit				= new JMenuItem("종료");
	JTextArea 		ta_result 			= new JTextArea(10,50);
	JTextField      tf_input				= new JTextField("",10);
	JButton 			jbtnNew             = new JButton("새게임");
	JButton 			jbtnDap              = new JButton("정답");
	JButton 			jbtnClear            = new JButton("지우기");
	JButton 			jbtnExit              = new JButton("종료");
	Font 				f 							= new Font("Thoma", Font.BOLD, 18);
	public void initDisplay(){
		//엔터를 치는 건 사람인데 엔터를 느끼는건 JVM이라서 ActionListener라는 인터페이스의 약속된 메소드를 오버라이딩 하기
		tf_input.addActionListener(this);//이벤트 소스와 이벤트 처리를 담당하는 핸들러 클래스 매핑하기
		jp_center.setLayout(new BorderLayout());//동,서,남,북, 중앙 버튼이나 체크박스 배치하기
		jp_center.setBackground(Color.green);
		jp_center.add("Center", ta_result);
		jp_center.add("South", tf_input);
		jp_east.setBackground(Color.black);
		jp_east.setLayout(new GridLayout(4,1,2,2));
		//jp_east속지에 새게임 버튼 배치하기
		jp_east.add(jbtnNew);
		jp_east.add(jbtnDap);
		jp_east.add(jbtnClear);
		jp_east.add(jbtnExit);
		jm_game.add(jmi_new);
		jm_game.add(jmi_dap);
		jm_game.add(jmi_clear);
		jm_game.add(js_exit);
		jm_game.add(jmi_exit);
		jmb.add(jm_game);
		this.setJMenuBar(jmb);
		this.add("Center", jp_center);
		this.add("East", jp_east);//this는 JFrame을 가리키는 수정자 이다.
		this.setTitle("숫자맞추기게임");
		this.setSize(600,400);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//이 코드가 X버튼 눌렸을 때 사용된 자원회수함
	}	
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		RandomGameView rgv = new RandomGameView();
		rgv.initDisplay();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String command = e.getActionCommand();//이벤트 발동하는 버튼의 라벨
		if("1".equals(command)) {
			System.out.println(command);
			ta_result.append(command);
		}
		else if(obj == tf_input) {//너 엔터 친거야?
			ta_result.append(tf_input.getText()+"\n");
			tf_input.setText("");
		}
	}
}
