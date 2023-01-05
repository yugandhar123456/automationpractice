package Assingment4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfo1 {
	public static void main(String[] args)
	{
		// set required browser driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cricinfo.com/");
		
		String actualUrl = driver.getCurrentUrl();
		System.out.println("URL validation: "+actualUrl.equals("https://www.espncricinfo.com/"));
		List<WebElement> menu=driver.findElements(By.cssSelector("#main-container > div:nth-child(3) > div > nav > div > div > div > div > div>div"));
		System.out.println("Main Menu Option count: "+menu.size());
		for(int i=0;i<menu.size();i++) {
		System.out.println(menu.get(i).getText());
	}		
	}

}
