package ncPages;
import org.openqa.selenium.chrome.ChromeDriver;


public class ValidateProductName {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		NCLoginPage nlp = new NCLoginPage(driver);
		NCDashboardPage ndp = new NCDashboardPage(driver);
		NCUtilities ncu = new NCUtilities(driver);
		NCOrdersPage nco = new NCOrdersPage(driver);
		
		ncu .SetUp();
		nlp . enterEmail();
		nlp.enterPassword();
		nlp.clickOnLoginBtn();
		Thread.sleep(5000);
		ndp . verifyDashboard();
		ncu .clickOnsales();
		Thread.sleep(5000);
		ncu .clickOnOrders();
		Thread.sleep(5000);
		nco.enterProductName();
		Thread.sleep(3000);
		nco .clickOnSearch();
		Thread.sleep(3000);
		ncu.doLogout();
		Thread.sleep(5000);
		ncu.tearDown();
		
		
		
		

	}

}
