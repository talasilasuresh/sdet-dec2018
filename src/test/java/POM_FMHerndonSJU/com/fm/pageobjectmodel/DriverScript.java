package POM_FMHerndonSJU.com.fm.pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DriverScript {
	
	WebDriver driver;


	@BeforeClass
	public void setup(){
		
		String AUT = "http://sdettraining.com/online/";
		System.out.println("Browser gets prepared here and will navigate to the AUT");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get(AUT);
		
		
	}
	
	@Test
	public void tc_End2EndShoppingCartTest() {
		
		System.out.println("Step 1 : Search Class/Page Object will get called");
		Search sp = new Search();
		sp.SearchItem(driver, "echo");
		
		
		System.out.println("Step 2 : AddtoCart Class/Page Object will get called");
		System.out.println("Step 3 : ModifyCart Class/Page Object will get called");
		System.out.println("Step 4 : CheckOut Class/Page Object will get called");
		System.out.println("Step 5 : OrderConfirmation Class/Page Object will get called");
		System.out.println("Step 6 : Verify the Order has been placed code is executed");
	}
	
	@AfterTest
	public void tearDown() {
				System.out.println("Browser will get closed");
//				driver.quit();
		
	}
}
