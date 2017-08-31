package ParametersAndParallelTesting;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Practice {

	private WebDriver wd;
	String baseURL;
	Practice_UT UT;
	
  @BeforeMethod
  @Parameters({"browser"})
  public void setUp(String browser) {
	  baseURL = "http://www.letskodeit.com/";
	  
	  if(browser.equalsIgnoreCase("firefox")){
	  System.setProperty("webdriver.gecko.driver", "/Users/tatianakesler/Desktop/Selenium/installation/geckodriver");
		wd = new FirefoxDriver();
		UT = new Practice_UT(wd);
	  }
	  else if(browser.equalsIgnoreCase("chrome")){
		  System.setProperty("webdriver.chrome.driver", "/Users/tatianakesler/Desktop/Selenium/installation/chromedriver");
			wd = new ChromeDriver();
			UT = new Practice_UT(wd);
	  }
	    wd.manage().window().maximize();
	    wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    wd.get(baseURL);
  }

  @Test
  public void parallel_test() throws InterruptedException {

	  UT.clickLogin();
	 Thread.sleep(2000); 
	  UT.enterEmail();
	  UT.enterPassword();
	  UT.clickGo();
	  
	  boolean result = UT.LogOut_isPresent();
	  Assert.assertTrue(result);
	   
  }
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  wd.quit();
  }

}
