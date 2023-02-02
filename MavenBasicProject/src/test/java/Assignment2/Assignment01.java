package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.MavenUtility;

public class Assignment01 extends MavenUtility
{
  WebDriver driver;
  @BeforeClass
  public void services()
  {
	  //MavenUtilities M1 = new MavenUtilities();
	  WebDriver driver = setUp("Chrome", "https://demo.vtiger.com/vtigercrm/index.php");
  }
  @Test(priority=1)
  public void signin()
  {
	  //driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  @Test(priority=2)
  public void menu()
  {
	  driver.findElement(By.id("menu-toggle-action")).click();
	  driver.findElement(By.partialLinkText(" SALES")).click();
	  driver.findElement(By.linkText("index.php?module=Services&view=List&app=SALES")).click();
  }}