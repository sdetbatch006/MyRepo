package com.NCSDETBatch006.org;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.WebElement;
import java.util.List;
public class Javaexample8 {

	public static void main(String[] args)throws Exception {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement Email=driver.findElement(By.id("Email"));
		Email.clear();
		Thread.sleep(2000);
		Email.sendKeys("admin@yourstore.com");
		Thread.sleep(2000);
	
		WebElement Pswd=driver.findElement(By.className("Password"));
		Pswd.clear();
		Thread.sleep(2000);
		Pswd.sendKeys("admin");
		Thread.sleep(2000);
	     
		WebElement box=driver.findElement(By.id("RemeberMe"));
		box.click();
		Thread.sleep(2000);
		List<WebElement> fields =driver.findElements(By.xpath("//div[@class='inputs']"));
		System.out.println(fields.size());
		Thread.sleep(2000);
		WebElement Btn=driver.findElement(By.xpath("//button[@type='submit']"));
		Btn.click();
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.xpath("//a[@class='nav-link']"));
		System.out.println(links.size());
		Thread.sleep(3000);
		WebElement logout = driver.findElement(By.xpath("a[@href='/logout']"));
		logout.click();
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		

	}

}
