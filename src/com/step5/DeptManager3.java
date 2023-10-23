package com.step5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.google.gson.Gson;
import com.util.DBConnectionMgr;
// ActionListener al = new DeptManager();
//자바는 단일 상속만 가능하다.- 다중상속은 불가함 - 다중상속의 단점을 보완하기 위해 인터페이스가 제공됨
//단 인터페이스는 여러개를 implements할 수 있다.(추상클래스, 인터페이스는 설계관점에서 중요함 - 특징, 컨벤션)
public class DeptManager3 extends JFrame implements ActionListener{
	//선언부
	//JDBC API 를 활용하여 오라클 서버에서 부서목록 조회하기
	Connection 					con  	= null;//연결통로확보
	PreparedStatement 	pstmt 	= null;//Connection생성되야 PreparedStatement메모리 로딩됨
	//데이터베이스가 지원하는 커서를 조작하는데 필요한 메소드를 정의하고 있는 인터페이스이다.
	ResultSet						rs			= null;//open..cursor..fectch..close 커서를 조작해서 원하는 정보를 반환받음
	//공통코드에서 재사용 가능한 메소드를 설계함
	DBConnectionMgr dbMgr = null;                                                       
	List<Map<String, Object>> deptList = new ArrayList<>();//왜 전역변수로 하는가? 입력|수정|삭제|조회
	String header[] = {"부서번호","부서명","지역"};
	String datas[][] = new String[0][0];//2차배열 - 대괄호가 2쌍이 필요함
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
	//A a = new A();//기초
	//A a = A.getInstance();//복제본을 허락하지 않고 원본 하나만 관리한다. - 싱글톤 패턴
	//B  b = new A();//추상클래스 상속관계
	//C c = new A();//인터페이스 구현체 클래스
	DeptManager3(){
		//메소드를 통해서 객체를 주입받고 있는데 .연산자 앞에 인스턴스변수가 아니라 클래스 타입이 직접 사용되었다.
		dbMgr  = DBConnectionMgr.getInstance();//초기화 하였다.
		//Calendar cal = Calendar.getInstance();
		initDisplay();
	}////////////// end of DeptManager

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
	//select가 모든 업무 페이지의 시작 페이지이므로  맡은 업무의 첫 시작임 - 
	//어떤 경우에 제네릭을 Map으로 가져갈 것인가? -  List<Map<String,Object>> -> 조인시에 선택한다
	//현재 메소드 getDTOList는 무엇이 문제인가?
	public List<DeptDTO> getDTOList(){//먼저 연습하고 Map을 연습 할것
		System.out.println("제네릭 타입을 getter/setter로 처리할때");
		List<DeptDTO> list = new ArrayList<>();//list.size()=0
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT deptno, dname, loc FROM dept");//4건 모두 조회함 10,20,30,40
		try {
			//아래 코드에서 NullPointerException이 발생 했다면 생성자에서 객체 주입이 안됨
			//dbMgr.코드에서 직접적인 원인이 있음
			//DBConnectionMgr이 생성되어야 getConnection메소드를 호출할 수 있을 것이고
			//호출이 되어야 리턴값으로 Connection 객체를 주입 받음
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			DeptDTO dto = null;
			while(rs.next()) {
				//아래 코드에서 반복문이 실행될 때마다 서로 다른 주소번지가 4개 만들어지니까
				//문제점 - DeptDTO는 테이블 dept테이블을 클래스로 설계한 것이다.
				dto = new DeptDTO(rs.getInt("deptno"), rs.getString("dname"),rs.getString("loc"));
				//아래 코드를 작성하지 않으면 4개의 정보가 모두 유지되지 않음
				list.add(dto);//0, null, null, 0 ,null, null, 0,null, null, 0 , null,null
			}
			System.out.println(list);
			//자바를 통해서 DB연동한 후에 후처리하기(자바컬렉션 프레임워크를 JSON포맷으로 변경함)
			//Gson g = new Gson();브라우저를 통해서 출력할 때만 사용하면 된다. - JSON포맷이어야 javascript에서 꺼내기가 가능함
			//String temp = g.toJson(list);
		} catch (SQLException se) {
			System.out.println(se.toString());//부적합한 식별자  - 컬럼명이 존재하지 않을 때 - SQLException해당됨
		} catch (Exception e) {
			e.printStackTrace();//stack메모리에 쌓여있는 에러 메시지 히스토리를 볼 수  있다.(라인번호와 함께 메시지 출력됨)
		}
		return list;
	}
	public List<Map<String,Object>> getMapList(){//2개 이상의 테이블 조인시 - 이것으로 연습 더 많이
		System.out.println("제네릭 타입을 Map으로 처리할 때");
		List<Map<String,Object>> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		//sql.append("SELECT deptno, dname, loc FROM dept");//4건 모두 조회함 10,20,30,40
		sql.append("SELECT empno, ename, sal, dname"); 
		sql.append("  FROM emp, dept               ");
		sql.append(" WHERE emp.deptno = dept.deptno");
		try {
			//아래 코드에서 NullPointerException이 발생 했다면 생성자에서 객체 주입이 안됨
			//dbMgr.코드에서 직접적인 원인이 있음
			//DBConnectionMgr이 생성되어야 getConnection메소드를 호출할 수 있을 것이고
			//호출이 되어야 리턴값으로 Connection 객체를 주입 받음
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			Map<String, Object> map = null;
			while(rs.next()) {
				//아래 코드에서 반복문이 실행될 때마다 서로 다른 주소번지가 4개 만들어지니까
				//문제점 - DeptDTO는 테이블 dept테이블을 클래스로 설계한 것이다.
				// 사용자 정의 DTO클래스 처럼 생성자를 만들어서 사용불가함 - 제공받는 클래스이다.
				map = new HashMap<>();
				
				//아래 코드를 작성하지 않으면 4개의 정보가 모두 유지되지 않음
				list.add(map);//0, null, null, 0 ,null, null, 0,null, null, 0 , null,null
			}
			System.out.println(list);
			//자바를 통해서 DB연동한 후에 후처리하기(자바컬렉션 프레임워크를 JSON포맷으로 변경함)
			//Gson g = new Gson();브라우저를 통해서 출력할 때만 사용하면 된다. - JSON포맷이어야 javascript에서 꺼내기가 가능함
			//String temp = g.toJson(list);
		} catch (SQLException se) {
			System.out.println(se.toString());//부적합한 식별자  - 컬럼명이 존재하지 않을 때 - SQLException해당됨
		} catch (Exception e) {
			e.printStackTrace();//stack메모리에 쌓여있는 에러 메시지 히스토리를 볼 수  있다.(라인번호와 함께 메시지 출력됨)
		}		
		
		return list;
	}	
	//메인 메소드
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		DeptManager3 dm = new DeptManager3();//new JFrame()호출되는 것이다.
	}//////////////// end of main ////////////////
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed호출은 반드시 addActionListener가 있어야 됨");
		Object obj = e.getSource();
		//행삭제해 보기
		if(obj == jbtnDel) {
			//dtm_dept.removeRow(0);
			int index = jt_dept.getSelectedRow();//사용자가 선택한 로우의 index값을 반환함
			if(index<0) {//-1반환(EOF)
				JOptionPane.showMessageDialog(this,"삭제할 행을 선택하시오.","INFO", JOptionPane.INFORMATION_MESSAGE);
				return;//메소드 탈출
			}		
			else {
				dtm_dept.removeRow(index);
			}
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
				Map<String,Object> map = deptList.remove(index);
				System.out.println(map+", rdept.get(DEPTNO):"+map.get("DEPTNO"));
				//insert here - 삭제 성공하였습니다.
				if(map !=null) {
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
			List<DeptDTO> list = getDTOList();//오라클 서버에서 조회한 결과를 쥐고 있다. - 리턴타입이 쥐고 있다.
			while(dtm_dept.getRowCount()>0) {//dtm은 데이터셋(자바측)받는 클래스이다.
				dtm_dept.removeRow(0);//0번째 로우를 지우는 이유는 로우가 삭제 될때 마다 dtm의 로우수가 줄어든다. - 왜?
			}
			
			for(int i=0;i<list.size();i++) {//list.size()=4이다. 10,20,30,40
				DeptDTO dept = list.get(i);
				Vector<Object>  v = new Vector<>();//3번 생성됨
				v.add(0, dept.getDeptno());
				v.add(1,dept.getDname());
				v.add(2,dept.getLoc());
				//addRow메소드의 오버로딩은 2가지 임 - 1)Vector, 2)Object[]
				dtm_dept.addRow(v);//4번 반복 되니까 - 로우에 추가하는 코드를 4번 실행함 - list.size()=4
			}
		}////////////////// end of if ///////////////
		
	}///////////////////// end of actionPerformed
	//새로고침(F5) 구현하기
	public void refreshData() {
		while(dtm_dept.getRowCount()>0) {//dtm은 데이터셋(자바측)받는 클래스이다.
			dtm_dept.removeRow(0);//0번째 로우를 지우는 이유는 로우가 삭제 될때 마다 dtm의 로우수가 줄어든다. - 왜?
		}
		for(int i=0;i<deptList.size();i++) {
			Map<String,Object> map = deptList.get(i);
			Vector<Object>  v = new Vector<>();//3번 생성됨
			v.add(0,map.get("DEPTNO"));
			v.add(1,map.get("DNAME"));
			v.add(2,map.get("LOC"));
			dtm_dept.addRow(v);
		}	
	}//////////////////end of refreshData //////////////////
}
