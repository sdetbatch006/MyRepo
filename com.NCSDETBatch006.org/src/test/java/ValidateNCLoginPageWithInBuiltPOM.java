import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import inBuiltNCPages.InBuiltNCLoginPage;
import ncPages.NCUtilities;

public class ValidateNCLoginPageWithInBuiltPOM {

	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		NCUtilities ncu = new NCUtilities(driver);
		InBuiltNCLoginPage inlp = new InBuiltNCLoginPage(driver);

		ncu.SetUp();
		Thread.sleep(5000);
		inlp.enterEmail();
		inlp.enterPassword();
		inlp.clickOnLoginBtn();
		Thread.sleep(5000);
		ncu.doLogout();
		Thread.sleep(5000);
		ncu.tearDown();

		

	}

}
