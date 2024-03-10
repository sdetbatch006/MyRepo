package com.NCSDETBatch006.org;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Javaexmple4 {

	public static void main(String[] args) throws Exception {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='Email']")).clear();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='password']")).clear();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		  
		 driver .findElement(By.xpath("//a[@href='/logout']")).click();
		 driver.quit();
		 
		
	
	
	
	
	

	}

}
