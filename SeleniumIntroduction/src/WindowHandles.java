import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Free Access to InterviewQues")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> iterate = windows.iterator();
		
		String parent = iterate.next();
		
		String child = iterate.next();
		
		driver.switchTo().window(child);
		
		String id = driver.findElement(By.linkText("mentor@rahulshettyacademy.com")).getText();
		
		System.out.println(id);
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.cssSelector("#username")).sendKeys(id);
	}
}
