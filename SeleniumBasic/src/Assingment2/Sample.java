package Assingment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://sample.tricentis.com/101/");
		
		String pageTitle=driver.getTitle();
		
		System.out.println("Login page title: "+driver.getTitle());
		
		System.out.println("Page title validation: "+pageTitle.equals("404 - Tricentis: The Continuous Testing Company"));
		
		String actualUrl = driver.getCurrentUrl();
		System.out.println("URL validation: "+actualUrl.equals("https://sample.tricentis.com/101/"));
	
		String pageSource = driver.getPageSource();
		
		System.out.println("Source code lenght: "+pageSource.length());
		
	}
}
