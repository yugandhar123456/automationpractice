package Assingment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException 
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
				driver.get("https://www.amazon.in");
				//set required window size
				driver.manage().window().setSize(new Dimension(1000, 2000));
				//get page title and print in the console
				String pageTitle=driver.getTitle();				
				System.out.println("Login page title: "+pageTitle);	
				
				driver.findElement(By.id("nav-hamburger-menu")).click();
				//driver.findElement(By.linkText("Amazon Pay")).click();
			    driver.navigate().to("https://www.amazon.in/gp/sva/dashboard?ref_=nav_cs_apay");
				Thread.sleep(1500);
				
				String page2Title=driver.getTitle();
				System.out.println("amazon Pay Page title is  " +page2Title);
				//to come back to the previous page
       			driver.navigate().back();
       			
       			String page3Title=driver.getTitle(); 	
       			System.out.println("Login page title: "+page3Title);
       			System.out.println("Page title validation: "+pageTitle.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
       			Thread.sleep(2000);
       		    //close current browser
       			driver.close();
	}
}
