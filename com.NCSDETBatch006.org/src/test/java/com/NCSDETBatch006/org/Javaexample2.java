package com.NCSDETBatch006.org;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Javaexample2 {

	public static void main(String[] args)throws Exception {
		//Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//Maximize the chrome browser
		driver.manage().window().maximize();
		//Open NC login page in opend browser
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		//Enter Valid Email in Email field
		driver.findElement(By.id("Email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(3000);
		//Enter Valid password in pws field
		driver.findElement(By.id("Password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("admin");
		Thread.sleep(3000);
		//Click on Login button
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		//Terminate the Chrome Browser
		driver.quit();
		
		
		
		
		
	

	}

}
