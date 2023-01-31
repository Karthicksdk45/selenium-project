package Selenium.SeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Selenium.ReusableMethods.AbstractComp;

public class ConfirmationPage extends AbstractComp
{
	WebDriver driver;
	public ConfirmationPage(WebDriver driver)
	{
		super(driver);
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	//String id = driver.findElement(By.cssSelector("td label[class='ng-star-inserted']")).getText();
	
	@FindBy(css="td label[class='ng-star-inserted']")
	WebElement outputMessage;
	
	public String getOutput()
	{
		String id = outputMessage.getText();
		
		String[] orderId = id.split(" ");
		
		return orderId[1];
	}
}
