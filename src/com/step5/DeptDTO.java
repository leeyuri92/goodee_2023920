package com.step5;

public class DeptDTO {
	private int deptno;
	private String dname;
	private String loc;
	public DeptDTO() {}
	// 생성자의 파라미터 자리를 통해서 전역변수의 초기화(재정의) 함
	public DeptDTO(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	private EmpDTO empDTO;  // 참조하고자 하는 클래스를 변수로 선언

	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}


	public EmpDTO getEmpDTO() {
		return empDTO;
	}


	public void setEmpDTO(EmpDTO empDTO) {
		this.empDTO = empDTO;
	}


	public static void main(String[] args) {

	}

}
