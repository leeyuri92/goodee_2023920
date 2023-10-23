package com.step2;
// 클래스 안에 여러가지의 변수를 담을 수 있다.
public class Dept {
  private int deptno = 0; // 부서번호
  private String dname = null; // 부서명
  private String loc = null; // 근무지역
  // write, save

  public void setDeptno(int deptno){  
    this.deptno = deptno;
  } // set = private 변수에 값넣기
  public void setDname(String dname){
    this.dname = dname;
  }
  public void setLoc(String loc){
    this.loc = loc;
  }
  // read
  public int getDeptno(){
    return deptno;
  } // get = private 변수에 값 불러오기
  public String getDname(){
    return dname;
  }
  public String getLoc(){
    return loc;
  }
}
