package CssValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeErrorMsgValidation {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com/login.do");
		//click on login button
		driver.findElement(By.id("loginButton")).click();
		//Explicti wait
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.textToBe(By.cssSelector(".errormsg"), "Username or Password is invalid. Please try again."));
		//identify error msg
		WebElement errorMsg=driver.findElement(By.cssSelector(".errormsg"));
		/**
		 * validation-
		 * 			error msg color: red
		 * 			font size: 13px
		 */
		String errorColorInRGBA=errorMsg.getCssValue("color");
		String errorFontSize=errorMsg.getCssValue("font-size");
		System.out.println("Error Msg Color code: "+errorColorInRGBA);
		System.out.println("Error Msg Font size: "+errorFontSize);
	}

}