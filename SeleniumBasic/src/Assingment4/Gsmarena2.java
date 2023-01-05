package Assingment4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena2 {

	public static void main(String[] args) {
	
	// set required browser driver executable path using System.setProperty(key,value)
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	// create instance of required browser class
	WebDriver driver = new ChromeDriver();
	// Maximize browser
	driver.manage().window().maximize();
	// implicit wait
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.gsmarena.com/");
					
	String actualUrl = driver.getCurrentUrl();
	System.out.println("URL validation: "+actualUrl.equals("https://www.gsmarena.com/"));
			
	driver.findElement(By.cssSelector("#body > aside > div > ul > li:nth-child(1) > a")).click();
			
	List<WebElement> phone=driver.findElements(By.cssSelector("#review-body > div.makers > ul > li"));
	System.out.println("SAMSUNG PHONE Option count: "+phone.size());
	for(int i=0;i<phone.size();i++) {
	System.out.println(phone.get(i).getText());

}
}
}
