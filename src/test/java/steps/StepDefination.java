package steps;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import page.Login;
import utill.BrowserFactory;

public class StepDefination {
	
	WebDriver driver;
	Login Login;
	
	@Before
	public void beforeRun() {
		
		driver = BrowserFactory.init();
		Login = PageFactory.initElements(driver,Login.class );
	}
	
	
	@Given("^I am on techfios automation page$")
	public void i_am_on_techfios_automation_page() throws Throwable {
		
		driver.get("https://techfios.com/test/101/");
		
	    Thread.sleep(1000);
	}

	@Given("^Set Sky Blue Background button exist$")
	public void set_Sky_Blue_Background_button_exist() throws Throwable {
	    Login.VerifySetSkyBlueButtonExist();
	    Thread.sleep(1000);
	    
	}

	@When("^I click on button$")
	public void i_click_on_button() throws Throwable {
	    Login.SetSkyBlueBackgroundButton();
	    
	    Thread.sleep(1000);
	}

	@Then("^background color will change to sky blue$")
	public void background_color_will_change_to_sky_blue() throws Throwable {
	    Login.takeScreenshotAtEndOfTest(driver);
	    Thread.sleep(1000);
	}

	@Given("^Set White Background button exist$")
	public void set_White_Background_button_exist() throws Throwable {
	    Login.VerifysetWhiteButtonExist();
	    Thread.sleep(1000);
	    
	    
	}

	@When("^User clicks on the button$")
	public void user_clicks_on_the_button() throws Throwable {
	    Login.SetWhiteBackgroundButton();
	    Thread.sleep(1000);
	}

	@Then("^The background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
	    Login.takeScreenshotAtEndOfTest(driver);
	    
	}


	
}