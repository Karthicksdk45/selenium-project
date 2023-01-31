import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentQaClick
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://qaclickacademy.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.manage().window().maximize();
		
		//Click on the element to traverse
		
		driver.findElement(By.linkText("PRACTICE")).click();
		
		//Find the WebTable
		List<WebElement> noOfRows = driver.findElements(By.xpath("//table[@name='courses'] //tr"));
		
		//Find the rows in the webtable
		System.out.println(noOfRows.size());
		
		List<WebElement> noOfColumns = driver.findElements(By.xpath("//table[@name='courses'] //th"));
		////Find the columns in the webtable
		System.out.println(noOfColumns.size());
		
		String data = driver.findElement(By.xpath("//table[@name='courses'] //tr[3]")).getText();
		
		System.out.println(data);
	}
}
