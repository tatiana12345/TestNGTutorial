package ParametersAndParallelTesting;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameters {
	@BeforeClass
	@Parameters({"browser", "platform"})
	public void SetUp(String browser, String platform){
		System.out.println("TestNG_Parameters -> SetUp");
		System.out.println("1. Parameter value from xml file: " + browser);
		System.out.println("2. Parameter value from xml file: " + platform);
	}
	
  @Test
  @Parameters({"response"})
  public void TestMethod2(String response) {
	  String[] stringArray = response.split(",");
	  
	  System.out.println("TestingNG_Parameters -> testMethod 1");
	  System.out.println("Response from xml file: " + response);
	  System.out.println("StringArray[0] from xml file: " + stringArray[0]);
	  System.out.println("StringArray[1] from xml file: " + stringArray[1]);
  }
}
