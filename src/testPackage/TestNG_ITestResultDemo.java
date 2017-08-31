package testPackage;

import org.junit.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

//ITestResult listener

public class TestNG_ITestResultDemo {
  @Test
  public void TestMethod1() {
	  System.out.println("Running -> testMethod1");
	  Assert.assertTrue(false);
  }
  
  @Test
  public void TestMethod2() {
	  System.out.println("Running -> testMethod2");
	  Assert.assertTrue(true);
  }
  
  @AfterMethod
  public void afterMethod(ITestResult testResult) {
	  if (testResult.getStatus() == ITestResult.FAILURE){
		  System.out.println("Failed: " + testResult.getMethod().getMethodName());
	  }
	  if(testResult.getStatus() == ITestResult.SUCCESS){
		  System.out.println("Successful: " + testResult.getName()); 
		  //"getName()" is the same as "getMethod().getMethodName()"
	  }
  }

}
