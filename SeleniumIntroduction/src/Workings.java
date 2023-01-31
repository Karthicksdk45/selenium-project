import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Workings 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		/*To count the number of links present in the Web Page
		//System.out.println(driver.findElements(By.tagName("a")).size());;
		
		//To count the number of links in the footer content
		System.out.println(driver.findElements(By.xpath("//div[@id='gf-BIG'] //a")).size());
		
		//To count the number of links in the footer specific area
		System.out.println(driver.findElements(By.xpath("//a[text()='Discount Coupons']/../../.. //a")).size());
		*/
		
		//Click on the links in the specific area
		driver.findElement(By.xpath("//a[text()='Discount Coupons']/../../.."));
		
		List<WebElement> links1footer = driver.findElements(By.xpath("//a[text()='Discount Coupons']/../../.. //a"));
		
		for(int i=1;i<links1footer.size();i++)
		{
			/*System.out.println(links1footer.get(i).getText());
			links1footer.get(i).findElement(By.xpath("//li/a")).click();
			driver.navigate().back();*/
			
			String actions = Keys.chord(Keys.CONTROL,Keys.ENTER);
			links1footer.get(i).sendKeys(actions);
		}
		System.out.println(driver.getWindowHandles().size());
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterable = windows.iterator();
		//String parent = iterable.next();
		
		for(int i=0;i<windows.size();i++)
		{
			if(iterable.hasNext())
			{
			driver.switchTo().window(iterable.next());
			System.out.println(driver.getTitle());
			}
		}
	}
	
}
