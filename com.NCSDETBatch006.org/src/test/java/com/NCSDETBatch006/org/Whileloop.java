package com.NCSDETBatch006.org;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;


public class Whileloop {

	public static void main(String[] args)  throws Exception{
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

List<WebElement>column = driver.findElements(By.xpath("//table[@id='discounts-grid']/tbody/tr[1]/td"));
Thread.sleep(3000);

 int columncount = 8;
 int c = 1;
 while(c<=columncount) {
		
				System.out.println("All columncount ");
				c++;
 }		
	}
		
	

}










		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
