package com.NCSDETBatch006.org;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.chrome.ChromeDriver;

public class Example21 {

	public static void main(String[] args) throws Exception{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.id("nopSideBarPusher"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		Thread.sleep(5000);
		action.contextClick().perform();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		

	}

}
