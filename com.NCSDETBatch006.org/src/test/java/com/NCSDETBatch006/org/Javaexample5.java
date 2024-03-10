package com.NCSDETBatch006.org;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Javaexample5 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password'")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='#']) [2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='Admin/Affiliate/List']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='SearchFirstName']")).sendKeys("Devara");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='SearchLastName']")).sendKeys("Bhavyasree");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='SearchFriendlyUrlName']")).sendKeys("Sree");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		

		
		
		

	}

}
