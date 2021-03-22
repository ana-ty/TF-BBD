package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	

	public int randomGenerator(int boundryNumber) {
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(boundryNumber);
		return randomNumber;
		
	}
	
	public void selectDropDown(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
		
	}

	public static void classwaitForElement(WebDriver driver, int TimeInSeconds, WebElement elementLocator) {
		
		WebDriverWait wait = new WebDriverWait(driver, TimeInSeconds);
		wait.until(ExpectedConditions.visibilityOf(elementLocator));
	}

}

