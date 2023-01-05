package Assingment7;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Orange {

	public static void main(String[] args) {
	// set required browser driver executable path using System.setProperty(key,value)
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	// create instance of required browser class		
	WebDriver driver = new ChromeDriver();
	// Maximize browser
	driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//go to the site		
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//enter username passoword and click login button
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//click on PIM
	WebElement PIM=driver.findElement(By.cssSelector("nav>div.oxd-sidepanel-body>ul>li:nth-child(2)>a"));
	PIM.click();
	//Click on Add button
	driver.findElement(By.cssSelector("div.orangehrm-header-container>button")).click();
	//first Name
	driver.findElement(By.name("firstName")).sendKeys("Admin");
	//middle name
	driver.findElement(By.name("middleName")).sendKeys("Abc");
	//last name
	driver.findElement(By.name("lastName")).sendKeys("Adam");
	//clear and send id
	/**Actions actions=new Actions(driver);
	driver.findElement(By.cssSelector("div.oxd-grid-2.orangehrm-full-width-grid>div>div>div:nth-child(2)>input")).click();
	actions.click(driver.findElement(By.cssSelector("div.oxd-grid-2.orangehrm-full-width-grid>div>div>div:nth-child(2)>input")))
	.keyDown(Keys.CONTROL)
	.sendKeys("a")
	.keyUp(Keys.CONTROL)
	.sendKeys(Keys.BACK_SPACE).build().perform();
	WebElement id=driver.findElement(By.cssSelector("div.oxd-grid-2.orangehrm-full-width-grid>div>div>div:nth-child(2)>input"));
	id.sendKeys("123");*/
	driver.findElement(By.cssSelector("div.oxd-grid-2.orangehrm-full-width-grid>div>div>div:nth-child(2)>input")).sendKeys(Keys.chord(Keys.CONTROL,"a"),(Keys.chord(Keys.BACK_SPACE)));
	driver.findElement(By.cssSelector("div.oxd-grid-2.orangehrm-full-width-grid>div>div>div:nth-child(2)>input")).sendKeys("123");
	//Click on save button
	driver.findElement(By.cssSelector(" button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")).click();
	//Click on PIM
	driver.findElement(By.cssSelector("div.oxd-sidepanel-body>ul>li:nth-child(2)>a")).click();
	//PIM.click();
	//click on id
	WebElement id2=driver.findElement(By.cssSelector("div:nth-child(2)>div>div:nth-child(2)>input"));
	id2.click();
	id2.sendKeys("123");
	
	//click on search button
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//click on check box
	driver.findElement(By.cssSelector("")).click();

	//click on edit button
	driver.findElement(By.xpath("")).click();
	
	
	
	
	

	}

}
