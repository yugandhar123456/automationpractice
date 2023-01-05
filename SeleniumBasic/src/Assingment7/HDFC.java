package Assingment7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFC {

	public static void main(String[] args) {
		// set required browser driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// create instance of required browser class
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//go to the site
		driver.get("https://www.nseindia.com/");
		//driver.findElement(By.xpath("//*[@id=\"gainers_loosers\"]/div[3]/a")).click();
		//driver.findElement(By.cssSelector("#link_2")).click();
		//driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/div/div[1]/div/div[1]/ul/li[2]/a")).click();
		WebElement b =driver.findElement(By.xpath("//tr[td[a[text()='TATASTEEL']]]/td[4]"));
		System.out.println("VOLUME OF TCS : "+b.getText());
		driver.close();

	}

}
