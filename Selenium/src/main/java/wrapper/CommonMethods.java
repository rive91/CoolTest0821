package wrapper;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CommonMethods {
	
	public static void takeScreenshot(WebDriver driver, String testCaseName) {
		//Toma el screenshot de la pagina sin formato
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Establcer la ruta donde se guarda el screenshot
		String screenshotPath = "./test-output/ExecutionResults";
		
		try {
			//Creamos/Sobreescribimos el folder usando la ruta especificada de la variable "screenshotPath"
			FileHandler.createDir(new File(screenshotPath));
			//Copiar el screensho a la ruta creada
			FileHandler.copy(scrFile, new File(screenshotPath + File.separator + testCaseName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
