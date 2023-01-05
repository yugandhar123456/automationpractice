package Assingment9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class HandlingActiveElements {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		//call setup method
		WebDriver driver=s1.setUp("firefox", "https://demo.automationtesting.in/Register.html");
		//identify web element
		WebElement firstName =driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		firstName.sendKeys("Yugandhar",Keys.TAB);
		//use swith to active element
		driver.switchTo().activeElement().sendKeys("Barhate",Keys.TAB);
		
	    driver.switchTo().activeElement().sendKeys("jalgaon",Keys.TAB);
		
		driver.switchTo().activeElement().sendKeys("yugandharbarhate007@gmail.com",Keys.TAB);
		
	    driver.switchTo().activeElement().sendKeys("8805082254",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		WebElement element = driver.findElement(By.xpath("//html//body"));
	    //element.sendKeys(Keys.chord(Keys.DOWN),Keys.chord(Keys.DOWN));
		element.sendKeys(Keys.chord(Keys.PAGE_DOWN));
		driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
		List<WebElement> list = driver.findElements(By.cssSelector("ul.ui-autocomplete >li"));
		System.out.println("list option count: " + list.size());
        list.get(0).click();
        list.get(1).click();
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\\\"Skills\\\"]"));
        Actions actions = new Actions(driver); actions.moveToElement(element1).click().build().perform();
       // driver.findElement(By.xpath("//*[@id=\"Skills\"]")).click();
       // driver.findElement(By.xpath("//*[text()='Android']")).click();
		
		//driver.findElement(By.xpath("//*[text()='Select Country']")).click();

		//driver.findElement(By.xpath("//option[text()='Australia']")).click();
		//click on year
		
		
	}
}
