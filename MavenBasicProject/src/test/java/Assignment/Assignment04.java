package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utilities.MavenUtility;

public class Assignment04
{
public static void main(String[]args) throws InterruptedException
{
MavenUtility M1 = new MavenUtility();
WebDriver driver = M1.setUp("Chrome","https://www.saucedemo.com/");

JavascriptExecutor executor = (JavascriptExecutor)driver;
Thread.sleep(1700);
executor.executeScript("document.getElementById('user-name').value='standard_user'");
executor.executeScript("document.getElementById('password').value='secret_sauce'");
Thread.sleep(3000);
driver.findElement(By.id("user-name")).clear();

executor.executeScript("document.getElementById('user-name').value='locked_out_user'");
Thread.sleep(3000);
driver.findElement(By.id("user-name")).clear();

executor.executeScript("document.getElementById('user-name').value='problem_user'");
Thread.sleep(3000);
driver.findElement(By.id("user-name")).clear();

executor.executeScript("document.getElementById('user-name').value='performance_glitch_user'");
Thread.sleep(3000);
driver.findElement(By.id("user-name")).clear(); // or click
}

}

