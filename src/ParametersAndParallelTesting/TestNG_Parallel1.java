package ParametersAndParallelTesting;

import org.testng.annotations.Test;

public class TestNG_Parallel1 {
  @Test
  public void TestMethod1() throws InterruptedException {
	  System.out.println("TestNG_Parallel1 -> testMethod1");
	  Thread.sleep(2000);
	  System.out.println("TestNG_Parallel1 -> testMethod1 -> Next Step");
  }
  
  @Test
  public void TestMethod2() throws InterruptedException {
	  System.out.println("TestNG_Parallel1 -> testMethod2");
	  Thread.sleep(2000);
	  System.out.println("TestNG_Parallel1 -> testMethod2 -> Next Step");
  }
  
}
