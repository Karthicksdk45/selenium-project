import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GreenKartStreams 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.findElement(By.linkText("Top Deals")).click();
		
		Set<String> win = driver.getWindowHandles();
		
		Iterator<String> wins = win.iterator();
		
		while(wins.hasNext())
		{
			driver.switchTo().window(wins.next());
			System.out.println(driver.getCurrentUrl());
		}
		
		driver.findElement(By.cssSelector("th[aria-label='Veg/fruit name: activate to sort column ascending']")).click();
		
		//Click on the link
		//Get the list
		List<WebElement> veg = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
//		List<String> allList = veg.stream().map(s->s.getText()).collect(Collectors.toList());
//	
//		//Sort it using streams
//		List<String> sortedList = allList.stream().sorted().collect(Collectors.toList());
//		//Compare both
//		System.out.println("Before Sorthing :");
//		allList.stream().forEach(s->System.out.println(s));
//		
//		System.out.println("After Sorthing :");
//		sortedList.stream().forEach(s->System.out.println(s));
//		
//		Assert.assertEquals(allList, sortedList);
		
		List<String> price;
		
		do
		{
			List<WebElement> veg1 = driver.findElements(By.xpath("//tbody/tr/td[1]"));
			price = veg1.stream().filter(s->s.getText().contains("Carrot")).
			map(s->getVegPrice(s)).collect(Collectors.toList());
			
			if(price.size()<1)
			{
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		}
		while(price.size()<1);
		
		System.out.println(price);
	}
	
	public static String getVegPrice(WebElement veg)
	{	
		return veg.findElement(By.xpath("following-sibling::td[1]")).getText();
	}
}
