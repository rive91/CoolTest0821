package practicaSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ejercicio_2 {
	@Test
	public void VerificarNathan() throws InterruptedException {

		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");// Inicializa el chrome en la URL especificada
		driver.manage().window().maximize();// Maximazar Ventana
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		// Obteniendo objetos/webelements de la pagina web
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));

		// Login
		userName.sendKeys("Admin");
		Thread.sleep(500);
		password.sendKeys("admin123");
		Thread.sleep(500);
		loginBtn.click();
		Thread.sleep(500);
		
		WebElement menu_directory = driver.findElement(By.id("menu_directory_viewDirectory"));
		menu_directory.click();
		
		WebElement nameTxt = driver.findElement(By.id("searchDirectory_emp_name_empName"));
		nameTxt.sendKeys("Nathan");
		
		Select jobtitleDrpdwn = new Select(driver.findElement(By.id("searchDirectory_job_title")));	
		jobtitleDrpdwn.selectByVisibleText("Sales Representative");
		
		Select locationDrpdwn = new Select(driver.findElement(By.id("searchDirectory_location")));	
		locationDrpdwn.selectByVisibleText("  United States");
		Thread.sleep(2000);
		
		WebElement searchBtn = driver.findElement(By.id("searchBtn"));
		searchBtn.click();
		
		String nameSearchResult = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")).getText();
		boolean nameDisplayed = nameSearchResult.contains("Nathan Elliot");
		
		Assert.assertTrue(nameDisplayed);
		
		driver.close();
	}
}
