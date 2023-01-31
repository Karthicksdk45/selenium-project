import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Invoking browsers using the driver classes for the respective browsers
		 * Chrome --->   ChromeDriver()
		 * Firefox ---> GeckhoDriver()
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emproto\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//To get the title of the page
		
		/*driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();*/
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		/*Finding the elements using general locators
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");*/
		
		//With help of CSS selectors
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("hello123");
		driver.findElement(By.cssSelector(".signInBtn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		//Using link text access the web element when we need to use link or partial link the element should be present in anchor tag
		//driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.partialLinkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Rahul01@gmail.com");
		//Clear the Email field using the xpath selector by finding the attribute and traversing
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		//Enter the Email field using the css selector by finding the attribute and traversing
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("sdk@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("6111521828");
		driver.findElement(By.cssSelector("div button:nth-child(2)")).click();
		//Get the validation message using css selector by parent to child traverse
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//Click on the go to login page
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.xpath("//form[@class='form']/input[2]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		//Finding and performing action by css selector
		driver.findElement(By.cssSelector("div span:nth-child(2) input")).click();
		//Click on the sign in button
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	}
}
