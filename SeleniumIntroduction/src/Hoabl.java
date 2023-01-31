import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hoabl {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cms-app.stg.hoabl.in/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		//Find and enter the number
		driver.findElement(By.cssSelector("input[name='phoneNumber']")).sendKeys("123");
		
		//Get message : div[class*='MuiSnackbarContent-message css-1w0ym84']
		
		driver.findElement(By.cssSelector("button[class*='MuiButtonBase-root MuiButton-root']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class*='MuiSnackbarContent-message css-1w0ym84']")));
		
		String output = driver.findElement(By.cssSelector("div[class*='MuiSnackbarContent-message css-1w0ym84']")).getText();
		
		System.out.println(output);
	}
}
