package Asserts;

//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Asserts.Class_toTest_Assert;

public class SoftAsserts {
  @Test
  public void testSum() {
	  SoftAssert sa = new SoftAssert();
	  System.out.println("\nRunning Test -> test Sum\n");
	  Class_toTest_Assert obj = new Class_toTest_Assert();
	  int result = obj.SumNumbers(1, 2);
	  sa.assertEquals(result, 2);
	  System.out.println("\nLine after Int Sum assert 1");
	  sa.assertEquals(result, 3);
	  System.out.println("\nLine after Int Sum assert 2\n");
	  sa.assertAll();
  }
  
  @Test
  public void testString(){
	  SoftAssert sa = new SoftAssert();
	  System.out.println("\nRunning Test -> test String");
	  Class_toTest_Assert obj = new Class_toTest_Assert();
	  String expectedString = "Hello World";
	  String expectedString2 = "Hello World!!!";
	  String result = obj.addStrings("Hello", "World");
	  sa.assertEquals(result, expectedString);
	  System.out.println("\nLine after String assert 1");
	  sa.assertEquals(result, expectedString2);
	  System.out.println("\nLine after String assert 2");
	  sa.assertAll();
	  
  }
  
  @Test
  public void testArray(){
	  SoftAssert sa = new SoftAssert();
	  System.out.println("\nRunning Test -> testArrays");
	  Class_toTest_Assert obj = new Class_toTest_Assert();
	  int[] expectedArray = {1, 2, 3, 4};
	  int[] expectedArray2 = {1, 2, 3};
	  int[] result = obj.getArray();
	  sa.assertEquals(result, expectedArray);
	  System.out.println("\nLine after Array assert 1");
	  sa.assertEquals(result, expectedArray2);
	  System.out.println("\nLine after Array assert 2");
	  System.out.println("\nEnd Test -> testArrays");
	  sa.assertAll();
	  
  }
}