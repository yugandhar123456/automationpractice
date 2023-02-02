

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenChrome {

	public static void main(String[] args) {
		
		//set the driver executable path using System.setproperty(String key,String value)
		//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		//create an instance of required browser class
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("https://opensource-demo.orangehrmlive.com/");
	}

}