package Assingment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vtiger11
{
	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		String pageTitle=driver.getTitle();
		
		System.out.println("Login page title: "+pageTitle);	
		System.out.println("Login page title: "+pageTitle.length());
			
		//driver.findElement(By.id("username")).sendKeys("admin");
		//driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("vtiger"));
		
		System.out.println("Home page title: "+driver.getTitle());
	
		System.out.println("Home page title validation: "+pageTitle.equals("vtiger"));

	}
}
