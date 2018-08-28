package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfigReader {
	
		
	public String getChromePath() {
		String chromepath= pro.getProperty("ChromeDriver");
		return chromepath;
	}
	
	public String getURL() {
		String url = pro.getProperty("URL");
		return url;
	}
	
	
	public static void alert(WebDriver driver) {
		
		Alert alert = driver.switchTo().alert();
		System.out.println("alert text:="+ alert.getText());
		
		alert.accept();

	}
	
	public static void explicitWait(WebElement element,WebDriver driver) {
	//explicit wait
			WebDriverWait wait = new WebDriverWait(driver,10);
			WebElement ele = wait.until(ExpectedConditions.visibilityOf(element));
			
}
	public static void waitForElementPresent(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("")));	
	}
	
	
}
