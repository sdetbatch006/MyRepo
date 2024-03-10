package com.NCSDETBatch006.org;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaExample6 {

	public static void main(String[] args) throws Exception{
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.xpath("//*[@type='button']")).click();
		driver.findElement(By.xpath("//button[@type='button' and @type='button']")).click();
		driver.findElement(By.xpath("//button[@type='button' or @type='button']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[last()]")).click();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),'Learn')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'rn more')]")).click();
		driver.findElement(By.xpath("(//div[@class='inputs'])[1]/child::input")).sendKeys("admin@yourstore.com");
		driver.findElement(By.xpath("//input[@id='Email']/parent::div")).sendKeys("admin@yourstore.com");
		driver.findElement(By.xpath("//input[@type='hidden']/preceding-sibling::div")).sendKeys("Devara");
		Thread.sleep(8000);
		driver.quit();
		
		
		
		
		
		
		

	}

}
