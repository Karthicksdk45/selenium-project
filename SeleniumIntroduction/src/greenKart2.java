import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class greenKart2
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.findElement(By.linkText("Top Deals")).click();
		
		Set<String> wins = driver.getWindowHandles();
		
		System.out.println(wins.size());
		
		Iterator<String> it = wins.iterator();
		
		String parent = it.next();
		
		String child = it.next();
		driver.switchTo().window(child);

		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("tom");
	}
}
