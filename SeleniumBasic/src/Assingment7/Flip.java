package Assingment7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// set required browser driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create instance of required browser class		
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		//implycit time	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//go to the site		
		driver.get("https://www.flipkart.com/");
		//using Escape of keyboard to avoid login popup
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		//identify web element
		WebElement abc = driver.findElement(By.cssSelector("div._331-kn._2tvxW>div>div>div:nth-child(2)>a>div._1mkliO>div>img"));
		// create an instance of Actions class by passing required browser instance to its constructor
		Actions act = new Actions(driver);
		act.doubleClick(abc).build().perform();
		// identify all the elements of menu
		List<WebElement> Menu = driver.findElements(By.cssSelector("#container>div>div._331-kn>div>div>span"));
		System.out.println("Menu option count: " + Menu.size());
	    // move mouse using for loop
		for(int i=0;i<Menu.size();i++) {
		WebElement option=Menu.get(i);
		act.moveToElement(option).perform();
		Thread.sleep(1000);
		}
		driver.close();
		//or
		//act.moveToElement(mainMenu.get(2)).perform();
	}
}
