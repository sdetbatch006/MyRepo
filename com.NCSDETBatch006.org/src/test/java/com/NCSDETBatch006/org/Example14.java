package com.NCSDETBatch006.org;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example14 {

	public static void main (String[] args) throws Exception  {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(5000);
		boolean Val = driver.findElement(By.id("Email")).isDisplayed();
		boolean Val2 = driver.findElement(By.id("RememberMe")).isSelected();
		boolean Val3 = driver.findElement(By.tagName("button")).isEnabled();
		
		System.out.println("Email is appearing? " + Val); 
		System.out.println("RememberMe Checkbox is Selected? " + Val2);
		System.out.println("Login Button isEnabled? " + Val3);
		driver.quit();
		
		
		
		
		
	
		

	}

}
