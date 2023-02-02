package webpages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.MavenUtility;

public class ActitimeLoginPage extends MavenUtility{
	//Initialize current web page Elements
	public ActitimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
	//Username
	@FindBy(css="#username")
	private WebElement usernameInputField;
	//password
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordInputField;
	//login button
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	public void loginInActitime(String username,String password) {
		typeInput(usernameInputField, username);
		typeInput(passwordInputField, password);
		clickOnElement(loginButton);
	}
	
	public String acititimeLoginPageTitle() {
		return getCurrentTitleOfApplication();
	}
}