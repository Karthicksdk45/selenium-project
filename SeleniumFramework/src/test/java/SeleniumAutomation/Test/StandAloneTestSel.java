package SeleniumAutomation.Test;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Selenium.ReusableMethods.AbstractComp;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StandAloneTestSel
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("Karthicksdk45@gmail.com");		
		driver.findElement(By.cssSelector("#userPassword")).sendKeys("Karthick@45");
		driver.findElement(By.cssSelector("#login")).click();
		
		//itemsAvailable(driver);
		/*MY CODE
		 * List<WebElement> listOfProducts = driver.findElements(By.xpath("//section[@id='products'] //b"));
		 * System.out.println("Products currently available are : ");
		 *  for(WebElement productAvailable : listOfProducts)
			{
				System.out.println(productAvailable.getText());
			}
			listOfProducts.stream().map(s->s.getText()).forEach(s->System.out.println(s));
		 */
		String item = "ADIDAS ORIGINAL";
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		
		List<WebElement> lst = driver.findElements(By.cssSelector(".mb-3"));
		
		lst.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals(item))
		.map(s->s.findElement(By.cssSelector(".btn.w-10.rounded"))).forEach(s->s.click());
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
				
		WebElement cart = driver.findElement(By.cssSelector("button[routerlink='/dashboard/cart']"));
		cart.click();
		
		//Check whether the item is present in the cart page
		List<WebElement> selItems = driver.findElements(By.cssSelector(".cartWrap h3"));
		
		Boolean val = selItems.stream().anyMatch(itemCart->itemCart.getText().equals(item));
		
		Assert.assertTrue(val);
		
		driver.findElement(By.cssSelector(".totalRow button")).click();

		
		driver.findElement(By.cssSelector("input[placeholder*='Country']")).sendKeys("ind");
		
		//Handle the auto suggest drop downs
		List<WebElement> autoSug = driver.findElements(By.cssSelector(".ta-results.list-group.ng-star-inserted  span"));
		
		autoSug.stream().forEach(s->System.out.println(s.getText()));
		
		List<WebElement> country = autoSug.stream().filter(s->s.getText().equals("India")).collect(Collectors.toList());
		
		country.get(0).click();
		
		//Click on the place order
		
		driver.findElement(By.linkText("PLACE ORDER")).click();
		
		//Get the ID from the confirmation page
		
		String id = driver.findElement(By.cssSelector("td label[class='ng-star-inserted']")).getText();
		
		String[] orderId = id.split(" ");
		
		System.out.println(orderId[1]);
	}
}
