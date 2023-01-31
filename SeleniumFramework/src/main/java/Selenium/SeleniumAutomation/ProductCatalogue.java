package Selenium.SeleniumAutomation;

import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Selenium.ReusableMethods.AbstractComp;

public class ProductCatalogue extends AbstractComp
{
	WebDriver driver;
	
	//List<WebElement> lst = driver.findElements(By.cssSelector(".mb-3"));
	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	//WebElement cart = driver.findElement(By.cssSelector("button[routerlink='/dashboard/cart']"));
//	cart.click();
//	@FindBy(css="button[routerlink='/dashboard/cart']")
//	WebElement cart;
	
	public ProductCatalogue(WebDriver driver)
	{
		//To send the element to the parent
		super(driver);
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	By searchTimeForProd = By.cssSelector(".mb-3");
	
	public List<WebElement> getProducts()
	{
		waitUntilVisible(searchTimeForProd);
		
		return products;
	}
	
	public WebElement filterByProduct(String item)
	{
		WebElement ele = getProducts().stream().filter(prod->prod.findElement(By.cssSelector("b")).getText().equals(item)).findFirst().orElse(null);
		
		return ele;
	}
	
	public void addProductToCart(String item)
	{
		filterByProduct(item).findElement(By.cssSelector(".btn.w-10.rounded")).click();
	}
	
}
