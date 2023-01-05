package Assingment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		System.out.println("Page title is: "+driver.getTitle());
		// Storing Title length in the int variable  
		int titleLength = driver.getTitle().length();  
		// Printing Title length in the Console window
		System.out.println("Length of the title is : "+ titleLength); 
		// Storing URL in String variable
		String actualUrl = driver.getCurrentUrl();
		System.out.println("URL validation: "+actualUrl.equals("https://demo.actitime.com/login.do"));
		// Storing Page Source in String variable  
		String pageSource = driver.getPageSource();  
		// Printing length of the Page Source on console  
		System.out.println("Page source code is: "+pageSource);
		System.out.println("Source code lenght: "+pageSource.length());
		//close current browser
		driver.close();

	}

}