package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.HomePage;

public class HomeTest extends TestBase{

	HomePage homePage;
	
	
	@Test
	public void testHomePageTitle() {
		try {	
			homePage = new HomePage();
			assertEquals("WebDriverUniversity.com", homePage.getPageTitle());
			Thread.sleep(1000);
		
		}catch(Exception ex) {}
	}
	
	@Test
	public void testDataTable() {
		
		try {	
			System.out.println("Testing DataTables section....");
			Thread.sleep(1000);
		
		}catch(Exception ex) {}
	}
	
	@Test
	public void testDropdownSection() {
		
		try {	
			System.out.println("Testing Dropdown Section....");
			Thread.sleep(1000);
		
		}catch(Exception ex) {}
	}
	
	@Test
	public void testPOMSection() {
		
		try {	
			System.out.println("Testing Page Object Model Section....");
			Thread.sleep(1000);
		
		}catch(Exception ex) {}
	}
}
