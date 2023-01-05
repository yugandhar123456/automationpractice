package MouseOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReuableFunction {
	static WebDriver driver=null;
	public static void main(String[] args) {
		driver=setUp("chrome", "https://www.google.com");
		System.out.println(driver.getTitle());
		cleanUp();
	}

	static WebDriver setUp(String browserName, String url) {
		
		String exePath;
		if (browserName.equalsIgnoreCase("chrome")) {
			exePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
			// setting the path for driver executable
			System.setProperty("webdriver.chrome.driver", exePath);
			// creating an instance of Chrome browser and up-casting it to WebDriver
			// interface
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			exePath = System.getProperty("user.dir") + "\\Executables\\geckodriver.exe";
			// setting the path for driver executable
			System.setProperty("webdriver.gecko.driver", exePath);
			// creating an instance of Chrome browser and up-casting it to WebDriver
			// interface
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("ie")) {
			exePath = System.getProperty("user.dir") + "\\Executables\\IEDriverServer.exe";
			// setting the path for driver executable
			System.setProperty("webdriver.ie.driver", exePath);
			// creating an instance of Chrome browser and up-casting it to WebDriver
			// interface
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL use get() of WebDriver interface
		driver.get(url);
		return driver;
	}
	static void cleanUp() {
		driver.close();
	}

}