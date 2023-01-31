package JavaWorkings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().fullscreen();
		
		driver.get("https://katalon.com/resources-center/blog/web-api-testing-interview-questions");
		
		WebElement Katbut = driver.findElement(By.linkText("Activate Katalon Platform Free Trial"));
		
		//Actions act = new Actions(driver);
		
		//act.moveToElement(Katbut).build().perform();
		
		int x = Katbut.getLocation().getX();
		
		int y = Katbut.getLocation().getY();
		
		System.out.println(y);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,"+y+")");
		
		//Katbut.click();
		
		//System.out.println(driver.getWindowHandles().size());
		
		//WebElement txt = driver.findElement(By.cssSelector(".form_title"));
		
		//System.out.println(txt.getText());
	}
}
