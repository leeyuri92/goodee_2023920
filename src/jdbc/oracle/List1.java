package jdbc.oracle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class List1 {

	public static void main(String[] args) {
		// List li2 = new List();  인터페이스와 추상클래스는 단독으로 인스턴스화 불가함
		Map<String, Object> map = new HashMap<String, Object>();
		List li = new ArrayList();  // li.size() = 0  
		System.out.println(li.size());    // 0
		System.out.println(li); // []
		li.add(map);   // li.size() = 1;  [{}]대괄호 - List, {} - Map -> JSON ->하이브리드앱(web+app)
		System.out.println(li.size()); //1
		map.put("b_no", 1);
		map.put("b_title", "자바의정석");
		System.out.println("====================================");
		// 서로다른 이종간에 연계처리시 서로 만나는 부분에 대한 추가 처리코드가 필요함
		// DataSet과 List, Map가 인터페이스 되는 부분(초기화하는)에서 자바의 역할이 필요하다
		// 그 자바코드는 TOBESOFT에서
		// 
		System.out.println(li instanceof List);  // 타입체크를 해주는 메소드
		System.out.println(li instanceof ArrayList);
		System.out.println("====================================");
		System.out.println(li.size()); //1
		
		System.out.println(map);  // {b_no=1, b_title=자바의정석}
		System.out.println(map.get("b_author"));  //null
		System.out.println(map.get("b_price"));   //null
		System.out.println(li);   //[{b_no=1, b_title=자바의정석}]
		
		int b_price = (int)map.get("b_price"); // VO와 Map 제네릭으로 선택했을 때 차이점 인지 : 타입이 맞지 않아요
		li = new Vector<>();
		li = new LinkedList<>();
		List<Map<String, Object>> li2 = new ArrayList<Map<String,Object>>();

	}

}
