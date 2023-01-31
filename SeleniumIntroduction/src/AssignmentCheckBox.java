import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssignmentCheckBox {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement sel = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		//Check and uncheck the checkboxes and validate it
		sel.click();
		Assert.assertTrue(sel.isSelected());
		sel.click();
		Assert.assertFalse(sel.isSelected());
		
		//Find the number of checkboxes
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}
