package testscripts;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.MavenUtility;
import webpages.ActitimeHomePage;
import webpages.ActitimeLoginPage;

public class TestActitimeLogin extends MavenUtility{

	ActitimeLoginPage getActitimeLoginPage;
	ActitimeHomePage getActitimeHomePage;
	@BeforeTest
	public void startUp() {
		WebDriver driver=setUp("chrome", "https://demo.actitime.com/login.do");
		getActitimeLoginPage=new ActitimeLoginPage(driver);
		getActitimeHomePage=new ActitimeHomePage(driver);
	}
	
	@Test
	public void testActitimeLoginFeature() {
		getActitimeLoginPage.loginInActitime("admin", "manager");
		String expectedTitle="actiTIME - Enter Time-Track";
		String actualTitle=getActitimeHomePage.getHomePageTitle();
		Assert.assertEquals(actualTitle, expectedTitle,"Either acititime login got failed or home page title got changed");
	}
	
	@AfterTest
	public void ends() {
		getActitimeHomePage.clickOnLogoutLink();
		tearDown();
	}
}