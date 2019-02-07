package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class firsttestng
{
	
	
	@Test(priority=1,description="This will verify login")
	public void login()
	
	{
		System.out.println("Hello World");
		Reporter.log( "Message", true );
		Assert.assertEquals(12, 13);
		
	}

	@Test(priority=2,description="this is check out")
	public void checkout()
	
	{
		System.out.println("Item Checkout");
		Reporter.log( "Message", true );
		
	}

	@Test(priority=3,description="Payments page")
	public void Payments()
	
	{
		System.out.println("Payments page testing assertion");
		Reporter.log( "Message", true );
		
	}
	
}

