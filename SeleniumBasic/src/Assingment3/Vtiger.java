package Assingment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) 
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
				driver.get("https://demo.vtiger.com/vtigercrm/index.php");
				//set required window size
				driver.manage().window().setSize(new Dimension(1000, 2000));
				WebElement usernameInputField=driver.findElement(By.id("username"));
				System.out.println("user name input field visible or not? "+usernameInputField.isDisplayed());
				System.out.println("user name input field editable or not? "+usernameInputField.isEnabled());
				String usernameInputFieldValue=usernameInputField.getAttribute("value");
				System.out.println("Default value validation status: "+usernameInputFieldValue.equals("admin"));
				
				WebElement pass=driver.findElement(By.id("password"));
				System.out.println("password name input field visible or not? "+pass.isDisplayed());
				System.out.println("password name input field editable or not? "+pass.isEnabled());
				String passInputFieldValue=pass.getAttribute("value");
				System.out.println("Default value validation status: "+passInputFieldValue.equals("Test@123"));
				
				WebElement SiginBtn=driver.findElement(By.tagName("button"));
				System.out.println("Sigin button visible or not? "+SiginBtn.isDisplayed());
				System.out.println("Sigin button functional or not? "+SiginBtn.isEnabled());	
				String actualButtonName=SiginBtn.getText().trim();//text has additional spaces, to remove that use trim()
				System.out.println("Sigin button name validation status? "+actualButtonName.equals("Sign in"));
				
				WebElement username1InputField=driver.findElement(By.id("username"));
				username1InputField.clear();
				username1InputField.sendKeys("admin");
				
				WebElement password1InputField=driver.findElement(By.id("password"));
				password1InputField.clear();
				password1InputField.sendKeys("Test@123");
				
				driver.findElement(By.tagName("button")).click();
				
				driver.findElement(By.xpath("//button[@class='btn btn-default addButton dropdown-toggle']")).click();
                   
	}

}
