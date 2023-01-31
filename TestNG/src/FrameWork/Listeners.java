package FrameWork;

import org.testng.ITestListener;
import org.testng.ITestResult;

// ITestListeners
public class Listeners implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result)
	{
		//To take a screenshot when test is failed
	}
}
