package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.MavenUtility;

public class Demoqa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MavenUtility M1 = new MavenUtility();
		WebDriver driver = M1.setUp("chrome","https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		driver.switchTo().alert().accept();
	//	driver.findElement(By.id("timerAlertButton")).click();
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("promtButton")).click();
		driver.switchTo().alert().sendKeys("Tester");
		driver.switchTo().alert().accept();
		driver.findElement(By.id("timerAlertButton")).click();
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
	    .withTimeout(Duration.ofSeconds(20))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(TimeoutException.class);
	//	implement condition for wait, poling works like 5,10,15 and 20
	    wait=new WebDriverWait(driver,20);
	//	wait.until(ExpectedConditions.elementToBeSelected(By.id("timerAlertButton")));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	//	driver.findElement(By.id("confirmButton")).click();
	//	driver.switchTo().alert().dismiss();
		
	}

}
