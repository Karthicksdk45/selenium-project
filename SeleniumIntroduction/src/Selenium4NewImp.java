import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4NewImp
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		String parent = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://rahulshettyacademy.com/");
		
		String nameOfCourse = driver.findElement(By.xpath("(//a[contains(@href,'learn-postman-for-api-automation-testing')])[2]")).getText();
		
		System.out.println(nameOfCourse);
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input")).sendKeys(nameOfCourse);
		
		/*
		 * Implementations of new relative locators methods
		 * To find the webElement with help of above,below, rightOf and leftOf
		 */
		//WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));
		
		//System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		//Capture the height and width of the textfield
		
		WebElement textField = driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input"));
		
		int height = textField.getRect().getDimension().getHeight();
		
		int width = textField.getRect().getDimension().getWidth();
		
		System.out.println("Height of the text field is : "+height+" and the width of the table is : "+width);
		
		//Capture Webelement screenshot
		
		File src = textField.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyToDirectory(src, new File("C://Users//Emproto//OneDrive//Desktop//Screenshots//TextField.png"));
	}
}
