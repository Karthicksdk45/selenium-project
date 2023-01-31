package Selenium.Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReports1
{
	public static ExtentReports createReports()
	{
		//Extent spark reporter , Extent reports
		String file = System.getProperty("user.dir")+"//output//reports.html";
		ExtentSparkReporter report = new ExtentSparkReporter(file);
		report.config().setDocumentTitle("Automation Test Scenarios");
		report.config().setReportName("Execution reports");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(report);
		extent.createTest(file);
		return extent;
	}
}
