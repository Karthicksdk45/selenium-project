package SeleniumAutomation.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentPractise
{
	ExtentSparkReporter report;
	ExtentReports extent;
	@BeforeTest
	public void extentReport()
	{
		String file = System.getProperty("user.dir")+"\\reports\\index.html";
		report = new ExtentSparkReporter(file);
		report.config().setReportName("Basic Google Page");
		report.config().setDocumentTitle("Google Page Demo");
		extent = new ExtentReports();
		extent.attachReporter(report);
	}
	@Test
	public void reports()
	{
		ExtentTest report = extent.createTest("Intial Test");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		//report.fail("Failure check");
		
		extent.flush();
	}
}
