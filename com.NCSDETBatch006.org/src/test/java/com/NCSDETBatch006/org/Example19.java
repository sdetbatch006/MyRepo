package com.NCSDETBatch006.org;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Example19 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds (30));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Email"))));
	driver.findElement(By.id("Email")).clear();
	driver.findElement(By.id("Email")).sendKeys("admin@Yourstore.com");
	
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("Password"))));
	driver.findElement(By.name("Password")).clear();
	driver.findElement(By.name("Password")).sendKeys("admin");
	
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("button"))));
	driver.findElement(By.tagName("button")).click();
	
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Logout"))));
	driver.findElement(By.linkText("Logout")).click();
	
	driver.quit();
	
	
	
	
	
	
		

		

	}

}
