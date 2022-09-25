package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsonMethod {

	@Test(dependsOnMethods={"login"})
	
	public void application()
	{
		System.out.println("app");
	}
	@Test 
	public void login()
	{
		System.out.println("login");
		Assert.assertEquals("name", "nn");
	}
	@Test
	public void logout()
	{
		System.out.println("logout");
	}
}
