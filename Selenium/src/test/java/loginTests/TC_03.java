package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import navigationPages.DashboardPage;
import navigationPages.LoginPage;
import variablesGlobales.GlobalVariables;
import wrapper.CommonMethods;

public class TC_03 {

	WebDriver driver = DriverSetup.setupDriver();

	// Login Page Object
	LoginPage login = new LoginPage(driver);
	DashboardPage dashboard = new DashboardPage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.URL_PAGE);
		driver.manage().window().maximize();
	}

	@Test
	public void TC_03_Logout() {
		login.login("123", GlobalVariables.PASSWORD_ADMIN);
		dashboard.logout();
	}
	
	@AfterTest
	public void closeDriver() {
		CommonMethods.takeScreenshot(driver, "TC_03_Logout");
		driver.close();
	}
}
