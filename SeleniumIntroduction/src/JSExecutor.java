import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor 
{
	public static void main(String[] args) throws MalformedURLException, IOException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		autoSuggestion(driver);
		
	}
	
	public static void scrollBy(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Point locate = driver.findElement(By.cssSelector(".tableFixHead")).getLocation();
		
		int x = locate.getX();
		
		int y = locate.getY();
		
		System.out.println("X axis : "+x+" and Y axis is : "+y);
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=500");
		
		List<WebElement> Amounts = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int count = 0;
		
		for(WebElement Amount : Amounts )
		{
			String convert = Amount.getText();
			
			int num = Integer.parseInt(convert);
			
			count = count+num;
		}
		System.out.println("Total Count is : "+count);
	}
	
	public static void autoSuggestion(WebDriver driver) throws MalformedURLException, IOException
	{
		String country = "Arge";
		
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys(country);
		
		List<WebElement> lst = driver.findElements(By.xpath("//ul[@id='ui-id-1'] //div"));
		
		for(WebElement list : lst)
		{
			//System.out.println(list.getText());
			if(list.getText().startsWith(country))
			{
				list.click();
				System.out.println(driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).getAttribute("value"));
				
				/*JavascriptExecutor js = (JavascriptExecutor)driver;
				
				js.executeScript("document.querySelector(".inputs.ui-autocomplete-input").value");*/
			}
		}
	}
}
