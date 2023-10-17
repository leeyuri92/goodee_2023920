package com.step2;

public class DeptSimulation {
  public static void main(String[] args) {
    // Dept클래스를 설계하고 그 안에 부서집합에 필요한 변수 3개를 선언하였다.
    // 단. 접근제한자를 private으로 하여 직접 접근이 불가하도록 하였다.
    // 왜냐면 외부에서 인스턴스 변수를 가지고 위변조를 막고 싶어서 그렇게 하였다.
    Dept dept = new Dept();
    // dept.deptno = 10;
    dept.setDeptno(10);
    dept.setDeptno(20);
    int deptno = 30;
    dept.setDeptno(deptno);
    System.out.println(dept.getDeptno());
    //dept.dname = "개발부";
    dept.setDname("개발부");
    String dname = "운영팀";
    dept.setDname(dname);
    System.out.println(dept.getDname());
  }
}
