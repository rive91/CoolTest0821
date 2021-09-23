package ejemploAssertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EjemploHardAssert {
  @Test
  public void assertEquals() {
	  int a = 10;
	  int b = 10;
	  Assert.assertEquals(a, b, "Los numeros no son iguales");
  }
  
  @Test
  public void assertNotEquals() {
	  int a = 10;
	  int b = 5;
	  Assert.assertNotEquals(a, b, "Los numeros son iguales");
  }
  
  @Test
  public void assertTrue() {
	  
	  boolean assertions = true;
	  Assert.assertTrue(assertions);
  }
  
  @Test
  public void assertFalse() {
	  
	  boolean assertions = false;
	  Assert.assertFalse(assertions);
  }
  
  @Test
  public void TC_VerificarElTituloDePagina() {
	  	String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");//Inicializa el chrome en la URL especificada
		driver.manage().window().maximize();//Maximazar Ventana
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.close();
  }
}
