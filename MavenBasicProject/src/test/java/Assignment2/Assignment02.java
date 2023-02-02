package Assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.MavenUtility;

public class Assignment02 extends MavenUtility
{
	@Test(enabled=true, priority=1)
	public void openBrowserAndAppURL() {
	WebDriver driver = setUp("Chrome", "https://demo.actitime.com/login.do");
	}
	@Test(enabled=true, priority=2, dependsOnMethods="openBrowserAndAppURL")
	public void login() {
	WebElement username1InputField = driver.findElement(By.id("username"));
	username1InputField.sendKeys("admin");
	// enter password
	WebElement password1InputField = driver.findElement(By.name("pwd"));
	password1InputField.sendKeys("manager");
	// click on log in button
	driver.findElement(By.id("loginButton")).click();
	}
	@Test(enabled=true, priority=3, dependsOnMethods="login")
	public void createTask() {
	//click on task
	driver.findElement(By.id("container_tasks")).click();
	// click on add task
	driver.findElement(By.cssSelector(".addNewContainer")).click();
	
	//in dropdown button store a tasks in string
	List<WebElement> options=driver.findElements(By.cssSelector("body>div.dropdownContainer.addNewMenu>div.item"));
	//choose new task and click
	options.get(2).click();
	//
	//click on enter the task name
	WebElement InputField= driver.findElement(By.cssSelector("tr:nth-child(1)>td.nameCell.first>input"));
	InputField.click();
	//input task name
	InputField.sendKeys("tester116");
	//click on type of work
	driver.findElement(By.cssSelector("tr:nth-child(1)>td.billingTypeCell>div.typeOfWorkButton.editable>div")).click();
	//store dropdown options on string
	List<WebElement> options2=driver.findElements(By.cssSelector("#createTasksPopup_content  div>div.typeOfWorkRow"));
	//click testing 
	options2.get(8).click();
	//click on create task
	WebElement Field=driver.findElement(By.cssSelector("#createTasksPopup_content > div.basicLightboxFooter > div.buttonsBox > div.commitButtonPlaceHolder > div"));
	Field.click();
	}
	@Test(enabled=true, priority=4,dependsOnMethods="login")
	public void Delete() {
	//click on check box
    WebElement check= driver.findElement(By.cssSelector("div.tasksTable.scrollToTopButtonShifted.allTasksLoaded.hasSelectedCustomer.hasSelectedProject div>div.innerScrollableContainer>div>div.innerScrollableContainer>div.taskRowsTableContent>div div.createdTasksTableContainer>table>tbody>tr>td.selection>div>div"));
    check.click();
    //click on delete button
    driver.findElement(By.cssSelector(".delete.button")).click();
	//click on confirm delete pop-up
	driver.findElement(By.xpath("/html/body/div[18]/div[2]/div[2]/div[1]/div[1]/div/div[5]/div[1]/div/span")).click();
	}
	@Test(enabled=true, priority=5,dependsOnMethods="login")
	public void Close() {
	cleanUp();
}}
