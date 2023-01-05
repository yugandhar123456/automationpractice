package Assingment5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vtiger {

	public static void main(String[] args) 
	{
		// set required browser driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// maximize browser window
		driver.manage().window().maximize();
		// enter the required URL
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
					
		WebElement username1InputField=driver.findElement(By.id("username"));
		username1InputField.clear();
		username1InputField.sendKeys("admin");
				
		WebElement password1InputField=driver.findElement(By.id("password"));
		password1InputField.clear();
		password1InputField.sendKeys("Test@123");
				
		driver.findElement(By.tagName("button")).click();
		//wait.until(ExpectedConditions.elementToBeClickable(drop down));		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement dropdown=driver.findElement(By.cssSelector("div.dashBoardTabContainer>div>div>div>button"));
		//wait.until(ExpectedConditions.elementToBeClickable(drop down));
		//identify drop down list and click on it
		  dropdown.click();
		//identify all the options and store them into List<WebElement>
		List<WebElement> options=driver.findElements(By.cssSelector("div.dashboardHeading.container-fluid>div>div>ul>li>a"));
	    //use size() to get option count
		System.out.println(" dropdown option count: "+options.size());
		//use for loop to print one by one option
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		options.get(2).click();
		dropdown.click();
		options.get(4).click();
				
	//	driver.findElement(By.cssSelector("div.dashBoardTabContainer>div>div>div>button")).click();			
	}}