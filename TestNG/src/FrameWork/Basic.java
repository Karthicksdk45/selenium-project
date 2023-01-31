package FrameWork;

import org.testng.annotations.Test;

public class Basic 
{
	@Test(groups= {"smoke"})
	public void test()
	{
		System.out.println("Hello world");
	}
	@Test
	public void demo()
	{
		System.out.println("Hello Dood");
	}
}
