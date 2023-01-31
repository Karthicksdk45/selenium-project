package commonUsage;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractMethods
{
	public WebDriver driver;

	public AbstractMethods(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void waitUntilElementIsVisible(WebElement productTab)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(productTab));
	}
	
	public void waitUntilElementIsInVisible(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
}
