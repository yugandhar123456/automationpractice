package TestNG;

import org.testng.annotations.Test;

public class Actitime_InvocationCount {

	@Test(enabled=true,invocationCount=5)
	public void openBrowserAndAppURL() {
		System.out.println("Open browser and enter app url");
	}
}
/**
* we can define multiple parameter in @Test by using comma separator
*/