package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.MavenUtility;

public class Assignment01
{
    public static void main(String[]args)
    {
    WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://demo.automationtesting.in/Register.html");
//MavenUtility M1 = new MavenUtility();
//WebDriver driver = M1.setUp("chrome","https://demo.automationtesting.in/Register.html");
     WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
     firstName.sendKeys("abc",Keys.TAB);

     driver.switchTo().activeElement().sendKeys("xyz",Keys.TAB);
 
     driver.switchTo().activeElement().sendKeys("jalgaon",Keys.TAB);

     driver.switchTo().activeElement().sendKeys("yugandhar0465@gmail.com",Keys.TAB);

     driver.switchTo().activeElement().sendKeys("7896548759",Keys.TAB);

     driver.findElement(By.xpath("//input[@value='Male']")).click();

     driver.findElement(By.xpath("//input[@value='Movies']")).click();
     WebElement element = driver.findElement(By.xpath("//html//body"));
     element.sendKeys(Keys.chord(Keys.PAGE_DOWN));

      driver.findElement(By.id("msdd")).click();
      List <WebElement> lang=driver.findElements(By.cssSelector("ul.ui-autocomplete >li"));
      System.out.println("size of language"+lang.size());
      lang.get(2).click();
      lang.get(10).click();

      driver.findElement(By.xpath("//*[text()='Select Skills']")).click();

      driver.findElement(By.xpath("//*[text()='Android']")).click();

      driver.findElement(By.xpath("//*[text()='Select Country']")).click();

      driver.findElement(By.xpath("//option[text()='Australia']")).click();
//click on year
      driver.findElement(By.id("yearbox")).click();
      driver.findElement(By.xpath("//*[text()='1916']")).click();
//click on month
      driver.findElement(By.cssSelector("select[placeholder='Month']")).click();
      driver.findElement(By.xpath("//option[text()='May']")).click();
//click on date
      driver.findElement(By.cssSelector("select[placeholder='Day']")).click();
      driver.findElement(By.xpath("//*[text()='4']")).click();

      driver.findElement(By.id("firstpassword")).sendKeys("32564845",Keys.TAB);

      driver.findElement(By.id("secondpassword")).sendKeys("445112445",Keys.ENTER);
}

}