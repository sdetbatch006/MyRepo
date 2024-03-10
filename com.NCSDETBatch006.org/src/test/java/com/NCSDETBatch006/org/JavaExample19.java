package com.NCSDETBatch006.org;

public class JavaExample19 {

	
		String jemodulename;
		String jesubmodulename;

		public JavaExample19(){
		System.out.println("Goodmorning");
		}
		JavaExample19(String modulename, String submodulename){
			this.jemodulename = modulename;
			this.jesubmodulename = submodulename;
			System.out.println(modulename);
			System.out.println(submodulename);
		}
		public static void main (String [] args){
			JavaExample19 je1 = new JavaExample19();
			JavaExample19 je2 = new JavaExample19();
			JavaExample19 je3 = new JavaExample19();
			
		    JavaExample19 je4 = new JavaExample19("Promotions", "Discounts");
			JavaExample19 je5 = new JavaExample19("System", "Log");
			JavaExample19 je6 = new JavaExample19("Reports", "Sales Summary");
			
			
			
			
			
			
			
		}
			
			
			
			
			
			





		
	

	}


