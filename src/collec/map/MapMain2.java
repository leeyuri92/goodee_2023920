package collec.map;

import java.util.HashMap;
import java.util.Map;

import collec.list.CustomerVO;

class Map2{
	Map<String, CustomerVO> map = new HashMap<>(); 
	// 생성부와 선언부가 다르면 - 다형성
	// 다를 수 밖에 없다. Map은 인터페이스이기 때문에 
	
	Map2() {
		System.out.println(map.size()); // 0
		
		CustomerVO cvo = new CustomerVO();
		cvo.setC_name("나신입");
		cvo.setC_id(1);
		cvo.setC_birthday("1992-06-27");
		map.put("1", cvo); 		
		System.out.println(map.size()); // 1
		// map 안에 키가 "1"인 값은 CustomerVO타입이다.
		// 이것을 증명할 수 있는 낱말카드를 나는 작성할 수 있다.
		
		
		//System.out.println(map); 
		//System.out.println(map.containsKey("1"));   
		//System.out.println(map.containsKey("2"));
	}
}

public class MapMain2 {

	public static void main(String[] args) {
		System.out.println("main");
		Map2 m2 = new Map2();
		CustomerVO cvo = m2.map.get("1");
		System.out.println(cvo);                    //collec.list.CustomerVO@2f92e0f4
		System.out.println(m2.map.get("1"));   //collec.list.CustomerVO@2f92e0f4
		
		System.out.println(cvo.getC_name());                         // 나신입
		System.out.println(m2.map.get("1").getC_name());        // 나신입 - 매우 중요
		System.out.println(m2.map.get("1").getC_id());             // 1
		System.out.println(m2.map.get("1").getC_birthday());    //  1992-06-27
		
		System.out.println(cvo.getC_name().equals(m2.map.get("1").getC_name()));   // true 
		System.out.println(cvo instanceof CustomerVO);  // true
		System.out.println(m2.map.get("1") instanceof CustomerVO);  // true	
		// 화면 솔루션과 자바 연동 시 - 이종간에 연계할 때 자주사용되는 메소드(공통코드로 사용했던 부분)
	}
}
