import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class FlightBooking 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		String currency = "AED";
		//selectCurrency(driver,currency);
		String passengerType = "INFANT";
		int totalPersons = 4;
		passengers(driver,passengerType,totalPersons);
	}

	public static void selectCurrency(WebDriver driver,String currency)
	{
		WebElement sel = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		
		Select s = new Select(sel);
		List<WebElement> lists = s.getOptions();
		for(WebElement list : lists)
		{
			if(list.getText().equalsIgnoreCase(currency))
			{
				list.click();
				System.out.println(list.getText());
			}
		}
	}
	
	public static void passengers(WebDriver driver, String people, int totalPersons)
	{
		String val = driver.findElement(By.id("divpaxOptions")).getAttribute("style");
		String[] arr = val.split(" ");
		String check = arr[1].replace(";", "");
		if(check.equalsIgnoreCase("none"))
		{
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println("Opening block to select passengers");
		}
		List<WebElement> passengers1 = driver.findElements(By.xpath("//div[@class='row1 adult-infant-child']/div //label[@class='guestlbl']"));
		
		for(WebElement passenger : passengers1)
		{
			if(passenger.getText().equalsIgnoreCase(people))
			{
				System.out.println("Im in");
				for(int i=0;i<totalPersons;i++)
				{
					passenger.findElement(By.xpath("../.. //span[text()='+']")).click();
				}
			}
		}
	}
}
