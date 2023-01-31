package FrameWork;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewLoan
{
	@Test
	public void loan()
	{
		System.out.println("Car loans");
	}
	
	@Test(dependsOnMethods= {"loan"})
	public void Homeloan()
	{
		System.out.println("Home loans");
	}
	
	@Test(groups= {"smoke"})
	public void mobileloan()
	{
		System.out.println("Mobile loans");
	}
	
	@Parameters({"call"})
	@Test
	public void mobilelogin(String call1)
	{
		System.out.println("Mobile Login");
		System.out.println(call1);
	}
	
	@BeforeTest
	public void before()
	{
		System.out.println("I will execute first");
	}
	
	@Test
	public void mobilesignin()
	{
		System.out.println("Mobile Signin");
	}
	
	@AfterTest(groups= {"smoke"})
	public void After()
	{
		System.out.println("I will execute at last");
	}
	
}
