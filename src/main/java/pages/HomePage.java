package pages;

import org.openqa.selenium.By;

public class HomePage extends PageBase{
	
	By dataTableTxt = By.xpath("//a[@id='data-table']//h1");
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
//	public DataTablePage openDataTableSection() {
//		
//		
//		
//	}

}
