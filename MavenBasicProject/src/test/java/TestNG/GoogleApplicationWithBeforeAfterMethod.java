package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.MavenUtility;

public class GoogleApplicationWithBeforeAfterMethod extends MavenUtility {
	WebDriver driver;
	@BeforeMethod
	public void startUp() {
		driver = setUp("chrome", "https://www.google.com/");
	}
	@Test
	public void testGoogleLandingPage() {
		String expectedTitle = "Google";
		String actualTitle = getCurrentTitleOfApplication();
		Assert.assertEquals(actualTitle, expectedTitle, "Google Search page not opened or its title got changed");
	}
	@Test
	public void testSearch() {
		getActiveElement().sendKeys("SQL", Keys.ENTER);
		Assert.assertTrue(getCurrentTitleOfApplication().contains("SQL"), "SQL search is failed");
	}
	@AfterMethod
	public void tearDown() {
		cleanUp();
	}
}
/**
 * precondition: open browser and enter google url
 * 			TC1: validation google page
 * post-condition: close the browser 
 * precondition: open browser and enter google url
 * 			TC2: search SQL and validation search result page
 * post-condition: close the browser 
 */