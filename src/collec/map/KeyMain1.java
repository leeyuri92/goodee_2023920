package collec.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeyMain1 {

	public static void main(String[] args) {
		Map<Integer, Integer>map = new HashMap<>();
		map.put(new Integer(1), 85);  // autoboxsing 원시형 int integer
		map.put(2, 75);
		map.put(3, 65);
		Object names[] = null;
		// System.out.println(names.length);   NullPointerException
		// String names[] = {"나신입", "나초보", "나일등"};
		//Set<Integer> set = map.keySet();
		//names=set.toArray();
		
		names = map.keySet().toArray();
		System.out.println(names.length); //3
		for(int i = 0; i<names.length;i++) {
			int key = (Integer)names[i];
			System.out.println(key);
		}
	}

}
