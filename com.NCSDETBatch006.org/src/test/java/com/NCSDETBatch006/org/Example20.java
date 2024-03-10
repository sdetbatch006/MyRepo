package com.NCSDETBatch006.org;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;


import org.openqa.selenium.chrome.ChromeDriver;


public class Example20 {

	public static void main(String[] args)throws Exception {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
	
		
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(3000);
		Actions action = new Actions (driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Men')]"))).perform();
		Thread.sleep(3000);
		action.click().perform();
		Thread.sleep(7000);
		driver.quit();
		
		
		
		
		
	
		
		
		
		
		

	}

}
