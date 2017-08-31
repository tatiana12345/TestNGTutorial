package DataProviders;

import org.testng.annotations.Test;

public class DataProviders2 {
  
	//name in (dataProvider="inputs") should match the name in @DataProvider(name="inputs")
	@Test(dataProvider="inputs", dataProviderClass=TestData.class) 
  public void Method1(String input1, String input2) {
 
	
	  System.out.println("Input 1: " + input1 );
	  System.out.println("Input 2: " + input2 );
		
  }
}
