package com.NCSDETBatch006.org;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examplemanage {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		String val = driver.getTitle();
		System.out.println(val);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String SourceCode = driver.getPageSource();
		Thread.sleep(3000);
		System.out.println(SourceCode);
		String windowID = driver.getWindowHandle();
		Thread.sleep(3000);
		System.out.println(windowID);
		driver.quit();
		

	}

}
