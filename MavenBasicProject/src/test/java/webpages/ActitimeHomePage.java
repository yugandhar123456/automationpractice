package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.MavenUtility;

public class ActitimeHomePage extends MaveUtility{
	
	public ActitimeHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public String getHomePageTitle() {
		waitForElementToBeClickable(logoutLink);
		return getCurrentTitleOfApplication();
	}
	
	public void clickOnLogoutLink() {
		clickOnElement(logoutLink);
	}
}