package Assingment5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTIME2 {

	public static void main(String[] args) {
		// set required browser driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		//enter user name
		WebElement username1InputField=driver.findElement(By.id("username"));
		username1InputField.sendKeys("admin");
		//enter password		
		WebElement password1InputField=driver.findElement(By.name("pwd"));
		password1InputField.sendKeys("manager");
		//click on log in button		
		driver.findElement(By.id("loginButton")).click();
		//click on task
		driver.findElement(By.id("container_tasks")).click();
		// click on add task
		driver.findElement(By.cssSelector(".addNewContainer")).click();
		//in dropdown button store a tasks in string
		List<WebElement> options=driver.findElements(By.cssSelector("body>div.dropdownContainer.addNewMenu>div.item"));
				
				
		//choose new task and click
		options.get(2).click();
		//click on enter the task name
		WebElement InputField= driver.findElement(By.cssSelector("tr:nth-child(1)>td.nameCell.first>input"));
		InputField.click();
		//input task name
		InputField.sendKeys("tester119");
		//click on deadline
		driver.findElement(By.className("x-btn-text")).click();
		//click on next month arrow
		driver.findElement(By.xpath("/html/body/div[57]/ul/li/div/table/tbody/tr[1]/td[3]/a")).click();
		//click on date
		driver.findElement(By.cssSelector("tr:nth-child(3)>td:nth-child(4)>a>em>span")).click();
		//click on type of work
		driver.findElement(By.cssSelector("tr:nth-child(1)>td.billingTypeCell>div.typeOfWorkButton.editable>div")).click();
		//store dropdown options on string
		List<WebElement> options2=driver.findElements(By.cssSelector("#createTasksPopup_content  div>div.typeOfWorkRow"));
				
		//click testing 
		options2.get(8).click();
		//click on create task
		WebElement Field=driver.findElement(By.cssSelector("#createTasksPopup_content > div.basicLightboxFooter > div.buttonsBox > div.commitButtonPlaceHolder > div"));
		Field.click();
		//click on check box
		WebElement check= driver.findElement(By.cssSelector("div.tasksTable.scrollToTopButtonShifted.allTasksLoaded.hasSelectedCustomer.hasSelectedProject div>div.innerScrollableContainer>div>div.innerScrollableContainer>div.taskRowsTableContent>div div.createdTasksTableContainer>table>tbody>tr>td.selection>div>div"));
	    check.click();
		//click on delete button
		driver.findElement(By.cssSelector(".delete.button")).click();
		//click on confirm delete pop-up
		driver.findElement(By.xpath("/html/body/div[18]/div[2]/div[2]/div[1]/div[1]/div/div[5]/div[1]/div/span")).click();

	}
	}