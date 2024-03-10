package ncPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NCOrdersPage {
	
	WebDriver driver;
	
	By productName =By.id("search-product-name");
	By SearchBtn = By.id("search-orders");
	
	public void enterProductName() {
		driver.findElement(productName).sendKeys("Laptop");
		
	}
	public void clickOnSearch() {
		driver.findElement(SearchBtn).click();
		}
	public NCOrdersPage(WebDriver d) {
		this.driver = d;
		
	}
	
	
	
}

