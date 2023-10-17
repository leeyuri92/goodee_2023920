package com.step5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
// ActionListener al = new DeptManager();
//자바는 단일 상속만 가능하다.- 다중상속은 불가함 - 다중상속의 단점을 보완하기 위해 인터페이스가 제공됨
//단 인터페이스는 여러개를 implements할 수 있다.(추상클래스, 인터페이스는 설계관점에서 중요함 - 특징, 컨벤션)
public class DeptManager extends JFrame implements ActionListener{
	//선언부
	List<DeptDTO> deptList = new ArrayList<>();//왜 전역변수로 하는가? 입력|수정|삭제|조회
	String header[] = {"부서번호","부서명","지역"};
	String datas[][] = new String[3][3];//2차배열 - 대괄호가 2쌍이 필요함
	//생성자의 파라미터를 통해서 서로 다른 클래스가 의존관계를 맺고 하나의 기능을 서비스 할 수  있다.
	//생성자도 파라미터를 여러개 갖을 수 있다. - 메소드 오버로딩
	DefaultTableModel dtm_dept = new DefaultTableModel(datas, header);//<table>-양식  자바가 있어야 DataSet구성함
	JTable jt_dept = new JTable(dtm_dept);
	JScrollPane jsp_dept = new JScrollPane(jt_dept);
	JPanel jp_north = new JPanel();
	JButton jbtnSelect = new JButton("조회");
	JButton jbtnDelete = new JButton("삭제");
	JButton jbtnAdd = new JButton("행추가");
	JButton jbtnDel = new JButton("행삭제");
	JButton jbtnExit = new JButton("종료");
	
	//생성자
	DeptManager(){
		getDeptList();
		initDisplay();
	}////////////// end of DeptManager
	public List<DeptDTO> getDeptList(){
		DeptDTO dept = new DeptDTO(10,"영업부","부산");
		deptList.add(dept);
		dept = new DeptDTO(20,"개발부","대전");
		deptList.add(dept);
		dept = new DeptDTO(30,"운영부","인천");
		deptList.add(dept);
		return deptList;
	}
	//화면 처리부
	public void initDisplay() {
		jbtnSelect.addActionListener(this);
		jbtnDelete.addActionListener(this);
		jbtnAdd.addActionListener(this);//행추가
		jbtnDel.addActionListener(this);//행삭제
		jp_north.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp_north.add(jbtnSelect);
		jp_north.add(jbtnDelete);
		jp_north.add(jbtnAdd);//행추가 JPanel붙이기
		jp_north.add(jbtnDel);
		jp_north.add(jbtnExit);
		this.add("North", jp_north);
		this.add("Center", jsp_dept);
		this.setSize(500, 400);//this:DeptManager
		this.setVisible(true);
	}//////////// end of initDisplay  /////////////
	//메인 메소드
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		DeptManager dm = new DeptManager();//new JFrame()호출되는 것이다.
	}//////////////// end of main ////////////////
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed호출은 반드시 addActionListener가 있어야 됨");
		Object obj = e.getSource();
		//행삭제해 보기
		if(obj == jbtnDel) {
			dtm_dept.removeRow(0);
		}
		//행추가해보기
		else if(obj == jbtnAdd) {
			//Vector addRow = new Vector();
			Object addRow2[] = new Object[3];
			dtm_dept.addRow(addRow2);
		}
		//너 삭제 할거니?
		else if(obj == jbtnDelete) {
			int index = jt_dept.getSelectedRow();//사용자가 선택한 로우의 index값을 반환함
			if(index<0) {//-1반환(EOF)
				JOptionPane.showMessageDialog(this,"삭제할 데이터를 선택하시오.","INFO", JOptionPane.INFORMATION_MESSAGE);
				return;//메소드 탈출
			}
			//여기로 못오게 함
			else {
				System.out.println(index);//index값을 add(int, E)  1 remove(1), 
				//insert here
				DeptDTO rdept=deptList.remove(index);
				System.out.println(rdept+", rdept.getDeptno():"+rdept.getDeptno());
				//insert here - 삭제 성공하였습니다.
				if(rdept !=null) {
					JOptionPane.showMessageDialog(this, "삭제 성공하였습니다.","Info" , JOptionPane.INFORMATION_MESSAGE);
					refreshData();
				}else {
					JOptionPane.showMessageDialog(this, "삭제 실패하였습니다.","Info" , JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
		}
		//너 조회버튼 누른거야?
		else if(obj == jbtnSelect) {
			System.out.println("조회버튼 클릭");//log
			//웹 개발이더라도 html이 데이터를 쥘수는 없다
			//html과 자바코드를 섞어쓰기가 가능한가? - 불가 - jsp공부함  - 자바자료구조를 JSON형식으로 넘기기
			//dtm_dept는 실제 데이터를 포용함
			//JTable은 클릭이벤트 같은 것은 가능함 - 실제 데이터를 쥐고 있지 못함
			//getRowCount는 데이터의 로우 수 반환 - 3건
			while(dtm_dept.getRowCount()>0) {//dtm은 데이터셋(자바측)받는 클래스이다.
				dtm_dept.removeRow(0);//0번째 로우를 지우는 이유는 로우가 삭제 될때 마다 dtm의 로우수가 줄어든다. - 왜?
			}
			for(int i=0;i<deptList.size();i++) {
				DeptDTO rdept = deptList.get(i);
				Vector<Object>  v = new Vector<>();//3번 생성됨
				v.add(0,rdept.getDeptno());
				v.add(1,rdept.getDname());
				v.add(2,rdept.getLoc());
				dtm_dept.addRow(v);
			}
		}////////////////// end of if ///////////////
		
	}///////////////////// end of actionPerformed
	//새로고침(F5) 구현하기
	public void refreshData() {
		while(dtm_dept.getRowCount()>0) {//dtm은 데이터셋(자바측)받는 클래스이다.
			dtm_dept.removeRow(0);//0번째 로우를 지우는 이유는 로우가 삭제 될때 마다 dtm의 로우수가 줄어든다. - 왜?
		}
		for(int i=0;i<deptList.size();i++) {
			DeptDTO rdept = deptList.get(i);
			Vector<Object>  v = new Vector<>();//3번 생성됨
			v.add(0,rdept.getDeptno());
			v.add(1,rdept.getDname());
			v.add(2,rdept.getLoc());
			dtm_dept.addRow(v);
		}		
	}//////////////////end of refreshData //////////////////
}