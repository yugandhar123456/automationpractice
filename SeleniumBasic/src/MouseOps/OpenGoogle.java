package MouseOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.ReuableFunction;
import utilities.SeleniumResuableFunctions;

public class OpenGoogle {

	public static void main(String[] args) {
		
		ReuableFunction s1=new ReuableFunction();
		WebDriver driver=s1.setUp("chrome", "https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");

	}

}