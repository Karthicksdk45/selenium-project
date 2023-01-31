package Selenium.SeleniumAutomation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Selenium.ReusableMethods.AbstractComp;

public class FindElements extends AbstractComp
{
	public WebDriver driver;
	
	public FindElements(WebDriver driver)
	{
		super(driver);
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	//driver.findElement(By.cssSelector("#userEmail")).sendKeys("Karthicksdk45@gmail.com");
	@FindBy(id="userEmail")
	WebElement id;
	
	//driver.findElement(By.cssSelector("#userPassword")).sendKeys("Karthick@45");
	@FindBy(id="userPassword")
	WebElement password;
	
	//driver.findElement(By.cssSelector("#login")).click();
	@FindBy(id="login")
	WebElement loginButton;
	
	//List<WebElement> lst = driver.findElements(By.cssSelector(".mb-3"));
	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	@FindBy(css="div[class*='flyInOut']")
	WebElement errorMessage;
	
	public void baseUrl()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	public ProductCatalogue loginCredentials(String ID, String PASSWORD)
	{
		//Get the ID
		id.sendKeys(ID);
		
		//Get the Password
		password.sendKeys(PASSWORD);
		
		//Click on the button
		loginButton.click();
		
		ProductCatalogue prod = new ProductCatalogue(driver);
		
		return prod;
	}
	
	public String getErrorMessage()
	{
		waitUntilWebelementVisible(errorMessage);
		return errorMessage.getText();
	}
}
