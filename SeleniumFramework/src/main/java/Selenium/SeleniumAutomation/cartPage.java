package Selenium.SeleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Selenium.ReusableMethods.AbstractComp;
import dev.failsafe.internal.util.Assert;

public class cartPage extends AbstractComp
{
	WebDriver driver;
	public cartPage(WebDriver driver)
	{
		super(driver);
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	//List<WebElement> selItems = driver.findElements(By.cssSelector(".cartWrap h3"));
	@FindBy(css=".cartWrap h3")
	List<WebElement> addedProducts;
	
	//driver.findElement(By.cssSelector(".totalRow button")).click();
	@FindBy(css=".totalRow button")
	WebElement checkout;
	
	public List<WebElement> getListInCart()
	{
		return addedProducts;
	}
	//Boolean val = selItems.stream().anyMatch(itemCart->itemCart.getText().equals(item));
	
	public boolean compareTo(String item)
	{
		Boolean val = getListInCart().stream().anyMatch(itemCart->itemCart.getText().equals(item));
		
		return val;
	}
	
	public checkoutPage checkout()
	{
		checkout.click();
		
		checkoutPage checkout = new checkoutPage(driver);
		
		return checkout;
	}
	
}
