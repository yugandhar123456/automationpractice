package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.SeleniumUtility;

public class GoogleSerach extends SeleniumUtility{
	WebDriver driver;
	@BeforeTest
	public void preCondition() {
		 driver=setUp("chrome", "https://www.google.com");
	}
	@Test
	public void testSearchPage() {	
		typeInput(driver.findElement(By.name("q")),"Selenium interview questions");
		getActiveElementFromUI().sendKeys(Keys.ENTER);
		Assert.assertTrue(getCurrentTitleOfApplication().contains("Selenium interview questions"), "Google search was not sucessfull");
	}	
	@AfterTest
	public void cleanUp() {
		tearDown();
	}
}