package Assingment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techlistic {

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
		driver.get("https://www.techlistic.com");
		//set required window size
		driver.manage().window().setSize(new Dimension(1000, 2000));
		//get page title and print in the console
		String pageTitle=driver.getTitle();				
		System.out.println("Login page title: "+pageTitle);
		
		driver.navigate().to("https://www.techlistic.com/p/java.html");
		
		String java=driver.getTitle(); 	
		System.out.println("java page title: "+java);
		System.out.println("java title validation: "+java.equals(""));
		Thread.sleep(500);
		//to come back to the previous page
		driver.navigate().back();
		
		driver.navigate().to("https://www.techlistic.com/p/selenium-tutorials.html");
		String selenium=driver.getTitle(); 	
		System.out.println("selenium page title: "+selenium);
		System.out.println("selenium title validation: "+java.equals(""));
		Thread.sleep(600);
		//to come back to the previous page
		driver.navigate().back();
		
		driver.navigate().to("https://www.techlistic.com/p/bdd-tutorial-with-python-behave.html");
		String BDD=driver.getTitle(); 	
		System.out.println("selenium page title: "+BDD);
		System.out.println("selenium title validation: "+BDD.equals(""));
		Thread.sleep(700);
		//to come back to the previous page
		driver.navigate().back();
		
		driver.navigate().to("https://www.techlistic.com/p/software-testing.html");
		String testng=driver.getTitle(); 	
		System.out.println("TestNG page title: "+testng);
		System.out.println("TestNG title validation: "+testng.equals(""));
		Thread.sleep(800);
		//close current browser
	    driver.close();

	}

}
