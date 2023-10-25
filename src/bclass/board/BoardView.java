package bclass.board;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
// BoardView > BoardController > BoardDao
public class BoardView extends JFrame implements ActionListener{
	// 선언부	
	BoardController boardController = null;  // 선언만, 타입설정안됨, 주소번지없음	
	JButton jbtn_sel = new JButton("조회");
	
	// 생성자
	public BoardView() {
		initDisplay();
	}
	
	// 메소드
	public void initDisplay() {
		jbtn_sel.addActionListener(this);  // 주소번지가 오는자리 - 연결
		this.add("North",jbtn_sel);
		this.setSize(500, 400);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {  
		// 콜백메소드 - 호출불가 - 단위테스트불가
		// 파라미터 자리에 클래스(참조형) 타입도 올 수 있다.
		// 콜백메소드의 파라미터자리는 개발자가 아닌 JVM에서 주입받는다.		
		
		Object obj = e.getSource();
		
		// 조회버튼 눌렀을 때
		if(obj==jbtn_sel) {
			boardController = new BoardController();
			boardController.getBoardList();
		}		
	} 
	public static void main(String[] args) {
		BoardView bview = new BoardView();
		bview.initDisplay();
	}

}
