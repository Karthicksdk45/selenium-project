import java.time.Duration;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Milliyarns
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://devapp.milliyarns.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		
		js.executeScript("document.getElementById('mui-1').value='charan@emproto.com'");
		
		//driver.findElement(By.cssSelector("#mui-1")).sendKeys("charan@emproto.com");
		
		//driver.findElement(By.cssSelector("#mui-2")).sendKeys("&&b.51kI1F3$");
		
		js.executeScript("document.getElementById('mui-2').value='&&b.51kI1F3$'");
		
		//driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		js.executeScript("document.querySelector(\"button[class*='MuiButtonBase-root login-button css-1hw9j7s']\").click()");
		
		//driver.findElement(By.cssSelector("#mui-6")).sendKeys("abcd");
		
		//driver.findElement(By.xpath("//*[@id='mui-6']/parent::div/div[2]/img")).click();
		
		//driver.findElement(By.cssSelector(".fs-regular-20.welocome-reset-text")).getText();
		
		
		
		//js.executeScript("document.getElementById('mui-6').value='hello'");
		
	}
}
