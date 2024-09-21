package org.test;

public class MyPlace {
	
	private void myVillage() {
		System.out.println("Sathyamangalam");		
	}
	
	private void mycollege() {
		System.out.println("Erode");
	}
	
	private void mywork() {
		System.out.println("Chennai");
	}

	public static void main(String[] args) {
		MyPlace p = new MyPlace();
		p.myVillage();
		p.mycollege();
		p.mywork();
	}
}
