package tests;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import driverfactory.DriverFactory;
import pages.PageBase;

public class TestBase{

	Properties prop;
	
	public void initProperties() {
		try {
			System.out.println("inside before initProperties");
			prop = new Properties();
			prop.load(new FileInputStream(System.getProperty("user.dir") + "/resources/config/appconfig.properties"));
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@BeforeTest
	public void setup() {
		System.out.println("inside before Test");
		initProperties();
		initDriver();
	}
	
	void initDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/resources/drivers/chromedriver.exe");
		PageBase.driver = new DriverFactory().getDriver(prop.getProperty("browser.name"));
		PageBase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageBase.driver.get(prop.getProperty("app.url"));
		PageBase.driver.manage().window().maximize();
	}
	
	@AfterTest
	void closeDriver() {
		PageBase.driver.close();
	}
}
