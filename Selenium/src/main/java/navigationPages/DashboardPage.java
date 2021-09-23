package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);//Inicializamos los PageObjects con Page Factory
											   // THIS es un Keyword de Java con el que le estamos diciendo que es la misma clase donde se va 
											   // inicialiar los webElements
	}
	
	//Dashboard PageObjects/WebElements
	@FindBy(id = "welcome")
	private WebElement welcomeDropDown;
	@FindBy(xpath = "//*[@id=\"welcome-menu\"]/ul/li[3]/a")
	private WebElement logoutBtn;
	@FindBy(id = "menu_directory_viewDirectory")
	private WebElement menuDirectory;
	
	public void logout() {
		welcomeDropDown.click();
		logoutBtn.click();
	}
	
	public void clickMenuDirectory() {
		menuDirectory.click();
	}
	
}
