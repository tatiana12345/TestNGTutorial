package performanceTest;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StopWatch_TestSuite {
	long startTime;
	long endTime;
	long duration;
	double seconds;
	
	private WebDriver wd;
	
	static Logger log = LogManager.getLogger(StopWatch_TestSuite.class.getName());
	StopWatch watch = new StopWatch();
  
	  @BeforeClass
	  public void beforeClasss() throws Exception  {
		  
		  PropertyConfigurator.configure("log4j.properties");
		  System.setProperty("webdriver.gecko.driver", "/Users/tatianakesler/Desktop/Selenium/installation/geckodriver");
		  
		  wd = new FirefoxDriver();
		  
		  wd.manage().window().maximize();
		  wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  ExcelUtility.setExcelFile(Constants.File_Path + Constants.File_Name, "Sheet1");
	  }
	  
	@Test
  public void fill_basic_info(Method name) throws Exception {
		
		watch.start();
		  
		    wd.get(Constants.URL);
		    SearchPage.navigateToFlightsTab(wd);
			SearchPage.fillOriginTextBox(wd, "New York");
			SearchPage.fillDestinationTextBox(wd, "Chicago");
			SearchPage.fillDepartureDate(wd,"12/25/2017");
			SearchPage.fillReturnDate(wd, "12/30/2017");
//			SearchPage.clickSearchButton(wd);
			
		endTime = System.nanoTime();
			duration = endTime - startTime;
			double seconds = (double)watch.getTime() / 1000.0;
			watch.reset();
			
			log.info("***************************");
			log.info("Time taken to execute this method: " + seconds + " seconds");
			
			ExcelUtility.setCellData(name.getName(), 1, 0);
			ExcelUtility.setCellData(seconds, 1, 1);
	}
//	@Test
//	public void fillAdvancedInfo() throws InterruptedException{
//
//		SearchPage.navigateToFlightsTab(wd);
//		Thread.sleep(2000);
//		WebElement element = wd.findElement(By.id("flight-advanced-options-hp-flight"));
//		String advancedDD = element.getAttribute("aria-expanded");
//		System.out.println("The DD is collapsed: " + advancedDD);
//		if (advancedDD.contains("false")){
//			SearchPage.clickOnAdvancedLink(wd);		
//		
//			SearchPage.clickNonStopCheckBox(wd);
//			SearchPage.selectFlightClass(wd, "first");
//			//SearchPage.clickSearchButton(wd);
//		}
//		
//		else{
//		SearchPage.clickNonStopCheckBox(wd);
//		SearchPage.selectFlightClass(wd, "first");
//		//SearchPage.clickSearchButton(wd);
//		}
//	}

	@AfterClass
  public void afterClass() {
		log.info("test complete");
		wd.quit();
  
	}

}
