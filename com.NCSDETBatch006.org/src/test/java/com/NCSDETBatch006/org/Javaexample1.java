package com.NCSDETBatch006.org;
import org.openqa.selenium.chrome.ChromeDriver;
public class Javaexample1 {

public static void main (String[]args) throws Exception {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	Thread.sleep(5000);
	driver.quit();
	
			
		
			
}
}

