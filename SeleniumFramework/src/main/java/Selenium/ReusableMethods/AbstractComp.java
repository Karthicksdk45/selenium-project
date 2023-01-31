package Selenium.ReusableMethods;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Selenium.SeleniumAutomation.OrdersPage;
import Selenium.SeleniumAutomation.cartPage;

public class AbstractComp
{
	public WebDriver driver;

	@FindBy(css="button[routerlink='/dashboard/cart']")
	WebElement cart;
	
	@FindBy(css="button[routerlink*='myorders']")
	WebElement orders;
	
	public AbstractComp(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	public void waitUntilVisible(By findElement)
	{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(findElement));
	}
	
	public void waitUntilWebelementVisible(WebElement findElement)
	{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(findElement));
	}
	
	public void waitUntilinVisible(By findElement)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(findElement));	
	}
	
	public cartPage cartButton()
	{
		waitUntilVisible(By.cssSelector("#toast-container"));
		
		waitUntilinVisible(By.cssSelector(".ng-animating"));
		
		cart.click();
		
		cartPage cart = new cartPage(driver);
		
		return cart;
	}
	
	public OrdersPage ordersButton()
	{
		//waitUntilVisible(By.cssSelector("#toast-container"));
		
		//waitUntilinVisible(By.cssSelector(".ng-animating"));
		
		orders.click();
		
		OrdersPage order = new OrdersPage(driver);
		
		return order;
	}
}
