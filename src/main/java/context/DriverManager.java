package context;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	
private static ThreadLocal<WebDriver> driverInstance = new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		if(driverInstance.get()==null) {
			throw new IllegalArgumentException("Webdriver not found");
		}
		else {
			return driverInstance.get();
		}
	}
	
	public static void setDriver(WebDriver driver) {
		driverInstance.set(driver);
	}
	
}
