package ParametersAndParallelTesting;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class PracticeCH {

	private WebDriver wd;
	String baseURL;
	Practice_UT UT;
	
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/tatianakesler/Desktop/Selenium/installation/chromedriver");
		wd = new ChromeDriver();
		UT = new Practice_UT(wd);
		
	    baseURL = "http://www.letskodeit.com/";
	    wd.get(baseURL);
	    wd.manage().window().maximize();
	    wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void parallel_test_CH() {
	  UT.clickLogin();
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
