package com.NCSDETBatch006.org;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example13 {
	

	public static void main (String[] args)throws Exception {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	Thread.sleep(3000);

	String Val = driver.findElement(By.tagName("button")).getText();
	System.out.println(Val);
	String Val2 = driver.findElement(By.id("Email")).getAttribute("tagName");
	System.out.println(Val2);
	String Val3 = driver.findElement(By.id("Email")).getTagName();
	System.out.println(Val3);
	
	driver.findElement(By.id("Email")).clear();
	driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
	Thread.sleep(3000);
	driver.findElement(By.name("Password")).clear();
	driver.findElement(By.name("Password")).sendKeys("admin",Keys.TAB,Keys.TAB,Keys.ENTER);
	
	
	
	
	

			
	}			
	
	
	

}
