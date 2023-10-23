package com.week1;

public class ExSimulation {
	public void Acc(Ex ex) {
		int sum = ex.ht+ex.cs+ex.js;
		double avg = sum/3;
		
		System.out.println(ex.name +"의 총점 : "+ sum+", 평균 : "+avg);
		}

	public static void main(String[] args) {
		ExSimulation es = new ExSimulation();
		Ex ex = new Ex();
		ex.name = "나신입";
		ex.ht = 85; 
		ex.cs = 70;
		ex.js = 75;
		es.Acc(ex);	
		
		ex = new Ex();
		ex.name = "나일등";
		ex.ht = 90; 
		ex.cs = 85;
		ex.js = 80;
		es.Acc(ex);	
		
		ex = new Ex();
		ex.name = "홍길도";
		ex.ht = 70; 
		ex.cs = 75;
		ex.js = 75;			
		es.Acc(ex);	

	}
}
