package DependentTCs;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Asserts.Class_toTest_Assert;

public class TestNG_DependentTest {
  
	Class_toTest_Assert obj;
	
	 @BeforeClass
	  public void SetUp() {
		 obj = new Class_toTest_Assert();
		 System.out.println("Before class");
	  }
	 
	  @AfterClass
	  public void CleanUp() {
		  System.out.println("After class");
	  }
	 
	@Test(dependsOnMethods={"TestMethod2"})
  public void TestMethod1() {
		System.out.println("testMethod1");
  }
  
	// If main TC fails, all dependent TC will be skipped
  @Test
  public void TestMethod2() {
	  System.out.println("testMethod2");
		int result = obj.SumNumbers(1, 2);
		Assert.assertEquals(result, 2);  
		//to PASS expected result should =3
		//Assert.assertEquals(result, 3);
  }
  
  @Test(dependsOnMethods={"TestMethod2"})
  public void TestMethod3() {
	  System.out.println("testMethod3");
  }
  
  @Test(dependsOnMethods={"TestMethod3"})
  public void TestMethod4() {
	  System.out.println("testMethod4");
  }

  @Test(dependsOnMethods={"TestMethod2"}, alwaysRun = true)
  public void TestMethod5() {
	  System.out.println("testMethod5");
  }
  
  @Test(dependsOnMethods={"TestMethod5"})
  public void TestMethod6() {
	  System.out.println("testMethod4");
  }
}
