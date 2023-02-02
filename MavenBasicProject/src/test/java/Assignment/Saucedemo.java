package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.MavenUtility;

public class Saucedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MavenUtility M1 = new MavenUtility();
		WebDriver driver = M1.setUp("chrome","https://www.saucedemo.com/");
		
		String arr[][]= { {"standard_user","problem_user","performance_glitch_user","locked_out_user"} , {"secret_sauce","secret_sauce","secret_sauce","secret_sauce"} };
		
		for(int i=0; i<arr.length ; i++){

			
			for(int j=0;j<arr.length+2;j++) { 

			driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys(arr[i][j]);

			driver.findElement(By.xpath("//*[@id='password']")).sendKeys(arr[i+1][j]);

			//Find Login button
			driver.findElement(By.xpath("//*[@id='login-button']")).click();

			driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
			//Log out
			driver.findElement(By.xpath("//*[@id='logout_sidebar_link']")).click();           
	}
}
	driver.close();	
	}
	}
