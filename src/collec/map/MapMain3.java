package collec.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import collec.list.CustomerVO;

class Map3{
	Map<String, List<Map<String, CustomerVO>>>  map = new HashMap<>();
	
	Map3() {
		List<Map<String, CustomerVO>> list = new ArrayList<>();
		Map<String, CustomerVO> imap = new HashMap<>();
		CustomerVO cvo = new CustomerVO();
		
		cvo.setC_id(12);
		cvo.setC_name("토마토");
		cvo.setC_birthday("2000-5-11");
		
		imap.put("1", cvo);
		list.add(imap);
		map.put("outer", list);
	}
}
public class MapMain3 {

	public static void main(String[] args) {
		Map3 m3 = new Map3();
		
		System.out.println(m3.map.get("outer"));                                                                   // [{1=collec.list.CustomerVO@2f92e0f4}]
		System.out.println(m3.map.get("outer") instanceof List);                                               // true
		System.out.println(m3.map.get("outer").get(0));                                                           // {1=collec.list.CustomerVO@2f92e0f4}
		System.out.println(m3.map.get("outer").get(0) instanceof Map);                                     // true
		System.out.println(m3.map.get("outer").get(0).get("1"));                                                // collec.list.CustomerVO@2f92e0f4
		System.out.println(m3.map.get("outer").get(0).get("1") instanceof CustomerVO);               // true      		
		System.out.println(m3.map.get("outer").get(0).get("1").getC_id());                                   // 12
		System.out.println(m3.map.get("outer").get(0).get("1").getC_name());                              // 토마토
		System.out.println(m3.map.get("outer").get(0).get("1").getC_birthday());                          // 2000-5-11	
	}
}
