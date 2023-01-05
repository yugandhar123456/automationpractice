package Assingment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String pageTitle=driver.getTitle();
		
		System.out.println("Page title validation: "+pageTitle.equals("Facebook – log in or sign up"));
		System.out.println("Page title is: "+pageTitle);
		//close current browser
		driver.close();

	}

}