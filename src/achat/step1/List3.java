package achat.step1;

import java.util.ArrayList;
import java.util.List;

class Kiwi{
	String name = null;
}
class Tomato{}

public class List3 {
	List<String>bread = new ArrayList<>();
	List<Kiwi>kiwis = new ArrayList<>();
	List<Tomato>tomatos = new ArrayList<>();
	
	void methodA() {
		
		bread.add("소보로");
		// kiwis.add("키위");
		
		Kiwi kiwi = new Kiwi();
		kiwi.name = "골드키위";
		kiwis.add(kiwi);
		
		Kiwi kiwi2 = new Kiwi();
		kiwi2.name = "키위투";
		kiwis.add(kiwi2);
		
		Tomato tomato = new Tomato();
		tomatos.add(tomato);
	}
	void methodB() {
		
		Kiwi kiwi = null;
		int i = 1;
		while(true) {
			kiwi = new Kiwi();
			System.out.println(kiwi);
			i++;
			if(i==5) {
				break;
			}
			
		}
	}

	public static void main(String[] args) {
		List3 list3 = new List3();
		list3.methodA();
		System.out.println(list3.bread.size());       // 1
		System.out.println(list3.kiwis.size());        // 2
		System.out.println(list3.tomatos.size());   // 1
		
		list3.methodB();
		
	}
}
