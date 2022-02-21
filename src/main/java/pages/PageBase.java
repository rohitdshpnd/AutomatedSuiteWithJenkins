package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

	public static WebDriver driver; 
	private WebDriverWait wait;
	
	public PageBase() {
		wait = new WebDriverWait(driver, 20);
	}
	public void clickElement(By Element) {
		
		WebElement webElement = null;
		try {
			
			waitUntilElementIsPresent(Element);
			webElement = driver.findElement(Element);
			webElement.click();
			
		}catch(Exception ex) {}
		
	}
	
	public void waitUntilElementIsPresent(By Element) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(Element));
		
	}
}
