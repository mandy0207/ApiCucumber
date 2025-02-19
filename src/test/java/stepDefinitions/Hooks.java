package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import context.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
	@Before()
	public void launchBrowser() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		DriverManager.setDriver(driver);
		
	}
	
	
	
	@After
	public void tearDown() {
		DriverManager.getDriver().quit();
	}
}
