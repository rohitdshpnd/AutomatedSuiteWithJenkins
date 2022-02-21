package driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	private WebDriver driver=null;
	
	public WebDriver getDriver(String browserName) {
		System.out.println("inside before getDriver");
		if(browserName.toUpperCase().equals("CHROME"))
				driver = new ChromeDriver();
		if(browserName.toUpperCase().equals("FIREFOX"))
				driver = new FirefoxDriver();

		return driver;
	}	
}
