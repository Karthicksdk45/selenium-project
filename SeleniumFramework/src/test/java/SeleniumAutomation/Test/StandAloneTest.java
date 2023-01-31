package SeleniumAutomation.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Selenium.ReusableMethods.AbstractComp;
import Selenium.SeleniumAutomation.ConfirmationPage;
import Selenium.SeleniumAutomation.FindElements;
import Selenium.SeleniumAutomation.OrdersPage;
import Selenium.SeleniumAutomation.ProductCatalogue;
import Selenium.SeleniumAutomation.cartPage;
import Selenium.SeleniumAutomation.checkoutPage;
import SeleniumAutomation.TestComponents.BaseUrl;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StandAloneTest extends BaseUrl
{
	String OrderId;
	@Test(dataProvider="inputData",groups= {"purchase"})
	public void orderProduct(HashMap<String,String> input) throws IOException
	{	
		ProductCatalogue prod = pom.loginCredentials(input.get("email"), input.get("password"));
		String item = input.get("product");
		prod.addProductToCart(item);
		cartPage cart = prod.cartButton();
		Assert.assertTrue(cart.compareTo(item));
		checkoutPage checkout  = cart.checkout();
		checkout.findCountry("ind");
		ConfirmationPage finalPage = checkout.placeTheOrder();
		System.out.println(finalPage.getOutput());
		OrderId = finalPage.getOutput();
	}
	
	//@Test(dependsOnMethods = {"orderProduct"})
	/*
	 * public void checkOrdersList() { //This method will get activate once the
	 * order product method get executed ProductCatalogue prod =
	 * pom.loginCredentials("Karthicksdk45@gmail.com", "Karthick@45");
	 * 
	 * OrdersPage order = prod.ordersButton();
	 * 
	 * System.out.println(order.OrdersId()); Assert.assertEquals(order.OrdersId(),
	 * OrderId); }
	 */
	
	@DataProvider
	public Object[][] inputData()
	{
		//Using HashMap Whenever we want to go with key and value pairs we can use hashmap
		
		HashMap<String,String> mapData = new HashMap<String,String>();
		
		mapData.put("email", "Karthicksdk45@gmail.com");
		mapData.put("password", "Karthick@45");
		mapData.put("product", "ADIDAS ORIGINAL");
		
		HashMap<String,String> mapData1 = new HashMap<String,String>();
		
		mapData1.put("email", "anshika@gmail.com");
		mapData1.put("password", "Iamking@000");
		mapData1.put("product", "IPHONE 13 PRO");
		
		return new Object[][] {{mapData},{mapData1}};
	}
}
