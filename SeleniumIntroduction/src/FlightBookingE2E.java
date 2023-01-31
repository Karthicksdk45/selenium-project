import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightBookingE2E 
{
	public static void main(String[] args)
	{	
		ChromeOptions opt = new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		
		List<WebElement> drops = driver.findElements(By.cssSelector(".ui-corner-all a"));
		
		for(WebElement drop : drops)
		{
			if(drop.getText().equals("India"))
			{
				drop.click();
			}
		}
		
		List<WebElement> typeOfTrip = driver.findElements(By.cssSelector("#travelOptions label"));
		
		for(WebElement trip : typeOfTrip)
		{
			if(trip.getText().equals("One Way"))
			{
				trip.click();
			}
		}
		
		driver.findElement(By.cssSelector("input[id*='originStation1_CTXT']")).click();
		
		driver.findElement(By.cssSelector("a[value='IXG']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		WebElement desPopup = driver.findElement(By.cssSelector("#glsctl00_mainContent_ddl_destinationStation1_CTNR"));
		
		wait.until(ExpectedConditions.visibilityOf(desPopup));
		
		driver.findElement(By.cssSelector("a[value='DEL']")).click();
		
		
	}
}
