package POM_FMHerndonSJU.com.fm.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
	
	public Search() {
		
		System.out.println("Implement Search Functionality");
	}
	
	public void SearchItem(WebDriver driver, String item2Search) {
   	 
   	    	 
		driver.findElement(By.name("txtSearch")).clear();
		driver.findElement(By.name("txtSearch")).sendKeys(item2Search);
		driver.findElement(By.id("Go")).click();
		
		System.out.println("Executed Search completed Successfully");
		
   	 
}

}

	


