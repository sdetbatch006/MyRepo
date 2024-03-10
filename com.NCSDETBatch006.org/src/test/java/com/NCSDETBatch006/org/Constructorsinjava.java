package com.NCSDETBatch006.org;

public class Constructorsinjava {
	String sname;
	char b ;
	
	Constructorsinjava(String name, char b){
		this.sname = name;
		this.b = b;
	}

	public static void main(String[] args) {
		Constructorsinjava c1 = new Constructorsinjava(" Bhavya",'S');
		System.out.println(c1.sname);
		System.out.println(c1.b);

		Constructorsinjava c2 = new Constructorsinjava("Navya", 'A');
		System.out.println(c2.sname);
		System.out.println(c2.b);
		
		Constructorsinjava c3 = new Constructorsinjava("Sunitha", 'D');
		System.out.println(c3.sname);
		System.out.println(c3.b);
		
		
		
		
	

	}

}
				
		
		
		
		
	

		
		
		
