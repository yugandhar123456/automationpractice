package Assingment7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) {
		// set required browser driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//go to the site
		driver.get("https://www.demoblaze.com/");
		WebElement e =driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']//following::h5[1]"));
		System.out.println("Price Of Samsung galaxy s6 : "+e.getText());
		driver.close();		
	}
}
