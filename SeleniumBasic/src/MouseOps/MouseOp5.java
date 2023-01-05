package MouseOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;


public class MouseOp5{

	public static void main(String[] args) {
		
		SeleniumUtility m1=new SeleniumUtility();		
		WebDriver driver=m1.setUp("chrome", "https://www.facebook.com/");	
//		WebElement element=driver.findElement(By.xpath("//a[text()='Create New Account']"));
//		m1.performClick(element);
				//or
		m1.performClick(driver.findElement(By.xpath("//a[text()='Create New Account']")));
		
		WebElement userNameInputField=driver.findElement(By.name("firstname"));
		m1.typeInput(userNameInputField, "admin");
		//m1.copyTextFromField(userNameInputField);
		WebElement lastName=driver.findElement(By.name("lastname"));
		//m1.pasteTextInToField(lastName);	
		m1.copyPasteText(userNameInputField, lastName);
		
		//m1.cleanUp();
	}
}