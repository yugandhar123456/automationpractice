package Assingment;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox 
{
	public static void main(String[] args) {
		
		//set the driver executable path using System.setproperty(String key,String value)
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		
		//create an instance of required browser class
		FirefoxDriver cdriver=new FirefoxDriver();
		
		FirefoxDriver driver = new FirefoxDriver();
		// enter the required URL
		cdriver.get("https://demosite.executeautomation.com/Login.html");
		
		//System.out.println("Page title is: "+driver.getTitle());
		// Storing Title length in the int variable  
		//int titleLength = driver.getTitle().length();
		//System.out.println("Length of the title is : "+ titleLength); 
		//String actualUrl = driver.getCurrentUrl();
		//System.out.println("URL validation: "+actualUrl.equals("https://demosite.exeuteautomation.com/Login.html"));
}
}