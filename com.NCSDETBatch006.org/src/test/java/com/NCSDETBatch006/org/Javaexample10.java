package com.NCSDETBatch006.org;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javaexample10 {

	public static void main(String[] args)  {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
		
		
		
	
		
		

	}

}
