package TestNG_Pkg;

import org.testng.annotations.Test;

public class TestNG_Order {
	

	@Test (groups = {"Login"}, priority = 0)
	  public void InvalidLogin() {
		  System.out.println("Invalid Login");
	  }
	  
	  @Test (groups = {"Login"}, priority = 1)
	  public void Login() {
		  System.out.println("Login");
	  }
	  
	  @Test ( priority = 2)
	  public void Search() {
		  System.out.println("Search");
	  }
	  
	  @Test (priority = 3)
	  public void AddItem() {
		  System.out.println("AddItem");
	  }
	  
	  @Test (priority = 4)
	  public void Payment() {
		  System.out.println("Payment");
	  }
	  
	  @Test (priority = 5)
	  public void OrderConfirmation() {
		  System.out.println("OrderConfirmation");
	  }
	  
	  
		  
}
	  
//	  AddItem
//    Payment
//    OrderConfirmation
