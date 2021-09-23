package driverSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	
	public static WebDriver setupDriver() {
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);//Establecioendo la propiedad del .exe
		WebDriver driver = new ChromeDriver();//Inicializando el driver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Implicit Global
		return driver;//Regresando el ddriver para utilizarlo en cualquier Test del proyecto
	}

}
