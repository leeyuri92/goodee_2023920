package com.week2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 클래스 선언하기
// ActionListener는 인터페이스라서 추상메소드를 가지고 있다.
// 추상메소드란 선언만 되어있고 좌중괄호와 우중괄호가 없는 메소드  - ;로 끝난다
public class AddressBook implements ActionListener { //버튼이 눌러진 이벤트를 감지하여 의도대로 코드를 삽입할 수 있다.
	//선언부
	AddressDialog aDialog = new AddressDialog();
	JFrame jf = new JFrame(); // 창 생성
	JPanel jp_north = new JPanel();    // 버튼 4개 배치하는데 사용함 - 단독으로 모양이 없다. (속지)
	JButton btnSelect = new JButton("조회"); 
	JButton btnInsert = new JButton("입력"); 
	JButton btnUpdate = new JButton("수정"); 
	JButton btnDelete= new JButton("삭제"); 
	//생성자
	public AddressBook() {}
	//화면처리 구현
	public void initDisplay() {
		// 이벤트 처리 3단계 
		// 버튼의 이벤트를 지원하는 인터페이스를 implements한다. - ActionListener
		// 해당 인터페이스가 선언하고 있는 메소드를 오버라이딩 해야한다. - actionPerformed(ActionEvent e)
		// 이벤트소스와 이벤트처리를 담당하는 클래스를 매칭해줌
		
		// btnSelect.addActionListener(this); this는 ActionListener 구현하고 있는 구현체 클래스 가리킨다. - AddressBook
		btnSelect.addActionListener(this);
		btnInsert.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnDelete.addActionListener(this);
		
		// 버튼 4개 생성
		jp_north.add(btnSelect);
		jp_north.add(btnInsert);
		jp_north.add(btnUpdate);
		jp_north.add(btnDelete);
		
		jf.add("North",jp_north);  // 창을 북쪽에 붙이겠다.
		jf.setTitle("주소록 Ver1.0");  // 창 이름
		jf.setSize(800,500); // 창 크기
		jf.setVisible(true);  // 창을 보여주자
		aDialog.initDisplay();
		aDialog.set("",false);
		//aDialog.jdg_address.setVisible(false);
	}
	//메인메소드
	public static void main(String[] args) {
		AddressBook abook = new AddressBook();//기본
		abook.initDisplay();
	}
	// 아래메소드는 ActionListener인터페이스에 이름이 정해져 있다.
	// 구현체 클래스인 너가 재정의하여 구현해라.
	// 장치가 없고 기능만 있다 - 실행불가능
	// 현재 코드에서 actionPerformed메소드를 호출하는 코드는 어디에도 없다.
	// actionPerformed메소드는 마치 main메소드 처럼 버튼이 눌려지고 눌려졌다는 사실을 JVM이 감지하면 
	// 그때 자동으로 호출되는 메소드입니다. - callback함수
	@Override
	public void actionPerformed(ActionEvent e) {
		// 눌러진 버튼의 문자열을 읽어온다. - 언제 버튼이 눌렸을 때 - 버튼을 누르는건 사용자 이지만
		// 눌렸다고 느끼는건 JVM만이 알 수 있다. - 파라미터 자리에 e가지고 getActionCommand()호출하면 String타입의 라벨이 출력
		String command = e.getActionCommand();
		System.out.println(command);
		if ("조회".equals(command)) {
			aDialog.set("조회", true);
		}else if ("입력".equals(command)) {
			aDialog.set("입력", true);
		}else if ("수정".equals(command)) {
			aDialog.set("수정", true);
		}
	
	}
}