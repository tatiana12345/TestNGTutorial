package testPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_EnableTimeOut {
 
  @BeforeClass
  public void setUp() {
		System.out.println("before class");
  }

  @AfterClass
  public void cleanUp() {
		System.out.println("after class");
  }
  
  @Test(enabled=false)
  public void TestMethod1() {
	  System.out.println("testMethod1");
  }
  
  @Test
  public void TestMethod2() {
	  System.out.println("testMethod2");
  }
  

}
