package ParametersAndParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice_UT{
	
	WebDriver wd = null;
	
	public Practice_UT (WebDriver wd){
		this.wd = wd;
	}

	public static WebElement element = null;

	public void clickLogin(){
		//Find Login link and click on it
	 wd.findElement(By.xpath("//div[(@id='comp-iiqg1vggactionTitle')and (text()='Login/Sign up')]")).click();
	 WebElement loginButton = wd.findElement(By.xpath("//a[(@id='signUpDialogswitchDialogLink') and(text()='log in')]"));
	 loginButton.click();                                        
	}
	
	public void enterEmail(){
		//Find email field and click on it
	 WebElement emailField = wd.findElement(By.id("memberLoginDialogemailInputinput"));
	 emailField.sendKeys("test@email.com");
	}
	
	public void enterPassword(){
		//Find password field and click on it
	 WebElement passwordField = wd.findElement(By.id("memberLoginDialogpasswordInputinput"));
	 passwordField.sendKeys("abcabc");
	}
	
	public void clickGo(){
		//Click on Login button
	 WebElement login = wd.findElement(By.id("memberLoginDialogoklink"));
	 login.click();
	}
	
	public boolean LogOut_isPresent(){
		WebElement LogOut = null;
		try {
			LogOut = wd.findElement(By.xpath("//div[(@id='comp-iiqg1vggactionTitle') and text()='Log out']"));
			if (LogOut !=null){
				return true;
			}
		}	
			catch (NoSuchElementException e){
				System.out.println(e.getMessage());
			}
		return false;
	
}
}