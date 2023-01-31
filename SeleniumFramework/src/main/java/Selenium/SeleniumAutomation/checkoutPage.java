package Selenium.SeleniumAutomation;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Selenium.ReusableMethods.AbstractComp;

public class checkoutPage extends AbstractComp
{
	WebDriver driver;
	
	public checkoutPage(WebDriver driver)
	{
		super(driver);
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	//driver.findElement(By.cssSelector("input[placeholder*='Country']")).sendKeys("ind");
	//List<WebElement> autoSug = driver.findElements(By.cssSelector(".ta-results.list-group.ng-star-inserted  span"));
	//List<WebElement> country = autoSug.stream().filter(s->s.getText().equals("India")).collect(Collectors.toList());
	//country.get(0).click();
	@FindBy(css="input[placeholder*='Country']")
	WebElement autoSug;
	
	@FindBy(css=".ta-results.list-group.ng-star-inserted  span")
	List<WebElement> countrySug;
	
	//driver.findElement(By.linkText("PLACE ORDER")).click();
	@FindBy(linkText="PLACE ORDER")
	WebElement place_order;
	
	public void sendKeys(String country)
	{
		autoSug.sendKeys(country);
	}
	
	public void findCountry(String country)
	{
		sendKeys(country);
		
		List<WebElement> countryName = countrySug.stream().filter(s->s.getText().equals("India")).collect(Collectors.toList());
		
		countryName.get(0).click();
	}
	
	public ConfirmationPage placeTheOrder()
	{
		place_order.click();
		
		ConfirmationPage finalPage = new ConfirmationPage(driver);
		
		return finalPage;
	}
}
