package Listeners;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_ListenersTest1_3 {

  @BeforeClass
  public void setUp() {
	  System.out.println("TestNG_ListenersTest1_3 -> Code in before class");
  }
  
  @Test
  public void testMethod1() {
	  System.out.println("TestNG_ListenersTest1_3 -> Code in testMethod1");
		Assert.assertTrue(true);
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("TestNG_ListenersTest1_3 -> Code in testMethod2");
		Assert.assertTrue(false);
  }

  @AfterClass
  public void cleanUp() {
	  System.out.println("TestNG_ListenersTest1_3 -> Code in after class");
  }

}
