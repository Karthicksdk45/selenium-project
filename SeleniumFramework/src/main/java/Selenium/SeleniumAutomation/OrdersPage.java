package Selenium.SeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Selenium.ReusableMethods.AbstractComp;

public class OrdersPage extends AbstractComp
{
	public WebDriver driver;

	public OrdersPage(WebDriver driver) 
	{
		super(driver);
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//table[contains(@class,'table-hover')]/tbody //th")
	public WebElement oid;
	
	public String OrdersId()
	{
		return oid.getText();
	}
}
