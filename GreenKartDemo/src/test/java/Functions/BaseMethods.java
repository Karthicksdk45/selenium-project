package Functions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageContainer.GreenKartHomePage;

public class BaseMethods
{
	public WebDriver driver;
	
	public GreenKartHomePage homePage;
	
	public WebDriver initDriver() throws IOException
	{
		Properties prop = new Properties();
		
		FileInputStream stream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\DataFiles\\Browser.properties");
		
		prop.load(stream);
		
		String opt = prop.getProperty("browser");
		
		if(opt.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
		}
		else if(opt.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		return driver;
	}
	
	public GreenKartHomePage LaunchApp() throws IOException
	{
		driver = initDriver();
		
		homePage = new GreenKartHomePage(driver);
		
		homePage.baseUrl();
		
		return homePage;
	}
}
