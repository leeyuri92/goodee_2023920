package com.step5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BaseBallGameUI {
	//선언부
	JFrame jf = new JFrame();
	//이미지를 담은 물리적인 위치 선언하기.
	String 		imgPath = "D:\\workspace_java\\dev_java\\src\\com\\week2\\";
//	ImageIcon 	titleIcon = new ImageIcon(imgPath+"yagu.png");
	//ImageIcon 	bg = new ImageIcon(imgPath+"dreamballpark.jpg");
	Image img = null;
	JMenuBar 	jmb 		= new JMenuBar();
	JMenu	 	jm_game 	= new JMenu("게임");
	JMenuItem   jmi_new 	= new JMenuItem("새게임");
	JMenuItem   jmi_dap 	= new JMenuItem("정답");
	JMenuItem   jmi_clear 	= new JMenuItem("지우기");
	JMenuItem   jmi_exit 	= new JMenuItem("나가기");
	JMenu	 	jm_info 	= new JMenu("도움말");
	JMenuItem   jmi_detail 	= new JMenuItem("야구숫자게임이란?");
	JMenuItem   jmi_create 	= new JMenuItem("만든사람들");
	//중앙에 들어갈 속지 선언
	JPanel jp_center = new JPanel();
	//세자리 숫자를 입력 후 엔터를 쳤을때 사용자가 입력한 숫자와 숫자를 맞추기 위한 힌트문
	//을 출력해줄 화면.
	JTextArea jta_display = null;
	JScrollPane jsp_display = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	JTextField jtf_user   = new JTextField();
	//글꼴과 글꼴에 대한 스타일과 글자 크기를 정해줌.-인스턴스화를 통해서, 그 값들은 생성자의 파라미터로 결정됨
	Font f = new Font("Thoma",Font.BOLD,14);
	//동쪽에 들어갈 속지 생성하기
	JPanel jp_east   = new JPanel();
	//새게임, 정답, 지우기, 나가기 버튼 추가하기
	JButton jbtn_new 	= new JButton("새게임");
	JButton jbtn_dap 	= new JButton("정답");
	JButton jbtn_clear 	= new JButton("지우기");
	JButton jbtn_exit 	= new JButton("나가기");	
	//파라미터로 넘어가는 주소번지는 BaseBallGameUI타입이다.
	BaseBallGameEvent bbgEvent = new BaseBallGameEvent(this); // 연결, 내 원본을 써라
	BaseBallGameLogic bbgLogic = new BaseBallGameLogic(this); // 연결, 내 원본을 써라
	//생성자
	BaseBallGameUI() {
		bbgLogic.ranCom();
	}
	
	//화면을 그려주는 메소드 선언
	public void initDisplay() {
		jta_display = new JTextArea();
		jsp_display = new JScrollPane(jta_display);
		jta_display.setOpaque(false);
		jf.setResizable(false);
		//jf.setContentPane(new BgPanel());
		//////////////// 툴바에 들어갈 이미지 버튼 추가하기 ///////////////
		//////////////// 메뉴 바 추가 시작 /////////////////
		jm_game.add(jmi_new);
		jm_game.add(jmi_dap);
		jm_game.add(jmi_clear);
		jm_game.add(jmi_exit);
		jm_info.add(jmi_detail);
		jm_info.add(jmi_create);
		jmb.add(jm_game);
		jmb.add(jm_info);
		//////////////// 메뉴 바 추가  끝   /////////////////
		System.out.println("initDisplay 호출 성공");
		//이벤트 소스와 이벤트 처리 클래스를 매핑하는 코드 추가
		//EventHandler ehandler = new EventHandler();
		//jtf_user.addActionListener(ehandler);//여기서 this는 자기자신 클래스를 가리킴.-BaseBallGame:내안에 actionPerformed
		jtf_user.addActionListener(bbgEvent);//여기서 this는 자기자신 클래스를 가리킴.-BaseBallGame:내안에 actionPerformed
		jbtn_new.addActionListener(bbgEvent);
		jbtn_dap.addActionListener(bbgEvent);
		jbtn_clear.addActionListener(bbgEvent);
		jbtn_exit.addActionListener(bbgEvent);
		jmi_exit.addActionListener(bbgEvent);
		jbtn_new.setBackground(new Color(158,9,9));
		jbtn_new.setForeground(new Color(212,212,212));
		jbtn_dap.setBackground(new Color(7,84,170));
		jbtn_dap.setForeground(new Color(212,212,212));
		jbtn_clear.setBackground(new Color(19,99,57));
		jbtn_clear.setForeground(new Color(212,212,212));
		jbtn_exit.setBackground(new Color(54,54,54));
		jbtn_exit.setForeground(new Color(212,212,212));
		jp_east.setLayout(new GridLayout(4,1));
		jp_east.add(jbtn_new);
		jp_east.add(jbtn_dap);
		jp_east.add(jbtn_clear);
		jp_east.add(jbtn_exit);
		jta_display.setFont(f);
		jta_display.setBackground(new Color(255,255,200));
		jta_display.setForeground(new Color(57,109,165));

		jf.setJMenuBar(jmb);
		jtf_user.setBackground(new Color(255,255,200));
		jp_center.setBackground(Color.green);
		jp_east.setBackground(Color.black);
		jp_center.setLayout(new BorderLayout(0,10));
		jp_center.add("Center",jsp_display);
		jp_center.add("South",jtf_user);
		jta_display.setLineWrap(true);
		jf.setLayout(new BorderLayout(10,20));
		jf.add("Center",jp_center);
		jf.add("East",jp_east);
		jf.setTitle("야구 숫자 게임 Ver1.0");
		jf.setSize(400, 300);
		jf.setVisible(true);
	}////////////////end of initDisplay ///////////////
	
	
	public static void main(String[] args) {
		 BaseBallGameUI bbgUI = new BaseBallGameUI();
		 bbgUI.initDisplay();
	}

}