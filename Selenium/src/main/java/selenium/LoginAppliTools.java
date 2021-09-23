package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAppliTools {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.applitools.com/");//Inicializa el chrome en la URL especificada
		driver.manage().window().maximize();//Maximazar Ventana
		
		//WebElements
		WebElement userName = driver.findElement(By.xpath("//*[@placeholder = 'Enter your username']"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("log-in"));
		
		userName.sendKeys("Admin");
		Thread.sleep(2000);
		password.sendKeys("password123");
		Thread.sleep(2000);
		loginBtn.click();
		Thread.sleep(2000);

		driver.close();
		

	}

}
