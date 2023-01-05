package Assingment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		//get current page Url
		 String Url = driver.getCurrentUrl();
	     System.out.println("Current Url is:"+ Url);
		// Storing Page Source in String variable  
	     String pageSource = driver.getPageSource();
	     System.out.println(pageSource); 
		//String pageSource = driver.getPageSource();  
		// Printing  the Page Source on console  
		//System.out.println("Page source code is: "+pageSource);
		//close current browser
		driver.close();

	}
}