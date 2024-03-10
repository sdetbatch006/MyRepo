package com.NCSDETBatch006.org;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example24 {

	public static void main(String[] args) throws Exception{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[contains(text(),'Promotions')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[contains(text(),'Discounts')])[1]")).click();
		Thread.sleep(2000);
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='discounts-grid']/tbody/tr"));
	Thread.sleep(3000);
	int rowsCount= rows.size();
	System.out.println("All rows count is : " + rowsCount);
	Thread.sleep(3000);
	List<WebElement>columns = driver.findElements(By.xpath("//table[@id='discounts-grid']/tbody/tr[1]/td"));
	Thread.sleep(3000);
	int columnCount = columns.size();
	System.out.println("All columns count is : " + columnCount);
	Thread.sleep(3000);
	for(int r = 1; r<=rowsCount; r++) {
		for(int c = 1; c<=columnCount; c++) {
			String Val = driver
					.findElement(By.xpath("//table[@id='discounts-grid']/tbody/tr["+r+"]/td["+c+"]")).getText();
					System.out.println(Val+" ");
					
		}
			
		}
		driver.quit();
	}

	}


