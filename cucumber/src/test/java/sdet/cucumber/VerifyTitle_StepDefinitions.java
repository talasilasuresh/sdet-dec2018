package sdet.cucumber;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class VerifyTitle_StepDefinitions {
	

	WebDriver driver = new ChromeDriver();
	String ActualTitle;
	String ExpectedTitle ="Facebook - Log In or Sign Up";


	@Given("^User is on the landing page$")

	public void user_is_on_landing_page() throws Throwable {

		System.setProperty("webdriver.choreme.driver", "chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		

	    // Write code here that turns the phrase above into concrete actions

	   // throw new PendingException();

	}



	@When("^User checks$")

	public void user_cahecks_the_title() throws Throwable {

	    // Write code here that turns the phrase above into concrete actions

	    //throw new PendingException();

		System.out.println("Page Title " + driver.getTitle());

		ActualTitle =driver.getTitle();

	}



	@Then("^It must say \"([^\"]*)\"$")

	public void it_must_say(String arg1) throws Throwable {

	    // Write code here that turns the phrase above into concrete actions

	    //throw new PendingException();

		if (ExpectedTitle.equals(ActualTitle)){

			System.out.println("Test Passed");

		}else

			System.out.println("Test Failed");	
		
			
		driver.quit();
		

		}
		
		}

