package com.step4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.week2.BaseBallGameView;
//BaseBallGameView로 가야하는 전변이 있고
//BaseBallGameLogic로 가야하는 전변이 있고
//BaseBallGameEvent로 가야하는 전변이 있다.
public class BaseBallGame implements ActionListener {
	//선언부 - 전역변수의 성격을 가진다.- 인스턴스변수.변수명으로 어떤 클래스 에서든 사용이 가능하다.
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
	int my[]  = new int[3];
	int com[] = new int[3];//세자리 임으의 숫자를 담을 1차배열 선언 - BaseballGameLogic으로 보내야하는지? 아님 BaseballGameEvent에 있어야 하는지 기준 - 시야 -소스리뷰
	int cnt = 1;//++cnt 힌트 문장에서 순번을 출력하는 변수	- 야구 회차를 나타내는 전역변수로 한다.그 게임이 유지되는 동안에는  변해야 한다.
	//새게임이 시작(새게임을 알리는 메소드가 호출됨 -새게임일때 초기화 해야하는 변수가 반드시 존재함)되면 다시 0으로 초기화 해야한다.
	//생성자
	
	//사용자정의 메소드
	
	//세자리 임의의 숫자를 채번하는 메소드 구현하기
	//중복을 제거하여 채번한 숫자를 1차 배열에 초기화하기
	public void ranCom() {//새게임 버튼이 눌리면 호출되고 또 최초 실행하자 마자 바로 호출 될 수 도 있다.
		Random r = new Random();
		com[0] = r.nextInt(10);
		//do...while()문 조건검사를 나중에 하므로 무조건 한 번은 실행되고, while문 먼저 조건검사를 하니까 한 번도 실행이 안될 수 있다.
		do {
			com[1] = r.nextInt(10);		
		}while(com[0]==com[1]);
		do {
			com[2] = r.nextInt(10);		
		}while(com[0]==com[2] || com[1]==com[2]);//|이거나, or, 또는 
	}
	//사용자가 입력한 값을 판정하는 메소드를 구현해 봅시다.
	public String account(String user) {
		System.out.println("사용자가 입력한 숫자는 ===> "+user);
		if(user.length()!=3) {
			return "세자리 숫자를 입력하세요.";
		}
		//사용자가 jtf_user에 입력한 숫자는 보기에는 숫자 처럼 보여도 알맹이는 문자열로 
		//인식을 합니다. 그래서 형전환을 한 후 my[]배열에 담아야 함니다.
		//문자열 "256"을 숫자로 담을 변수 선언
		int temp 	= 0;
		int strike 	= 0;//힌트로 사용될 스트라이크를 담을 변수 선언
		int ball 	= 0;//볼을 담을 변수 선언
		//strike와ball을 지역변수로 해야 하는건 매 회차 마다 값이 변해야 하기 때문이다.
		try {
			temp = Integer.parseInt(user);
		} catch (NumberFormatException e) {
			return "숫자만 입력하세요.";
		}
		my[0] = temp/100;//2.56-> int/int=> int 2만 담김 - 백의자리
		my[1] = (temp%100)/10;//5.6 -> 5만 담김- 십의자리
		my[2] = temp%10;//몫 25 나머지 6이라서 6만 담김
		System.out.println(my[0]+""+my[1]+""+my[2]);//13-> 256
		for(int i=0;i<3;i++) {
			for(int j =0;j<3;j++) {
				if(com[i]==my[j]) {//같은 숫자가 존재하니? 네:ball확보 아니오 :0볼
					if(i==j) {//배열의 자리값도 같은거야? 응 그러면 스트라이크
						strike++;
					}else {
						ball++;
					}
				}
			}//end of inner for
		}////end of outter for
		return strike+"스  "+ball+"볼";
	}
	
	//나가기 버튼이나 나가기 메뉴 아이템을 선택(클릭)했을때 호출되는 메소드 구현
	public void exit() {

	}	
	
	//여기에 화면을 그리는 메소드 입양
	//화면을 그려주는 메소드 선언
	public void initDisplay() {
		//화면이 열릴 때 커서가 jtf_user에 가 있기
		jf.addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent we) {
				jtf_user.requestFocus();
			}
		});
		jta_display = new JTextArea();
		jta_display.setEditable(false);
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
	
	//@는 annotation 이라고 읽는다. - 
	//부모가 정의한 메소드를 재정의하는것-실제 그 장치에 필요한 기능을 구현하시오.
	//부모(추상클래스-추상은 결정되지않음)가 정의할 수 없으니(서로 다른 장치라서)...
	//나를 구현하는 클래스 마다 그 기능에 차이가 있을테니 그 클래스에서 오버라이딩 하시오.
	//단 부모의 메소드를 훼손해서는 안됨
	//actionPerformed도 개발자가 직접 호출하는 메소드가 아니다
	//그럼 언제 누가 왜 호출하는 걸까요? - 콜백함수(javascript), 콜백메소드(자바)
	//누가? JVM이
	//언제? 버튼을 눌렀을 때 혹은 JTextField에서 엔터를 쳤을 때를 JVM이 감지(H/W-키보드-입력장치)해 내고
	//그 때 인터셉트(끼어들어서) 해서 필요한 처리를 개발자가 해낸다 - dependency injection(Spring F/W)
	@Override
	public void actionPerformed(ActionEvent e) {//파라미터자리에 ActionEvent 객체는 JVM에서 이벤트가 감지되었을때 대신 주입해줌
		System.out.println("actionPerformed 호출 성공");
		String label = e.getActionCommand();
		System.out.println("너가 누른 버튼의 문자열은 "+label+ " 입니다.");
		Object obj = e.getSource();//이벤트소스의 주소번지를담아줌.
		String input = jtf_user.getText();
		System.out.println(input);
		//너 나가기 버튼이니?
		if("나가기".equals(label)) {

		}
		//새게임을 누른거야?
		else if(obj == jbtn_new) {

		}
		//이벤트가 발생한 이벤트 소스의 문자열을 비교하기
		else if(e.getSource()==jtf_user) {
			//엔터이벤트가 적용되었을 때 후처리로 JTextField에 문자열을 빈문자열로 교체함
			//JTextArea가 선언부에서는 null이었지만 화면을 그리는 initDisplay()에서 인스턴스화를 마(생성)쳤으므로
			//NullPointerException이 발생하지 않았다. - UI통해서 테스트 할때 관전포인트
			//jta_display.setText("문자열");
			//숫자를 입력하고 엔터를 쳤을때 JVM이 actionPerfored를 호출하는 거니까 내부에서 출력해 볼 수 있다.
			System.out.println("엔터쳤을 때 : "+jtf_user.getText());
			//재사용성을 위해서 메소드 호출할수 있도록 연습- 메소드로 이관했을때 동일한 효과
			jta_display.append(cnt +"회 : "+jtf_user.getText()+"\n");
			cnt = cnt + 1;
			jtf_user.setText("");
		}///////////입력하고 엔터 쳤을 때
		else if(obj==jbtn_dap) {

		}
		

	}//end of actionPerformed
	//메인메소드 - 최소한의 코드만 작성하도록 연습할것
	public static void main(String[] args) {
		BaseBallGame bbGame = new BaseBallGame();
		bbGame.initDisplay();		
	}

}
