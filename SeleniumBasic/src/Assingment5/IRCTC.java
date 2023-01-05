package Assingment5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {

	public static void main(String[] args) {
		// set required browser driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//go to the site
		driver.get("https://www.irctc.co.in/nget/train-search");
		//alignation of logo
		WebElement logo=driver.findElement(By.xpath("//img[@alt='Indian railway logo']"));
		String logoFontSize=logo.getCssValue("height");
		System.out.println("logo height: "+logoFontSize);
		String alig=logo.getCssValue("vertical-align");
		System.out.println("LOGO VERTICAL ALIGNATION: "+alig);
		System.out.println("=============================================================");
		// position of home buttton
		WebElement home=driver.findElement(By.cssSelector(".fa.fa-home"));
		Point homebtnPosition=home.getLocation();
		int home_X_Cord=homebtnPosition.getX();
		int home_Y_Cord=homebtnPosition.getY();
		System.out.println("home btn x-cords---> "+home_X_Cord);
		System.out.println("home btn y-cords---> "+home_Y_Cord);
		System.out.println("============================================================");
		//veryfy login bth display,enable,or text validation 
		WebElement loginbtn=driver.findElement(By.cssSelector(".search_btn.loginText.ng-star-inserted"));
		System.out.println("login button disable :"+loginbtn.isDisplayed());
		System.out.println("login button enable  :"+loginbtn.isEnabled());
		System.out.println("login btn text  :"+loginbtn.getText());
		System.out.println("login btn text validation :"+loginbtn.getText().equals("LOGIN"));
		System.out.println("============================================================");
		//list of menu count
		List<WebElement> menu=driver.findElements(By.cssSelector("div.text-center.h_main_div>div.row.col-sm-12.h_head2>nav>ul>li"));
		
		System.out.println("MENU Option count: "+menu.size());
		for(int i=0;i<menu.size();i++) {
		System.out.println(menu.get(i).getText());}
		System.out.println("============================================================");
		//menu.get(3).click();
		//driver.navigate().back();
		//driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		//input from
		driver.findElement(By.cssSelector(".ng-tns-c57-8.ui-inputtext.ui-widget")).sendKeys("Mumbai");
		driver.findElement(By.cssSelector("#pr_id_1_list>li:nth-child(2)")).click();
		//input to
		driver.findElement(By.cssSelector("#destination>span>input")).sendKeys("kolkata");
		driver.findElement(By.cssSelector("#pr_id_2_list > li:nth-child(4)")).click();
		//clicl on date
		driver.findElement(By.cssSelector("#jDate>span>input")).click();
		//click on next month
		driver.findElement(By.className("ui-datepicker-next-icon")).click();
		//click on date
		driver.findElement(By.cssSelector("table>tbody>tr:nth-child(2)>td:nth-child(5)>a")).click();
		//click to choose class
		driver.findElement(By.cssSelector("#journeyClass>div")).click();
		//creating list of classes and store into the string
		List<WebElement> tear=driver.findElements(By.cssSelector("ul>p-dropdownitem"));
		//get classes size printing one by one classes
		System.out.println("Tears Option count: "+menu.size());
		for(int i=0;i<tear.size();i++) {
		System.out.println(tear.get(i).getText());}
		System.out.println("============================================================");
		//click on class
		tear.get(2).click();
		
		driver.findElement(By.xpath("//button[@label='Find Trains']")).click();
		
		List<WebElement> train=driver.findElements(By.cssSelector("div.form-group.no-pad.col-xs-12.bull-back.border-all > app-train-avl-enq > div.ng-star-inserted > div.dull-back.no-pad.col-xs-12 > div.col-sm-5.col-xs-11.train-heading > strong"));
		//get classes size printing one by one classes
		System.out.println("Trains Option count: "+train.size());
		for(int i=0;i<train.size();i++) {
		System.out.println(train.get(i).getText());}
		System.out.println("============================================================");
		
	}
}
