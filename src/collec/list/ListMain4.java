package collec.list;
/*
 * 제네릭을 VO나 Map으로 선택하는 건 JSON형식에 사전 준비 작업이다.
 * 공공포털이나 회사들이 자신들의 서버를 공개하지 않는대신 요청에 대한 검색 결과를 JSON으로 제공한다.
 * List<VO> -> JSON,  JSON -> List<VO> , List<Map>바꾸어 쓸 수 있다.
입력 - add(element):boolean -> 응답처리시 선택, add(int, element):void -> 응답처리시 부적합
리턴타입이 boolean이라서 처리 결과에 대한 응답을 받아 볼 수 있다(보이지 않는걸 확인해줌)
메소드 선택시 기준이 될 수 있다. - 리턴타입이 있고 없고가 기준에 영향이 있다.
:사용자 정의 메소드를 설계할 때 리턴타입을 반드시 고려 하시오. - 안전한 코드를 작성하기위해
제네릭을 반드시 정한다. - 직관적이다. - 담는 사람도 꺼내는 사람도 기억할 수 없다.
그런데 서비스는 기억(알림설정, 메시지 푸쉬- 서비스)해준다.
수정 - set(int, element):Element(=Object) : 내가 추가한 것을 그대로 반환해준다.
상세보기
전체보기
삭제
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
//수정은 기존에 있는 정보를  바꾼다.
//입력은 새로운 정보를 추가한다.
class List4{
	List<Integer> rank = new ArrayList<>();//rank.size()=0
	void init() {//전역변수의 선언된 깡통에 3가지 정보를 추가하기
		rank.add(1);
		rank.add(2);
		rank.add(3);
	}
	//List에 등록된 순위를 수정하는 메소드 구현
	//사용자로 부터 두 개의 정보를 입력 받아온다.(UI, UX, View계층에서)
	boolean rankUpdate(int index, int value) {
		boolean isOk = false;
		Integer it = rank.set(index, value);  
		System.out.println(it);
	
		//41번을 경유하는지 아니면 스킵하게 되는 건지 짐작가능함
		int x = it;//오토박싱이 제공되고 있어서 원시형 타입과 래퍼클래스 타입사이에 형전환은 자동으로 해줌
		System.out.println(x+", " +value);
		//"1".equals("1")
		System.out.println(it == value);
		if(it !=null) {
		//if(it == value) {//사용자로 부터 받아온 값과 set메소드의 리턴값으로 받아온 값을 비교하기
			System.out.println("받아온 값과 수정된 값이 같니?");
			isOk = true;			
		}
		return isOk;
	}
}
public class ListMain4 {

	public static void main(String[] args) {
		System.out.println("수정하고자 하는 위치값과 숫자를 입력하시오. 예)위치값|변경할값");
		Scanner sc = new Scanner(System.in);//화면을 그리진 않지만 화면이 갖는 효과는 누릴 수 있다.
		//2|5 -> index=2, value = 5  3|7 -> index=3, value =7
		String user = sc.nextLine();
		StringTokenizer st = new StringTokenizer(user, "|");
		String imsi = st.nextToken();
		int index = Integer.parseInt(imsi);//String -> int 바꿔줘(기능:처리:메소드 힘)
		String value = st.nextToken();
		int ivalue = Integer.parseInt(value);//String -> int 바꿔줘(기능:처리:메소드 힘)
		List4 l4 = new List4();
		l4.init();
		boolean isOk = l4.rankUpdate(index, ivalue);
		if(isOk) {
			System.out.println("수정 처리되었습니다.");
			System.out.println(l4.rank);//[1,2,3] ->  1|3 -> [1,3,3]
		}
		else System.out.println("수정 실패하였습니다.");
	}

}
