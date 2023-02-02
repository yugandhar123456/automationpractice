package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.MavenUtility;

public class Jquiry {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MavenUtility M1 = new MavenUtility();
		WebDriver driver = M1.setUp("firefox","https://jqueryui.com/sortable/");
		
		WebElement iframe = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe);

		WebElement item1 = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle' and text()='Item 1']"));

		Actions actions = new Actions(driver);
		actions.clickAndHold(item1).dragAndDropBy(item1, 0, 250).build().perform();
		Thread.sleep(1500);
		WebElement item2 = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle' and text()='Item 2']"));
		actions.clickAndHold(item2).dragAndDropBy(item2, 0, 210).build().perform();
		Thread.sleep(1500);
		WebElement item3 = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle' and text()='Item 3']"));
		actions.clickAndHold(item3).dragAndDropBy(item3, 0, 180).build().perform();
		Thread.sleep(1500);
		WebElement item4 = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle' and text()='Item 4']"));
		actions.clickAndHold(item4).dragAndDropBy(item4, 0, 140).build().perform();
		Thread.sleep(1500);
		WebElement item5 = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle' and text()='Item 5']"));
		actions.clickAndHold(item5).dragAndDropBy(item5, 0, 100).build().perform();
		Thread.sleep(1500);
		WebElement item6 = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle' and text()='Item 6']"));
		actions.clickAndHold(item6).dragAndDropBy(item6, 0, 50).build().perform();
		driver.close();
	
	}
}
