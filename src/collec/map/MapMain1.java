package collec.map;

import java.util.HashMap;
import java.util.Map;

class Map1{
	Map<String, Object> map = new HashMap<>(); 
	// 생성부와 선언부가 다르면 - 다형성
	// 다를 수 밖에 없다. Map은 인터페이스이기 때문에 
	
	Map1() {
		System.out.println(map.size()); // 0
		map.put("1", 1);  
		System.out.println(map.size()); // 1
		System.out.println(map);   // {1=1}  -> JSON {"1":1, "c_name":"나신입",} -Map 구조이다 -> Javascript로 꺼내야 해용
		System.out.println(map.containsKey("1"));   
		System.out.println(map.containsKey("2"));
		// JSON 포멧에서 [{},{},{}... label:[{},{},{}...]]
	}
	Map1(int i) {
		map = new HashMap<>();  // 새로운 객체를 생성함 - 복제본이다.  map.size() = 0
		System.out.println(map.size()); // 0
	}	
}

public class MapMain1 {

	public static void main(String[] args) {
		Map1 m1 = new Map1();   // 전변이 읽혀진다. - 디폴트 생성자가 호출되었으니까 출력이 될거야
		Map1 m2 = new Map1(50000);  // 생성자에서 50000을 사용하고 있지 않으므로 어떤 값을 치환해도 의미 없다.
		System.out.println(m1.map.get("1"));
	
	}

}
