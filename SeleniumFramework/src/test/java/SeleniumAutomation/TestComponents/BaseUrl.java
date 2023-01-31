package SeleniumAutomation.TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Selenium.SeleniumAutomation.FindElements;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUrl
{
	public WebDriver driver;
	public FindElements pom;
	
	public WebDriver initDriver() throws IOException
	{
		//Properties class
		Properties fil = new Properties();
		
		FileInputStream stream = new FileInputStream("C:\\Users\\Emproto\\eclipse-workspace\\SeleniumFramework\\src\\main\\java\\Selenium\\Resources\\GlobalData.properties");
		
		fil.load(stream);
		
		//fil.getProperty("browser");
		
		String browser = System.getProperty("browser")!=null?System.getProperty("browser"):fil.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver();
			
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		return driver;
	}
	
	@BeforeMethod(alwaysRun=true)
	public FindElements launchApp() throws IOException
	{
		driver = initDriver();
		pom = new FindElements(driver);
		pom.baseUrl();
		return pom;
	}
	
	public String takeScreenShot(String testcase, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(System.getProperty("user.dir")+"//output//"+testcase+".png");
		FileUtils.copyFile(src, dst);
		return System.getProperty("user.dir")+"//output//"+testcase+".png";
	}
	
	@AfterMethod(alwaysRun=true)
	public void closeApp()
	{
		driver.close();
	}
}
