package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.MavenUtility;

public class Vtiger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MavenUtility M1 = new MavenUtility();
		WebDriver driver = M1.setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement username1InputField=driver.findElement(By.id("username"));
		username1InputField.clear();
		username1InputField.sendKeys("admin");
				
		WebElement password1InputField=driver.findElement(By.id("password"));
		password1InputField.clear();
		password1InputField.sendKeys("Test@123");
				
		driver.findElement(By.tagName("button")).click();
		
		driver.findElement(By.cssSelector("#appnavigator>div>span")).click();
		driver.findElement(By.cssSelector("#INVENTORY_modules_dropdownMenu>div")).click();
		
		WebElement abc =driver.findElement(By.xpath("//*[@id=\"mCSB_11_container\"]/li[1]/a/span[2]"));
		Actions act = new Actions(driver);
		//act.doubleClick(abc).build().perform();
		act.moveToElement(abc).perform();

	}

}
