package com.step5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
/*
 * 이벤트 처리 3단계
 * 1.JTextField가 지원하는 이벤트 처리 담당 클래스를 implements한다.
 * 2.1번에서 추가된 이벤트 처리 담당 클래스가 선언하고 있는 actionPerformed메소드를 재정의 해야함.
 * 3.이벤트 소스(이벤트 처리 대상 클래스의 주소번지)와 이벤트 처리를 담당하는 클래스를 연결하기
 */
public class BaseBallGameView extends JFrame implements ActionListener{
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
	
	//세자리 숫자를 입력 후 엔터를 쳤을때 사용자가 입력한 숫자와 숫자를 맞추기 위한 힌트문을 출력해줄 화면.
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
	
	int my[]  = new int[3];
	int com[] = new int[3];
	int cnt = 0;               //++cnt 힌트 문장에서 순번을 출력하는 변수
	
	//생성자 선언하기
	BaseBallGameView(){
		ranCom();//이 메소드 딱 한번만 호출된다.
	}
	
	//세자리 임의의 숫자를 채번하는 메소드 구현하기
	public void ranCom() {
		Random r = new Random();
		
		//첫번째 자리는 중복검사가 필요없다
		com[0] = r.nextInt(10);
		
		do {   //while문과는 다르게 무조건 한번은 실행됨
			com[1] = r.nextInt(10);			
		}while(com[0]==com[1]);//중복된 숫자이면 계속 돌아라
		
		do {
			com[2] = r.nextInt(10);			
		}while((com[0]==com[2]) || (com[2]==com[1]));  // 중복된 숫자이면 계속 돌아라
	}
	
	
	//사용자가 입력한 값을 판정하는 메소드를 구현해 봅시다.
	public String account(String user) {
		if(user.length()!=3) {  //length명사형은 배열의 원소의 수반환. length()동사형은 문자열의 길이를 반환함
			return "세자리 숫자를 입력하세요.";
		}
		
		// 사용자가 jtf_user에 입력한 숫자는 보기에는 숫자 처럼 보여도 알맹이는 문자열로 
		// 인식을 합니다. 그래서 형전환을 한 후 my[]배열에 담아야 함니다.
		// 문자열 "256"을 숫자로 담을 변수 선언
		
		int temp = 0;
		int strike = 0; //힌트로 사용될 스트라이크를 담을 변수 선언
		int ball 	= 0;  //볼을 담을 변수 선언
		//strike와 ball을 지역변수로 해야 하는건 매 회차 마다 값이 변해야 하기 때문이다.
		
		// 입력받은 String > int 로 전환
		try {
			temp = Integer.parseInt(user);  // 안녕 - NumberFormatException발생
		} 
		
		// 예외처리 - 숫자가 아닌 문자를 입력했을경우
		catch (NumberFormatException e) {
			return "숫자만 입력하세요.";
		}
		
		my[0] = temp/100;//256/100=> 2.56 -> 2만 담김
		my[1] = (temp%100)/10;//십의자리 - 몫 2 나머지 56-> 5.6 -> 5만 담김
		my[2] = temp%10;//몫: 25 - 6만담김
		
		//이 중 for 문 사용해서 자리는 다르더라도 그 숫자가 존재하니? 네-> ball확보됨
		//네 일때 다시 한번 i ==j가 같은지  비교해서 index값 마저도 동일하면 자리까지도 일치함 - strike++
		for(int i=0;i<3;i++) { //9가지 경우의 수가 발생
			for(int j=0;j<3;j++) {
				if(com[i] == my[j]) { //그 숫자가 존재하니? 네 -ball확보
					if(i==j) { //자리값도 일치하는 거야? 네 -strike결정됨
						strike++;
					}else { //숫자는 있지만 자리는 달라요
						ball++;
					}
				}//end of if
			}/// end of inner for
		}//////end of outter for
		
		if(strike==3) {
			System.out.println("정답입니다.");
		}
		return strike+"스  "+ball+"볼";
	}
	
	//나가기 버튼이나 나가기 메뉴 아이템을 선택(클릭)했을때 호출되는 메소드 구현
	public void exit() {
		System.exit(0);
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
		jtf_user.addActionListener(this);//여기서 this는 자기자신 클래스를 가리킴.-BaseBallGame:내안에 actionPerformed
		jbtn_new.addActionListener(this);
		jbtn_dap.addActionListener(this);
		jbtn_clear.addActionListener(this);
		jbtn_exit.addActionListener(this);
		jmi_exit.addActionListener(this);
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
	}
	public static void main(String[] args) {
		BaseBallGameView bbGame = new BaseBallGameView();
		bbGame.initDisplay();
	}
	////////jtf_user에 엔터를 쳤을 때 , jbtn_exit버튼을 클릭했을때 이벤트 지원하는 인터페이스가 ActionListener이다.
	// ActionListener는 반드시 actionPerformed를 재정의 해야 한다.
	// annotation- 부모가 가진 메소드를 재정의 하였다 는  의미임.
	// 콜백메소드는 개발자가 호출할 수 없는 메소드로 시스템 레벨에서 필요할 때 자동으로 호출됨.
	// 자바에 main메소드도 일종의 콜백 메소드 임.
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed 호출 성공");
		String label = e.getActionCommand();//감지된 클래스의 라벨담기
		System.out.println("너가 누른 버튼의 문자열은 "+label+ " 입니다.");
		Object obj = e.getSource(); //이벤트소스의 주소번지를 담아줌.
		System.out.println(obj);
		
		if("지우기".equals(label)) {
			jta_display.setText("");
		}
		//너 나가기 버튼이니?
		//|만 있을 땐 앞에 조건이 true이면 실행문이 결정되었지만 뒤에 조건을 따짐
		//||가 있을 땐 앞에 조건이 true이면 뒤에 조건이 false이어도 어차피 실행됨 - 뒤에 조건을 안따짐- 일량이 줄어듦
		else if("나가기".equals(label) || obj == jmi_exit) {//or이니까 둘중 하나만 true이어도 호출된다.
			exit();//사용자 정의 메소드 호출이다.
		}
		//새게임을 누른거야?
		else if(obj == jbtn_new|| obj == jmi_new) {
			cnt = 0;
			ranCom();
			jta_display.setText("");
		}
		//이벤트가 발생한 이벤트 소스의 문자열을 비교하기
		else if(e.getSource()==jtf_user) {
			jta_display.append(++cnt+"회 : "+jtf_user.getText()+" : "+account(jtf_user.getText())+"\n");
			jtf_user.setText("");
		}///////////입력하고 엔터 쳤을 때
		else if(obj==jmi_dap || "정답".equals(label)) {
			//1-먼저 채번(동사-기능-메소드 호출)하고 그 다음에 com배열에 있는 값을 출력해 준다.
			//ranCom();
			jta_display.append("정답은 "+com[0]+com[1]+com[2]+" 입니다.\n");
			//jta_display.append(com[0]+com[1]+com[2]);//0
		}
	}///////////////end of actionPerformed

}