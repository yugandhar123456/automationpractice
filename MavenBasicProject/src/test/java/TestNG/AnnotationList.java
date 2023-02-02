package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationList {
	@BeforeSuite
	public void f1() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void f2() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void f3() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void f4() {
		System.out.println("Before Method");
	}

	@Test
	public void f5() {
		System.out.println("TC1");
	}
	@Test
	public void f05() {
		System.out.println("TC2");
	}

	@AfterMethod
	public void f9() {
		System.out.println("After Method");
	}

	@AfterClass
	public void f8() {
		System.out.println("After class");
	}

	@AfterTest
	public void f7() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void f6() {
		System.out.println("After Suite");
	}
}