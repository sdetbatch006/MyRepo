package com.NCSDETBatch006.org;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class Example15 {

	public static void main(String[] args)  throws Exception{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	Thread.sleep(5000);
	driver.findElement(By.tagName("button")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//p[contains(text(),'Promotions')])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//p[contains(text(),'Discounts')])[1]")).click();
	Thread.sleep(2000);
	WebElement Discount = driver.findElement(By.id("SearchDiscountTypeId"));
	Select selection = new Select (Discount);
	selection.selectByVisibleText("Assigned to order total");
	Thread.sleep(2000);
	selection.selectByVisibleText("Assigned to products");
	Thread.sleep(2000);
	selection.selectByVisibleText("Assigned to categories");
	Thread.sleep(2000);
	driver.quit();
	
	
			
	

	}

}
