package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DirectoryPage {
	
	public DirectoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);//Inicializamos los PageObjects con Page Factory
											   // THIS es un Keyword de Java con el que le estamos diciendo que es la misma clase donde se va 
											   // inicialiar los webElements
	}
	
	//WebElements
	@FindBy(id="searchDirectory_emp_name_empName")
	private WebElement nameTxt;
	@FindBy(id="searchDirectory_job_title")
	private WebElement drpDwnJobTitle;
	@FindBy(id="searchDirectory_location")
	private WebElement drpDwnLocation;
	@FindBy(id="searchBtn")
	private WebElement searchBtn;
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")
	private WebElement searchResult;

	public void searchByName(String name) {
		nameTxt.sendKeys("Nathan");
	}
	
	public void selectJobTitle(String jobtitle) {
		Select drpdwn = new Select(drpDwnJobTitle);
		drpdwn.selectByVisibleText(jobtitle);
	}
	
	public void selectLocation(String location) {
		Select drpdwn = new Select(drpDwnLocation);
		drpdwn.selectByVisibleText(location);
	}
	
	public void clickSearchButton() {
		searchBtn.click();
	}
	
	public boolean verifySearchNameResult(String expectedName) {
		return searchResult.getText().contains(expectedName);
	}

}
