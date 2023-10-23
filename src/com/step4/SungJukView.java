package com.step4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SungJukView implements ActionListener {
	
	String col[] = { "이름", "오라클", "자바", "HTML", "총점", "평균", "학점", "석차" }; // 컬럼명
																			// 생성
	int p_num = 0; // 입력 받을 사람수 저장할 변수

	DefaultTableModel dtm;
	JTable table; // = new JTable(value, col); 테이블
	JScrollPane jsp; // = new JScrollPane(table); 스크롤

	JFrame jf_sungjuk = new JFrame();
	// JFrame에 붙일 속지 두 개 선언하고 생성하기
	JPanel jp_center = new JPanel();
	// 배치-jp_center 속지 중앙에 배치하자
	JPanel jp_north = new JPanel();
	JPanel jp_south = new JPanel();


	
	JButton jbt_clear = new JButton("전체 삭제");
	JButton jbt_selectDelRow = new JButton("선택 삭제");
	JButton jbt_add = new JButton("추가");
	
	
	//텍스트 입력창 선언
	JTextField jt_name = new JTextField(6);
	JTextField jt_oracle = new JTextField(6);
	JTextField jt_java = new JTextField(6);
	JTextField jt_html = new JTextField(6);
	
	
	
	JButton jbt_process = new JButton("점수계산");
	JButton jbt_exit = new JButton("종료");
	

	public void initDisplay() {
		
		
		
		System.out.println("initDisplay 호출성공");

		jp_center.setLayout(new BorderLayout(0, 20));

		// 버튼 동작 등록
		
		jbt_clear.addActionListener(this); // 표지우기
		jbt_selectDelRow.addActionListener(this); //선택된 행만 지우기 
		jbt_process.addActionListener(this); // 처리
		jbt_add.addActionListener(this); // 처리
		jbt_exit.addActionListener(this); // 종료


		jp_north.add(jbt_selectDelRow);
		jp_north.add(jbt_clear);
		
		//텍스트 창 붙이기
		jp_south.add(jt_name);
		jp_south.add(jt_oracle);
		jp_south.add(jt_java);
		jp_south.add(jt_html);
		
		//텍스트 입력창 초기화 부분		
		jt_name.setText("");                    //이름 텍스트입력창 초기값
		jt_oracle.setText("");           //오라클 텍스트입력창 초기값
		jt_java.setText("");
		jt_html.setText("");
		
		//동작 버튼 붙이기
		jp_south.add(jbt_add);
		jp_south.add(jbt_process);
		jp_south.add(jbt_exit);
		
		dtm = new DefaultTableModel(col,0);            //디폴트 테이블 생성 col 배열에 있는 값들로 컬럼이름 하고, p_num만큼 밑에 행열 생성함
		table= new JTable(dtm);	                                    //테이블 생성(디폴트 테이블에 정해둔 값으로 생성됨)
		jsp=new JScrollPane(table);									//스크롤바 붙임
	    jp_center.add("Center",jsp);
	    jp_center.validate();
				
		jf_sungjuk.setBackground(new Color(214, 211, 206));

		// 속지 두 장을 JFrame에 붙이기
		jf_sungjuk.add("Center", jp_center);
		jf_sungjuk.add("South", jp_south);
		jf_sungjuk.add("North", jp_north);
		jf_sungjuk.setSize(600, 400);

		jf_sungjuk.setTitle("성적처리");// 메소드 구현할 때에는 타입이 오고 호출할 때에는 타입을 쓰지 않는다.
		// 호출 하는 거니까 타입이 필요가 없습니다.
		jf_sungjuk.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		//이벤트가 발생한 컴포넌트의 주소번지 가져오기 - 어떤 버튼을 눌렀나?
		Object obj = ae.getSource();
		

	if(obj==jbt_process)
	{
		p_num=dtm.getRowCount();     //계산할때 인원수는 현재 테이블의 행 숫자이므로
	}
	else if(obj==jbt_add)
	{
		String input[] = new String[col.length];    //사용자값 저장할 배열 선언, col배열길이만큼
		input[0]=jt_name.getText();       //이름 input[0]에 저장
		input[1]=jt_oracle.getText();      //오라클점수
		input[2]=jt_java.getText();        //자바점수
		input[3]=jt_html.getText();      //html점수
		
		dtm.addRow(input);
		
		 //입력값 저장 하고 나서 텍스트입력 칸 다시 초기화 해두기
		jt_name.setText("");                 
		jt_oracle.setText("");
		jt_java.setText("");
		jt_html.setText("");
		
	}
	else if(obj==jbt_selectDelRow)
	{	//테이블 선택했을때 .getSelectedRow() 메소드 값은 그 행의 값이 나오고
		//아무것도 선택 안되어잇을때는 -1을 전달함.
		if(table.getSelectedRow()==-1) //-1일때(아무것도 선택되지 않았을때
		{										 //if문 탈출할때 return;을 사용함	
			return;                            //따라서 삭제 버튼 눌렀을때 아무일도 일어나지 않는다.
			                                    
		}
		else                                    //행이 선택되어있을때
		{
			dtm.removeRow(table.getSelectedRow());   //선택된 행값을 가져와서 삭제메소드실행
		}
			
	}
	else if(obj==jbt_clear)               //전체 삭제
	{

		for(int i = dtm.getRowCount(); i>0; i--)          //행갯수만큼 삭제메소드 반복실행
		{
			dtm.removeRow(0);
		}
		
	}
		
	else if(obj==jbt_exit)
	{
			System.exit(0); //자바 가상머신과 연결이 끊김
    }
}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		SungJukView sj = new SungJukView();
		sj.initDisplay();
	}
}