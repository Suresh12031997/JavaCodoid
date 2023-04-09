package org.net;

public class MethodOverLoading {
	private void OwnerName(int i) {
		System.out.println("Owner Name:Suresh");
		
	}
	private void OwnerName(long l) {
		System.out.println("Owner name:Hari");

	}
	private void OwnerName(int a, String s ) {
		System.out.println("Owner Name:Bharath");
		
	}
	private void OwnerName(String s , float f , char c) {
		System.out.println("Owner Name:Sorna");
		
	}
	public static void main(String[] args) {
		MethodOverLoading m = new MethodOverLoading();
		m.OwnerName(123);
		m.OwnerName(8124382378l);
		
		m.OwnerName("Hari", 123.12f, 'B');
		
	}

}
