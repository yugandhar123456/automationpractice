package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.MavenUtility;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MavenUtility M1 = new MavenUtility();
		WebDriver driver = M1.setUp("chrome","https:www.flipkart.com");
		//using Escape of keyboard to avoid login popup
	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
	    
	    List<WebElement> menu=driver.findElements(By.cssSelector("#container>div>div._331-kn._2tvxW>div>div>div"));
		System.out.println("Main Menu Option count: "+menu.size());
		for(int i=0;i<menu.size();i++) {
		System.out.println(menu.get(i).getText());}
		System.out.println("==============FASHION====================");
		Actions act = new Actions(driver);
		act.moveToElement(menu.get(2)).perform();
		
		List<WebElement> submenu1=driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[2]/div[2]/div[2]/div/div/div[1]/a"));
		System.out.println("Sub Menu1 Option count: "+submenu1.size());
		for(int i=0;i<submenu1.size();i++) {
		System.out.println(submenu1.get(i).getText());}
		System.out.println("==================ELECTRONICS=======================");
		
		act.moveToElement(menu.get(3)).perform();
		List<WebElement> submenu2=driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[1]/a"));
		System.out.println("Sub Menu2 Option count: "+submenu2.size());
		for(int i=0;i<submenu2.size();i++) {
		System.out.println(submenu2.get(i).getText());}
		System.out.println("====================HOME======================");
		
		act.moveToElement(menu.get(4)).perform();
		List<WebElement> submenu3=driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[5]/a/div[2]/div[2]/div[2]/div/div/div[1]/a"));
		System.out.println("Sub Menu3 Option count: "+submenu3.size());
		for(int i=0;i<submenu3.size();i++) {
		System.out.println(submenu3.get(i).getText());}
		System.out.println("============BUTY TOYS AND MORE===================");
		
		act.moveToElement(menu.get(8)).perform();
		List<WebElement> submenu8=driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[9]/a/div[2]/div[2]/div[2]/div/div/div[1]/a"));
		System.out.println("Sub Menu8 Option count: "+submenu8.size());
		for(int i=0;i<submenu8.size();i++) {
		System.out.println(submenu8.get(i).getText());}
		System.out.println("=================VEHICLE=======================");
		
		act.moveToElement(menu.get(9)).perform();
		List<WebElement> submenu9=driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[10]/a/div[2]/div[2]/div[2]/div/div/div[1]/a"));
		System.out.println("Sub Menu9 Option count: "+submenu9.size());
		for(int i=0;i<submenu9.size();i++) {
		System.out.println(submenu9.get(i).getText());}
		System.out.println("=================================================");
	}

}
