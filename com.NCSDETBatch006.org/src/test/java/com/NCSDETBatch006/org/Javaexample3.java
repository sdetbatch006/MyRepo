package com.NCSDETBatch006.org;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javaexample3 {

	public static void main(String[] args)throws Exception {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?RetutrnUrl=%2Fadmin%2F");
				Thread. sleep(3000);
				driver.findElement(By.id("Email")).clear();
				driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
						driver.findElement(By.name("password")).clear();
						driver.findElement(By.name("password")).sendKeys("admin");
						driver.findElement(By.tagName("button")).click();
						Thread.sleep(4000);
						driver.findElement(By.partialLinkText("copyright")).click();
						Thread.sleep(5000);
						driver.quit();
						
				
						
						
						
				
		
		

	}

}
