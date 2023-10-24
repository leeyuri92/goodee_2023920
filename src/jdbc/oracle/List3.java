package jdbc.oracle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class List3 {
	void methodA(List<BookVO> bookList) {

		System.out.println(bookList);                         //[jdbc.oracle.BookVO@372f7a8d]
//		BookVO rbVO = bookList.get(0);
//		System.out.println((Integer)rbVO.getB_price() instanceof Integer);  // true
//		System.out.println("10"+10);                                                   //1010
//		System.out.println(rbVO.getB_price()*5);                                   // 150000
		
	}
	void methodB(List<Map<String, Object>> bookList) {
		
		System.out.println(bookList);    // [{b_price=30000, b_no=1, b_title=자바의정석, b_author=남궁성}]
//		Map<String, Object> rmap = bookList.get(0);
//		System.out.println(rmap.get("b_price") instanceof Integer);   // true
//		System.out.println(rmap.get("b_price") instanceof String);    // false
//		System.out.println(rmap.get("b_price") instanceof Object);   // true
	}

	public static void main(String[] args) {
		List3 li3 = new List3();
		List<BookVO> bookList = new ArrayList<>();
		BookVO bVO = new BookVO(); 
		
		bookList.add(bVO);
		System.out.println(bookList); // [jdbc.oracle.BookVO@372f7a8d]

		bVO.setB_no(1);
		bVO.setB_title("자바의정석");
		bVO.setB_author("남궁성");
		bVO.setB_price(30000);  // int
		bookList.add(bVO);  // bookList.size() = 1 
		// add할 때 BookVO 주소번지가 하나 담겼다. 그 안에는 변수가 4개 선언되어있다.		
		
		List<Map<String, Object>> bookMap = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		Map<String, Object> map2 = new HashMap<>();

		//bookMap.add(bVO); 제네릭 타입이 달라서 컴파일에러 발생 
		//bookMap.add(map);  // 빈깡통
	
		map.put("b_no",1);
		map.put("b_title","자바의정석");
		map.put("b_author","남궁성");
		map.put("b_price",30000);  // object
		bookMap.add(map);  
		bookMap.add(map2);  // 빈깡통
		
		System.out.println(map);   // {b_price=30000, b_no=1, b_title=자바의정석, b_author=남궁성}
		System.out.println(map2);   // {b_price=30000, b_no=1, b_title=자바의정석, b_author=남궁성}
		System.out.println(bookMap); // [{b_price=30000, b_no=1, b_title=자바의정석, b_author=남궁성}, {}]
		System.out.println(bookList); // [jdbc.oracle.BookVO@372f7a8d]

		
		//li3.methodA(bookList);   //[jdbc.oracle.BookVO@372f7a8d]
		//li3.methodB(bookMap);  //[{b_price=30000, b_no=1, b_title=자바의정석, b_author=남궁성}]

	}

}
