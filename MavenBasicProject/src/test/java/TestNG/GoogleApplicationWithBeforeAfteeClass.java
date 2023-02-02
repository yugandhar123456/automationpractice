package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.MavenUtility;

public class GoogleApplicationWithBeforeAfteeClass extends MavenUtility {

	WebDriver driver;
	@BeforeClass
	public void startUp() {
		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	}
	@BeforeMethod
	public void login() {
		driver.findElement(By.cssSelector(".buttonBlue")).click();
	}
	@Test(priority=2)
	public void testVtigerHomePage() {
		String expectedTitle = "Dashboard";
		String actualTitle = getCurrentTitleOfApplication();
		Assert.assertEquals(actualTitle, expectedTitle, "Vtiger home page not opened or its title got changed");
	}
	@Test(priority=1)
	public void testReportsPage() {
		driver.findElement(By.cssSelector(".navbar-nav>*:nth-child(3)>div>a")).click();
		String expectedTitle = "Reports";
		String actualTitle = getCurrentTitleOfApplication();
		Assert.assertEquals(actualTitle, expectedTitle, "Reports page not opened or its title got changed");
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.cssSelector(".userName ")).click();
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	}
	@AfterClass
	public void tearDown() {
		cleanUp();
	}
}
/**
 * precondition: open browser and enter google url
 * 			TC1: validation google page
 * 			TC2: search SQL and validation search result page
 * post-condition: close the browser 
 */