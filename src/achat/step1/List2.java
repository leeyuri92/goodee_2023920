package achat.step1;

import java.util.List;
import java.util.Vector;

class Customer2 extends Thread{}
public class List2 {
	List<Customer2> list = new Vector<>();
		
	void methodA() {
		Customer2 customer = new Customer2();
		list.add(customer);   // list.size(1)
		Customer2 customer2 = new Customer2();
		list.add(customer2);    // list.size(2)
		Customer2 customer3 = new Customer2();
		list.add(customer3);    // list.size(3)
	}

	public static void main(String[] args) {
		List2 list2 = new List2();
		list2.methodA();

	}

}
