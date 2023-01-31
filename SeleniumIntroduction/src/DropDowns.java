import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		System.out.println("Hi");
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select select = new Select(staticDropdown);
		select.selectByIndex(2);
	
		List<WebElement> lst = select.getOptions();
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i).getText());
			lst.get(i).getLocation().getX();
		}
		
		//Perform actions on the passengers
		/*
		driver.findElement(By.xpath("//label[contains(text(),'PASSENGERS')]/parent::div/div[2]")).click();
		Thread.sleep(1000);
		//Find the webelments present in the passengers
		int i=1;
		
		for(;i<4;i++)
		{
			driver.findElement(By.xpath("(//label[contains(text(),'Adult')])[2]/../../div[2]/span[3]")).click();
		}
		driver.findElement(By.xpath("//label[contains(text(),'PASSENGERS')]/parent::div/div[2]")).click();
		
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'PASSENGERS')]/parent::div/div[2]")).getText());
		*/
		//Dynamic dropdowns
		/*
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		*/
		
		//Auto suggestive drop downs
		/*String ind = "India";
		driver.findElement(By.id("autosuggest")).sendKeys("IND");
		Thread.sleep(2000);
		List<WebElement> lst = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(int i=0;i<lst.size();i++)
		{
			if(lst.get(i).getText().equals(ind))
			{
				lst.get(i).click();
			}
		}
		*/
		
		//Check boxes
		/*List<WebElement> checkbxs = driver.findElements(By.xpath("//input[@type='checkbox']/following-sibling :: label"));
		String val = "Senior Citizen";
		for(WebElement checkbx : checkbxs)
		{
			System.out.println(checkbx.getText());
			//One method
			if(checkbx.getText().equals(val))
			{
				checkbx.findElement(By.xpath("//label[text()=' "+val+"']/../input")).click();
			}
			//Second method
			if(checkbx.getText().equals(val))
			{
				checkbx.findElement(By.xpath("../input")).click();
			}
		}*/
		/*Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());*/
		
		//Radio button
		/*String button = "One Way";
		List<WebElement> radio = driver.findElements(By.xpath("//label[text()='One Way']/../../td/label"));
		for(WebElement rad : radio)
		{
			if(rad.getText().equalsIgnoreCase(button))
			{
				rad.findElement(By.xpath("parent::td/input")).click();
			}
		}*/
		
		//Handling calendar
		
		
	}
}
