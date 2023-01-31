import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;


public class E2Eexec 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		String[] itemsSelect = {"Cauliflower","Potato","Beans","Strawberry"};
		/*for(WebElement product : products)
		{
			String veg = product.getText();
			if(itemsNeeded.contains(veg))
			{
				System.out.println("hi");
				product.findElement(By.xpath(".. //button[@type='button']")).click();
			}
		}*/
		selectItems(driver,itemsSelect);
		applyCoupon(driver);
	}
	
	public static void selectItems(WebDriver driver,String[] items)
	{
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
		int val = 1;
		List<String> itemsNeeded = Arrays.asList(items);
		int count = itemsNeeded.size();
		for(int i=0;i<products.size();i++)
		{
			String veg = products.get(i).getText();
			String[] name = veg.split("-");
			String veggies = name[0].trim();
			if(itemsNeeded.contains(veggies))
			{
				products.get(i).findElement(By.xpath(".. //button[text()='ADD TO CART']")).click();
				System.out.println(products.get(i).getText());
				if(val==count)
				{
					System.out.println(val);
					break;
				}
				val++;
			}
		}
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	}
	
	public static void applyCoupon(WebDriver driver)
	{
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
	}

}
