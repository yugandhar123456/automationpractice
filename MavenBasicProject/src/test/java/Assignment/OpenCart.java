package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.MavenUtility;

public class OpenCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MavenUtility M1 = new MavenUtility();
		WebDriver driver = M1.setUp("chrome","https://www.opencart.com/index.php?route=account/register");
		
		WebElement username =driver.findElement(By.cssSelector("#input-username"));
		username.sendKeys("Yugandhar",Keys.TAB);
		//use swith to active element
		driver.switchTo().activeElement().sendKeys("lucifer",Keys.TAB);
		
	    driver.switchTo().activeElement().sendKeys("star",Keys.TAB);
		
		driver.switchTo().activeElement().sendKeys("yug007@gmail.com",Keys.TAB);
		 List<WebElement> cuntry=driver.findElements(By.cssSelector("#input-country > option"));
		 System.out.println("cuntry Option count: "+cuntry.size());
		 cuntry.get(2).click();
		 
		 WebElement pass =	 driver.findElement(By.cssSelector("#input-password"));
		 pass.click();
		 pass.sendKeys("1234546");
		
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='button-register']/button[2]")).click();


	}

}
