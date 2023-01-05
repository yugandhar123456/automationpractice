package Assingment4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gsmarena3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set required browser driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
						
		String actualUrl = driver.getCurrentUrl();
		System.out.println("URL validation: "+actualUrl.equals("https://www.gsmarena.com/"));
				
		driver.findElement(By.cssSelector("#body > aside > div > ul > li:nth-child(1) > a")).click();
		
		List<WebElement> pages=driver.findElements(By.cssSelector("#body > div > div.review-nav.pullNeg.col.pushT10 > div.nav-pages > a"));
		System.out.println("Page Option count: "+pages.size());
		for(int i=0;i<pages.size();i++) {
		System.out.println(pages.get(i).getText());
		}
		
		driver.findElement(By.linkText("2")).click();
		String page2Url = driver.getCurrentUrl();
		System.out.println("page2 url is := "+page2Url);
		
		driver.findElement(By.linkText("3")).click();
		String page3Url = driver.getCurrentUrl();
		System.out.println("page3 url is := "+page3Url);
		
		driver.findElement(By.linkText("4")).click();
		String page4Url = driver.getCurrentUrl();
		System.out.println("page4 url is := "+page4Url);
		
		driver.findElement(By.linkText("5")).click();
		String page5Url = driver.getCurrentUrl();
		System.out.println("page5 url is := "+page5Url);
		
		driver.findElement(By.linkText("6")).click();
		String page6Url = driver.getCurrentUrl();
		System.out.println("page6 url is := "+page6Url);
		
		driver.findElement(By.linkText("7")).click();
		String page7Url = driver.getCurrentUrl();
		System.out.println("page7 url is := "+page7Url);
		
		driver.findElement(By.linkText("8")).click();
		String page8Url = driver.getCurrentUrl();
		System.out.println("page8 url is := "+page8Url);
		
		driver.findElement(By.linkText("9")).click();
		String page9Url = driver.getCurrentUrl();
		System.out.println("page9 url is := "+page9Url);
		
		driver.findElement(By.linkText("10")).click();
		String page10Url = driver.getCurrentUrl();
		System.out.println("page10 url is := "+page10Url);
		
		driver.findElement(By.linkText("11")).click();
		String page11Url = driver.getCurrentUrl();
		System.out.println("page11 url is := "+page11Url);
		
		driver.findElement(By.linkText("12")).click();
		String page12Url = driver.getCurrentUrl();
		System.out.println("page12 url is := "+page12Url);
		
		driver.findElement(By.linkText("13")).click();
		String page13Url = driver.getCurrentUrl();
		System.out.println("page13 url is := "+page13Url);
		
		driver.findElement(By.linkText("14")).click();
		String page14Url = driver.getCurrentUrl();
		System.out.println("page14 url is := "+page14Url);
		
		driver.findElement(By.linkText("15")).click();
		String page15Url = driver.getCurrentUrl();
		System.out.println("page15 url is := "+page15Url);
	}

}
