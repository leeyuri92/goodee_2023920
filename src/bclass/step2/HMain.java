package bclass.step2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
// 인스턴스화 -> 필요한 객체를 주입(객체생성 - 관계 - 의존성)받는 것이다.
// 게으른 인스턴스화, 이른 인스턴스화
// Spring에서는 직접 개발자가 절대로 인스턴스화를 하지 않는다(관리받지못하니까 - 객체라이프사이클)

public class HMain extends JFrame implements ActionListener{
	// 선언부
	JButton jbtn = null;
	String title = null;
	
	// 생성자
	public HMain() {
		jbtn = new JButton("조회");
		// 생성자에서 화면을 호출하는 건 인스턴스화 발생시 두 개의 화면이 열릴 수 있는 것이다.
		// 인스턴스화를 할 때마다 반복해서 호출이 된다.
	}
	public HMain(String title) {
		this.title = title;     // 전변 초기화를 하엿다
	}
	
	// 메소드
	public void initDisplay() {
//		jbtn.addActionListener(this);
		new JButton("입력").addActionListener(this);  // 이벤트가 발동할 때마다 새로운 버튼이 생긴다.
		this.add("North",new JButton("입력"));
		this.setVisible(true);
		this.setSize(400,400);
		this.setLocation(850,  300);
		this.setTitle(title);
	}

	public static void main(String[] args) {
		HMain hm = new HMain();
		hm.initDisplay();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
/*
 인스턴스화를 하는 방법
 1.  A a = new A();
 2. A a = null;
    a = new A();
 3. A a = B.getInstance();  싱글톤패턴 - static 대신 사용하자
 4. Super s = new Sub();   다형성
 인터페이스 s = new 구현체 클래스();
 추상클래스 s = new 구현체 클래스();
 
 인터페이스는 기능적인 관점에서 결합도 낮추면서 재정의 하여 사용하는 컨벤션
 추상클래스는 (생성자도 가능, 일반 메소드도 가능) 서비스의 확장과 관련된 관점
 extends를 사용하기 때문에 결합도가 높다. - 재사용성이 낮다
 */
