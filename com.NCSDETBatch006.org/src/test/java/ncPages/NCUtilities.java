package ncPages;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;



public class NCUtilities {
	WebDriver driver;
	
	By sales = By.xpath("//p[contains (text(),'Sales')]");
	By orders = By.xpath("//p[contains (text(),'Orders')]");
	By logout = By.linkText("Logout");
	
	public void clickOnsales() {
		driver.findElement (sales).click();
		
}
	
	public void clickOnOrders() {
		driver.findElement (orders).click();
		
}
	public void doLogout() {
		driver.findElement(logout).click();
		}
	public void SetUp(){
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}
	public void tearDown() {
		driver.quit();
	}
	public NCUtilities (WebDriver d) {
		this.driver = d;
		
	}
	
	

}
