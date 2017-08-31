package DataProviders;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name="inputs")
	public Object[][] getData(){ //getData - is a random name
		return new Object[][]{
			{"bmw", "m3"},
			{"audi", "a6"},
			{"benz", "C300"}
		};
	}

}
