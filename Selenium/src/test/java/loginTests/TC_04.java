package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import navigationPages.DashboardPage;
import navigationPages.DirectoryPage;
import navigationPages.LoginPage;
import variablesGlobales.GlobalVariables;
import wrapper.CommonMethods;

public class TC_04 {

	WebDriver driver = DriverSetup.setupDriver();

	// Login Page Object
	LoginPage login = new LoginPage(driver);
	DashboardPage dash = new DashboardPage(driver);
	DirectoryPage directory = new DirectoryPage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.URL_PAGE);
		driver.manage().window().maximize();
	}

	@Test
	public void TC_05_Search() {
		login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
		
		dash.clickMenuDirectory();
		
		directory.searchByName("Nathan");
		
		directory.selectJobTitle("Sales Representative");
		
		directory.selectLocation("  United States");
		
		directory.clickSearchButton();
		
		boolean isUserPresent = directory.verifySearchNameResult("Nathan");
		
		Assert.assertTrue(isUserPresent);
		
		
	}
	
	@AfterTest
	public void closeDriver() {
		CommonMethods.takeScreenshot(driver, "TC_05_Search");
		driver.close();
	}
}
