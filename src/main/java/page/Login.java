package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Login extends BasePage {
	WebDriver driver;
	
	public Login(WebDriver driver) {
	  this.driver = driver;
	 }



	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]" ) 
	WebElement SET_SKYBLUE_BUTTON_LOCATOR;
	@FindBy(how= How.XPATH, using = "//button[contains(text(),'Set White Background')]") 
	WebElement SET_WHITE_BUTTON_LOCATOR;
	
	
	
	
	public void SetSkyBlueBackgroundButton() {
		
		SET_SKYBLUE_BUTTON_LOCATOR.click();
		
	}
		
	public void SetWhiteBackgroundButton() {
		
		SET_WHITE_BUTTON_LOCATOR.click();
	}
	
	
	public void VerifySetSkyBlueButtonExist() {
		boolean ePresence = SET_SKYBLUE_BUTTON_LOCATOR.isDisplayed();
		
		if (ePresence) {
			
			System.out.println("Set SkyBlueColor Button is present");
			}
		else {
			System.out.println("Set SkyBlueColor Button is not present");
		}
		
	}
	
	
	
	public void VerifysetWhiteButtonExist() {
		boolean ePresence = SET_WHITE_BUTTON_LOCATOR.isDisplayed();
		
		
		if (ePresence) {
			
			System.out.println("Set WhiteColor Button is present");
		
		}
		else {
			System.out.println("Set WhiteColor Button is not present");
			
		}
	
	}
	
	
	public String getPageTitle() {
		  return driver.getTitle();
		
		 }
		
		 
       public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
			  TakesScreenshot ts = ((TakesScreenshot) driver);
			  SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
			  Date date = new Date();
			  String label = formatter.format(date);
			  File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			  String currrentDir = System.getProperty("user.dir");
			  FileUtils.copyFile(sourceFile, new File(currrentDir + "/screenshots/" + label + ".png"));
			 }
       
       
			
}



