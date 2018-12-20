package SeleniumTest_Day1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;

public class C_17_4a_JUnit {
	
	WebDriver driver;
	String baseURL;
	
	@Before
	public void  setup() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		baseURL = "http://www.google.com/";
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
		
	}
	
	@Test
	public void  testVerifyHomePage() throws Exception {
		
		driver.get(baseURL + "/");
		String actualPageTitle = driver.getTitle();
		String pageTitle = "Facebook - Log In or Sign Up";
		 System.out.println(pageTitle);
		 System.out.println(actualPageTitle);
	    Assert.assertEquals(pageTitle, actualPageTitle);
	   
	   
		
	}
	
	@Test
	public void  testLogin() throws Exception {
		
		 driver.findElement(By.id("email")).sendKeys("");
//       driver.findElement(By.id("pass")).sendKeys("Password12#");
       driver.findElement(By.cssSelector("#pass")).sendKeys("Password12#");
       driver.findElement(By.id("u_0_2")).click();
	  
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	
	
	

}
