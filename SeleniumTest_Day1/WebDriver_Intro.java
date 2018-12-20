package SeleniumTest_Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class WebDriver_Intro {
	
  public static void main(String[] args) throws InterruptedException {
	  
	   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	   driver.manage().window().maximize();
	   driver.get("http://www.facebook.com/");
       System.out.println("Page title is  :" + driver.getTitle());
       
             
       driver.findElement(By.id("email")).sendKeys("");
//       driver.findElement(By.id("pass")).sendKeys("Password12#");
       driver.findElement(By.cssSelector("#pass")).sendKeys("Password12#");
       driver.findElement(By.id("u_0_2")).click();
       
       String expectedValue = "The email or phone number you’ve entered doesn’t match any account. Sign up for an account.";
       
       String actualValue;
       actualValue = " ";
       actualValue = driver.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div")).getText();
//       actualValue = driver.findElement(By.xpath(*[@id="globalContainer"]/div[3]/div/div/div)).getText();
       
       System.out.println("actual Value is: " + actualValue);
       
       if (expectedValue.equals(actualValue)) {
    	   System.out.println("TEST PASSED");
       }
       
       else
    	   System.out.println("TEST Failed");
       
            
	  
	
} 

}
