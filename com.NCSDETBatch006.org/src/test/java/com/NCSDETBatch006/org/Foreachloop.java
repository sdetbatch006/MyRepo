package com.NCSDETBatch006.org;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Foreachloop {

	public static void main(String[] args) throws Exception{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[contains(text(),'Promotions')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[contains(text(),'Discounts')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p [contains(text(),'Affiliates')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p [contains (text(),'Newsletter subscribers')]")).click();
		Thread.sleep(3000);
		
		List <WebElement> allInputs = driver.findElements (By.xpath("//input"));
		for (WebElement input : allInputs) {
			String val = input. getAttribute("name");
			System.out.println(val);
			
			
			
			
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
