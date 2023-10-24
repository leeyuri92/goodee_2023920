package collec.list;

import java.util.ArrayList;
import java.util.List;

class List1{
	// 아래 전변이 읽혀지는 순간은 인스턴스화 할 때 이다. -> 생성자가 호출되면 그 때 비로소 읽힘
	// 초기화문제 -> 시점[타임라인관계] -> 인터셉트 할 수 있다.(관여)
	List<Integer> nums = null;  // 선언만
	List1(){
		//nums = new ArrayList<>();  선언빼고(타입을 적지 않았으니까) 생성하기
		List<Integer> nums = new ArrayList<>(); 
	}
}
public class ListName1 {

	public static void main(String[] args) {
		List1 list1 = new List1();
		list1.nums = new ArrayList<>();
		System.out.println(list1.nums.size());  // 이와같은 방법은 전변일때만 가능
		// 지변일때는? 리턴타입으로 해결할 수 있다.
		//NullPointerException
		// list1은 null이 아니다.
		// list1.연산자 다음의 nums변수는 전변이라서 null이다.
		// 해결방법
		

	}

}
