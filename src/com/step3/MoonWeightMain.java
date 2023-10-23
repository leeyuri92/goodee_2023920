package com.step3;
//Scanner는 java폴더 아래 util폴더 아래 선언되어 있는 클래스 이다.
//자바가상머신을 설치하면 내장되어 있는 클래스 이다.
//import문을 써야 하는 건 java.lang 폴더가 아닌 폴더는 JVM이 찾을 수가 없어서
//반드시 import문으로 물리적인 위치를 나타낸다.
//Scanner클래스 내부에도 여러개의 메소드가 정의되어 있다.
//어떤 메소드가 있는지는 인스턴스화 한 후에 인스턴스 변수.찍고 기다리면 quick fix기능
//제공되어 확인해 볼 수 있다. - 
//이클립스는 JVM에서 제공하는 API 즉 document문서를 제공받고 있어서 
//그 내용을 보여주는 것이다.
import java.util.Scanner;

//변수가 필요한가? - 그렇다면 몇 개가 필요한가요?
class MoonWeight{
	//굳이 사용자로 부터 입력 받는 값을 별도의 메소드로 선언해 보기
	//리턴타입을 int로 한 이유가 뭐죠? - 사용자가 콘솔에 입력한 값을 읽어오는 메소드가
	//nextInt()인데 이메소드의 소유주가 Scanner이다.
	//nextInt로 읽어오는 값이 int이므로 메소드 설계시 리턴타입은 동일한 int로 결정함.
	//화면쪽에 리액트가 활용되고, 더해서 타입스크립트가 등장하면서 this가 
	//소스에 따라서 this가 참조하는 객체가 달라졌다. - 초보 개발자  -this이슈 - 함수형 -> 코드양 줄어듦 ->람다식(EcmaScript2015년 6버전)
	int getUser() {
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		return user;
	}
	double account(int earth) {//earth = 80
		double moon = 0.0;//지변으로 처리
		moon = (earth*17)/100.0;//(80*17)/100.0
		return moon;
	}
}
public class MoonWeightMain {

	public static void main(String[] args) {
		System.out.println("당신의 몸무게를 입력하세요.");
		MoonWeight mw = new MoonWeight();
		//메소드 호출 결과를 굳이 리턴타입으로 받아서 처리하는 방법과
		//변수로 받지 않고 메소드 호출을 직접 하는 경우의 차이가 있다|없다.
		//문제점 지적 -  인스턴스 변수 하나에 대해서 입력받은 지구의 몸무게 값도 하나이어야 하는데
		//만일 변수로 치환하지 않고 매번 메소드를 새로 호출하면 입력받는 값이 그 때 마다 달라질 수 있어서 
		//이런 상황일때는 리턴타입으로 받아서 그 변수를 사용할것.
		int user = mw.getUser();
		System.out.println("사용자가 입력한 값은 " +user+" 입니다.");
		System.out.println("달의 몸무게는 "+mw.account(user) + " 입니다.");
	}
}
