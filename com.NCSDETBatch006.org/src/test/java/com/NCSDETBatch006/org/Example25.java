package com.NCSDETBatch006.org;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;


import org.openqa.selenium.chrome.ChromeDriver;

public class Example25 {

	public static void main(String[] args) throws Exception  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		
		jsExecutor.executeScript("document.getElementById('Email').value='admin@yourstore.com';");
		Thread.sleep(3000);
		jsExecutor.executeScript("document.getElementById('Email').style.border=\"5px red solid\";");
		Thread.sleep(3000);
		jsExecutor.executeScript("document.getElementById('Email').style.background=\"green\";");
		Thread.sleep(3000);
		jsExecutor.executeScript("document.getElementsByTagName('button')[0].click();");
		Thread.sleep(3000);
		jsExecutor.executeScript("window.scrollTo(0,1000);");
		Thread.sleep(3000);
		jsExecutor.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(3000);
		jsExecutor.executeScript("document.getElementsByClassName('card-title')[3].scrollIntoView();");
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
		

	}

}
