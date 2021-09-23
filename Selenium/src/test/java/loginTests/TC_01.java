package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import navigationPages.LoginPage;
import variablesGlobales.GlobalVariables;
import wrapper.CommonMethods;

public class TC_01 {

	WebDriver driver = DriverSetup.setupDriver();

	// Login Page Object
	LoginPage login = new LoginPage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.URL_PAGE);
		driver.manage().window().maximize();
	}

	@Test
	public void TC_01_CorrectLogin() {
		login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
	}
	
	@AfterTest
	public void closeDriver() {
		CommonMethods.takeScreenshot(driver, "TC_01_CorrectLogin");
		driver.close();
	}
}
