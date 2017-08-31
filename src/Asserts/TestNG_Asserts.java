package Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNG_Asserts {
  @Test
  public void testSum() {
	  System.out.println("\nRunning Test -> test Sum\n");
	  Class_toTest_Assert obj = new Class_toTest_Assert();
	  int result =  obj.SumNumbers(1, 2);
	  Assert.assertEquals(result, 3);
  }
  
  @Test
  public void testString() {
	  System.out.println("\nRunning Test -> test Strings");
	  String expectedString ="Hello World";
	  Class_toTest_Assert obj = new Class_toTest_Assert();
	  String result = obj.addStrings("Hello", "World");
	  Assert.assertEquals(result, expectedString);
  }
  @Test
  public void testArrays() {
	  System.out.println("\nRunning Test -> testArrays");
	  int[] expectedArray = {1, 2, 3};
	  Class_toTest_Assert obj = new Class_toTest_Assert();
	  int[] result = obj.getArray();
	  Assert.assertEquals(result, expectedArray);
	  System.out.println("\nEnd Test -> testArrays");
  }
}
