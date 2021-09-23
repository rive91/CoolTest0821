package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ejemplo_ExplicitWait {

	public static void main(String[] args) {
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");//Inicializa el chrome en la URL especificada
		driver.manage().window().maximize();//Maximazar Ventana
		
		WebElement userName = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.id("txtUsername")));
		
		userName.sendKeys("asdasd");

	}

}
