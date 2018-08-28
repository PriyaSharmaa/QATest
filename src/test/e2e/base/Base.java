package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utility.ConfigReader;

//base class- maintains all the test cases /script 
public class Base {

	WebDriver driver;

	@BeforeClass
	public void setup() throws Throwable {

		
		ConfigReader config = new ConfigReader();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(config.getURL());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterClass
	public void closeApp() {

		driver.close();
	}
}
