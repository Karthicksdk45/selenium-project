import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks 
{
	public static void main(String[] args) throws Throwable, IOException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//String link = driver.findElement(By.xpath("//a[text()='REST API']")).getAttribute("href");
		
		/*HttpURLConnection conn =(HttpURLConnection) new URL(link).openConnection();
		
		HttpURLConnection conn =(HttpURLConnection) new URL(link).openConnection();
		
		conn.setRequestMethod("HEAD");
		
		conn.connect();
		
		int statusCode = conn.getResponseCode();
		
		System.out.println(statusCode);*/
		
		//Check whether any of the broken link is present in the footer
		
		List<WebElement> anc = driver.findElements(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style'] //a"));
		
		int count=0;
		
		SoftAssert as = new SoftAssert();
		
		for(WebElement linkText : anc)
		{
			String url = linkText.getAttribute("href");
			
			HttpURLConnection conn =(HttpURLConnection) new URL(url).openConnection();
			
			//conn.setRequestMethod("HEAD");
			
			conn.connect();
			
			int statusCode = conn.getResponseCode();
			
			System.out.println(statusCode);
			
			if(statusCode>=300)
			{
				System.out.println("Invalid or broken link is : "+linkText.getText()+", Status code of this link is : "+statusCode);
				System.out.println("Error message displayed is : "+conn.getResponseMessage());
				as.assertTrue(false);
			}
			
			count++;
		}
		System.out.println("Total number of links present in footer are : "+count);
	}
}
