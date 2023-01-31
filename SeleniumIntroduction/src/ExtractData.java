import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ExtractData {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		String name = "rahul";
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//Applying implicitly wait to avoid Element intercepted exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(1000);
		String pass = pwd(driver);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		driver.findElement(By.xpath("//form[@class='form']/input[2]")).sendKeys(pass);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(1000);
		String msg = driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(msg,"You are successfully logged in.");
		
	}
	public static String pwd(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.partialLinkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div button:nth-child(2)")).click();
		Thread.sleep(1000);
		String content = driver.findElement(By.cssSelector(".infoMsg")).getText();
		String[] split = content.split(" ");
		String s1 = split[4];
		String s2 = s1.replace("'", "");
		System.out.println(s2);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		return s2;
	}

}
