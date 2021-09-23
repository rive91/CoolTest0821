package ejemploAssertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EjemploSoftAsserts {
	
  SoftAssert softA = new SoftAssert();
  
  @Test
  public void softAssertEjemploSel() {
	  String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");//Inicializa el chrome en la URL especificada
		driver.manage().window().maximize();//Maximazar Ventana
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		String badTitle = "OraneHRM";
		
		softA.assertEquals(actualTitle, expectedTitle);
		softA.assertEquals(actualTitle, badTitle);
		softA.assertAll();

		driver.close();
  }
}
