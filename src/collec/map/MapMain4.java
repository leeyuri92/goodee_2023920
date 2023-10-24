package collec.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import collec.list.CustomerVO;

class Map4{
	Map<String, CustomerVO> map = new HashMap<>(); 

	Map4() {		
		CustomerVO cvo = new CustomerVO();
		cvo.setC_name("나신입");
		cvo.setC_id(1);
		cvo.setC_birthday("1992-06-27");
		map.put("1", cvo); 		
	}
	void mapDelete() {
		map.remove("1");
	}
}
public class MapMain4 {

	public static void main(String[] args) {
		Map4 m4 = new Map4();
		System.out.println(m4.map);	
		Set<Map.Entry<String, CustomerVO>> entrySet = m4.map.entrySet();
		Iterator<Map.Entry<String, CustomerVO>> enIterator = entrySet.iterator();
		while (enIterator.hasNext()) {
			Map.Entry<String, CustomerVO> entry = enIterator.next();
			String key = entry.getKey();
			CustomerVO cvo = entry.getValue();
			System.out.println(key+", "+cvo);			
		}		
		//m4.mapDelete();
		m4.map.clear();
		System.out.println("삭제후 : " + m4.map);		
	}
}
