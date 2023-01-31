import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SignIn 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		String name = "rahul";
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("div span:nth-child(2) input")).click();
		driver.findElement(By.cssSelector(".signInBtn")).click();
		Thread.sleep(1000);
		String msg = driver.findElement(By.tagName("p")).getText();
		System.out.println(msg);
		//Apply assertions using the TestNG frameworks to validate the response message
		Assert.assertEquals(msg,"You are successfully logged in.");
		String user = driver.findElement(By.cssSelector("h2")).getText();
		System.out.println(user);
		Assert.assertEquals(user, "Hello "+name+",");
		//Click on log out button using the x path with the visible text
		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		driver.close();
	}

}
