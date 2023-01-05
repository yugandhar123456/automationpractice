package Assingment5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
	
		// set required browser driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://redbus.in");
		
		driver.findElement(By.id("src")).sendKeys("Pune");
		driver.findElement(By.cssSelector("#search>div>div.fl.search-box.clearfix>div>ul>li.selected")).click();
		
		driver.findElement(By.id("dest")).sendKeys("Mumbai");
		driver.findElement(By.cssSelector("#search>div>div:nth-child(3)>div>ul>li.selected")).click();
		
		driver.findElement(By.id("onward_cal")).click();
		
		driver.findElement(By.cssSelector("#rb-calendar_onward_cal>table>tbody>tr:nth-child(5)>td:nth-child(5)")).click();
		
		driver.findElement(By.id("search_btn")).click();
		
		driver.findElement(By.cssSelector("#filter-block>div>div.details>ul.dept-time.dt-time-filter>li:nth-child(1)>label.custom-checkbox")).click();
		
		List<WebElement> options=driver.findElements(By.cssSelector("ul.bus-items>div>LI>div>div>div>div"));
	    //use size() to get option count
		System.out.println("Buses option count: "+options.size());
		//use for loop to print one by one option
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
	}
	}
}
