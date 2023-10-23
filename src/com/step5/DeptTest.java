package com.step5;
//데이터 처리하기 - 클래스 설계(VO-value object패턴, DTO-data transfer object패턴)
//변수의 선언 목적은? - 기억해줘 - 하나만 아니고 여러개를 한 번에 기억해줘 - 여러개가 관계가 있다
//여러개의 변수를 선언하고 있는 DeptVO 설계하였다. - 한 번에 한 개로우만 담을 수 있다. - 여러개의 로우는 못 담는다. - 객체배열이면 가능함
//DeptVO dVO = new DeptVO();
class DeptVO{
	private int deptno;//0
	private String dname;//
	private String loc;//
	public DeptVO() {}
	public DeptVO(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	public int getDeptno() {
		return deptno;//캡슐화로 인해서 직접 접근 불가능함 - 
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
}
public class DeptTest {

	public static void main(String[] args) {
		 DeptVO dVOs[] = new DeptVO[3];
		 System.out.println(dVOs[0]+", "+dVOs[1]+","+dVOs[2]);
		 DeptVO dVO1 = new DeptVO(10,"영업부","대전");
		 System.out.println(dVO1);
		 dVOs[0] = dVO1;
		 System.out.println(dVOs[0]);
		 DeptVO dVO2 = new DeptVO(20,"개발부","부산");
		 System.out.println(dVO2);
		 dVOs[1] = dVO2;
		 System.out.println(dVOs[1]);
		 DeptVO dVO3= new DeptVO(30,"운영부","대구");
		 System.out.println(dVO3);
		 dVOs[2] = dVO3;
		 System.out.println(dVOs[2]);
		 if(dVOs[2]==dVO3) System.out.println("같은 주소번지다.");
		 for(int i=0;i<dVOs.length;i++) {
			 //dVOs[i] = new DeptVO(10,"영업부","대전");
			 System.out.println(dVOs[i].getDeptno()+", "+dVOs[i].getDname()+","+dVOs[i].getLoc());
		 }

	}

}
