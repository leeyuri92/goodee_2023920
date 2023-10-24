package collec.basic;
// 인스턴스화 -> 클래스 -> 추상클래스와 인터페이스 -> 생성자 호출 -> 파라미터자리(변수)
// 원시형 타입을 왜 인티저라는 랩퍼로 클래스화 한건가
// int -> Wrapper 클래스 이름 integer(변수와 메소드를 소유할 수 있다.)

import java.util.ArrayList;
import java.util.List;

class A{
	List<Integer> nums = new ArrayList<>();
	int ival;
	String s = null;
	String s1 = new String();
	// 생성자 2개 - 메소드 오버로딩 - 파라미터 타입이나 갯수가 달라야 한다.   
	A(){
		s = new String("나신입");
	}
	A(int ival){
		s = new String("나초보");
	}
	A(String name){
		s = new String(name);
	}
	
}

public class AMain {

	public static void main(String[] args) {
		System.out.println("main 호출");   // A클래스의 전변들은 읽혀졌을가? 아니요  -> 인스턴스화를 해야해 , A를 ! 
		String s =null;     // 오토메틱 베리어블, 자동으로 소멸되기 때문, 지역변수 특징 
		System.out.println(s); // 선언이 먼저되어야 호출이 가능, 
		
		A a = new A("나신입");
		System.out.println(a.s);
		
		// 생성자의 파라미터 자리(메소드오버로딩) 활용하여 문제를 해결해 보세요.

	}

}
