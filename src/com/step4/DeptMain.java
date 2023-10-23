package com.step4;
// 아래코딩상활을 그림으로 그려본다.
// GLogic에서 GView의 j를 사용하고 싶다 
// GView에서 GLogic의 i를 사용하고 싶다
// 사용자정의 클래스와 자바제공하는 클래스 사이에 활용하기 가능한가?
class Dept{
	// 전변은 초기화를 생략할 수 있다 왜냐면 생성자가 대신 해주니까
	private int deptno;
	private String dname;
	private String loc;
	Dept(){}
	Dept(int deptno, String dname, String loc){
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;	
	}
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
}
public class DeptMain {
	/*
	 *  Dept클래스에 getter와 setter를 두는 건 결국 전역변수를 사용하기 위함이다.
	 *  부서관리 - ERP
	 *  업무담당자 - 150명 - web 서비스 - 동기화가능함
	 *  150명 - 인스턴스를 갖는다 - 하나야 - 스레드로 지원함 - 싱글톤 - 영속성을 유지해야 한다면 (오라클,MySQL)
	 *  세션과 쿠키(시간지정할 수 있음)
	 *  그 스레드에 그 인스턴스는 지변성격이다.
	 */

	public static void main(String[] args) {
		Dept dept = new Dept();
		// 생성자를 활용해서도 캡슐화된 전변을 재정의할 수 있다.
		// 이 때 생성자 내부에서는 반드시 전변과 생성자의 파라미터 값을 동기화 해줄것 - 빠뜨리면 다른 값을 가질 테니까 -망함
		Dept dept1 = new Dept(10,"개발1팀","부산");
		// 인스턴스화를 해도 안된다. - 캡슐레이션 - 캡슙화 - 그 사물을 정의하는 아주 중요한 고유명사
		System.out.println(dept.getDeptno());
		//dept1 = null; // 캔디데이트 상태 -> 쓰레기 값이 됨 -> dept1 = new Dept();
		dept1.setDeptno(100);  // NullPointerException
		dept1.setDname("운영1팀");
		dept1.setLoc("제주");
		System.out.println(dept1.getDeptno()+dept1.getDname()+dept1.getLoc());
		

	}

}
