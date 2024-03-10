package com.NCSDETBatch006.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchStatement {

	public static void main(String[] args)  throws Exception{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("(//p[contains(text(),'Promotions')])[1]")).click();
		driver.findElement(By.xpath("(//p[contains(text(),'Discounts')])[1]")).click();
		String s = "Discounts";
				
				switch(s) {
				
				case "Promotions" :
					driver.findElement(By.xpath("(//p[contains(text(),'Promotions')])[1]")).click();
					
					
					System.out.println("Promotions module got loaded or not ");
					break;
					
				case "Discounts":
					driver.findElement(By.xpath("(//p[contains(text(),'Discounts')])[1]")).click();
					
					
					
					System.out.println("Discounts submodule got loaded sucessfully");
					break;

				
					
					
			
						

		
			
			
	
				
		
		
		
		
		
		
		
		
	
		
		


		
			
			
	
				
		
		
		
		
		
		
		
		}
	

	}

}
