package jdbc.oracle;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
	Map<String, Object> map = null; // 한개로우만 담는다.
	// 컬럼 하나만 담을 수 있다. 나머지는 null값으로 됨
	
	void methodA() {
		map =new HashMap<>();
		map.put("b_title", "자바의 정석");
		map.put("b_author", "남궁성");
		map.put("b_price", 30000);
	}
	
	void methodAPrint() {		
		if(map!=null) {
			System.out.println(map.get("b_title"));		
			System.out.println(map.get("b_author"));		
			System.out.println(map.get("b_price"));			
		}else {
			System.out.println("조회할 수 없습니다. null임");
		}
	}
	
	void methodB(Map<String, Object> pmap) {
		pmap.put("제발", "되라");
	}
	
	Map<String, Object> methodC(Map<String, Object> pmap){
		Map<String, Object> rmap = null;
	    rmap = new HashMap<String, Object>();
		rmap.put("이건","뭐지");
		return rmap;
	}	

	public static void main(String[] args) {
		Map1 m1 = new Map1();
		m1.methodA();
		m1.methodAPrint();
		m1.methodC("d","d");
	}
}
