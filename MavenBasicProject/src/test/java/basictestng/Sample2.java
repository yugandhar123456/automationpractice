package basictestng;

import org.testng.annotations.Test;

public class Sample2 {
	int age=25;
 
  @Test
  public void testCase2() {
	  System.out.println("I am test case2....");
	  System.out.println("age: "+age);
  }
  @Test
  public void testCase3() {
	  System.out.println("I am test case3....");
	  System.out.println("age: "+age);
  }
  @Test
  public void testCase1() {
	  System.out.println("hi");
  }
}

/**
If a class is having more dn one test method dn all the test method will be executed in alphabetical order
*/