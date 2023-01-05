package Assingment4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set required browser driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
				
		List<WebElement> sugg=driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));
		System.out.println("Suggestion count: "+sugg.size());
		for(int i=0;i<sugg.size();i++) {
		//to avoid SteleElementException, re-identify all the suggestions
		sugg=driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));
		System.out.println(sugg.get(i).getText());
		
		/**List<WebElement> sugg=driver.findElements(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div> div > div > div > div > div > ul > li"));
		System.out.println("Suggestion count: "+sugg.size());
		for(int i=0;i<sugg.size();i++) {
		//to avoid SteleElementException, re-identify all the suggestions
		sugg=driver.findElements(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div> div > div > div > div > div > ul > li"));
		System.out.println(sugg.get(i).getText());*/
		}		
	}

}