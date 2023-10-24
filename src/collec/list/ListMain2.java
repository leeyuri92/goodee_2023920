package collec.list;

import java.util.ArrayList;
import java.util.List;

class List2{
	List<Integer> li = new ArrayList<>();
	List<String> names = null;
	boolean isOK = false;
	List2(){
		// insert here - names를 인스턴스화 하는 문장을 작성하시오
		names = new ArrayList<>();
		// 같은 이름(기능)의 메소드라 하더라도		
		// add(int, element):void - 리턴타입이 void이라서 대입연산자로 받을 수 없다.
		// API에서 제공되는 메소드 중에서 처리 결과를 받을 수 있는 메소드가 있다. - boolean
		// if(isOK) System.out.println("처리 성공"); else System.out.println("처리 실패")
		
		// insert here - li에 숫자 1을 담는 코드를 작성하시오 - boolean isOK = add(Object obj)
		boolean isOK = li.add(1);  //li.size()=1; List의 기호는 [1] 
		this.isOK = isOK;
		System.out.println("isOK가 true이면 데이터 추가를 성공했다는 것이다.");  // 사용자에 대한 응답처리의 기준값으로 사용됨
		// 사용자 정의 메소드를 구현할 때에 리턴타입에 대해서 신중하게 결정한다.
		names.add("나신입");
		System.out.println(names);
		Object obj = names.set(0, "나초보");  // add로 하면 size - 2, set으로 하면 size는 늘 1이다.
		
	}
}
public class ListMain2 {

	public static void main(String[] args) {
		// insert here - [1]을 출력하는 문장을 적으시오
		List2 li2 = new List2();
		System.out.println(li2.li);
		// insert here - [나신입]을 출력하는 문장을 적으시오
		System.out.println(li2.names);
		// 18번 라인에서 처리된 결과를 여기(ListMain2)에서 출력하고 싶다. -  isOK가 지변이라 어렵다. 전변으로 만들자.
		System.out.println(li2.isOK);
		// 22번에서 전변에 초기화를 다시 하면 한 번 생성된 인스턴스 변수에 대해서 isOK값은 하나의 값만 가진다.
		
	}
}
