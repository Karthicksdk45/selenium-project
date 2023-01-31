package pageContainer;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonUsage.AbstractMethods;

public class GreenKartHomePage extends AbstractMethods
{
	public WebDriver driver;
	
	public GreenKartHomePage(WebDriver driver)
	{
		super(driver);
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void baseUrl()
	{
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	
	@FindBy(css=".brand.greenLogo")
	WebElement logo;
	
	public String getLogo()
	{
		return logo.getText();
	}
	
	@FindBy(css="input[type='search']")
	WebElement searchBox;
	
	@FindBy(xpath="//div[@class=\"products\"] //div[@class=\"product\"]")
	WebElement productTab;
	
	public void searchBox(String data)
	{
		searchBox.sendKeys(data);
	}
	
	@FindBy(css="button[type='submit']")
	WebElement searchBar;
	
	public void searchButton(String data)
	{
		searchBox(data);
		waitUntilElementIsVisible(productTab);
		searchBar.submit();
	}
	
	@FindBy(xpath="//td[text()='Items']/.. //strong")
	WebElement totalitemsInCart;
	
	public String totalitemsInCart()
	{
		return totalitemsInCart.getText();
	}
	
	@FindBy(xpath="//td[text()='Price']/.. //strong")
	WebElement totalProductPrice;
	
	public String totalProductPrice()
	{
		return totalProductPrice.getText();
	}
	
	@FindBy(xpath="//div[@class=\"products\"] //div[@class=\"product\"]/h4")
	List<WebElement> totalProductDisplaying;
	
	public List<String> totalProductDisplaying()
	{
		List<String> prods = totalProductDisplaying.stream().map(s->s.getText()).collect(Collectors.toList());
		
		totalProductDisplaying.stream().map(s->s.getText()).forEach(s->System.out.println(s));
		
		return prods;
	}
}
