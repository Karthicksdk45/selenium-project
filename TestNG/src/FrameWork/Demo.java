package FrameWork;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo 
{
	@Test(dataProvider="getData")
	public void run(String input,String data)
	{
		System.out.println("New TestNG");
		System.out.println(input);
		System.out.println(data);
	}
	
	@DataProvider
	public Object getData()
	{
		//Create an object
		Object[][] data = new Object[2][2];
		
		//input of 1
		data[0][0] = "Hi";
		data[0][1] = "Hello";
		
		//input of 2
		data[1][0] = "Welcome";
		data[1][1] = "Well";
		
		return data;
	}
}
