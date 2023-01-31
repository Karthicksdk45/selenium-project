import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItDemo {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://smallpdf.com/pdf-to-word");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("span[class*='jltaIN']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\Emproto\\OneDrive\\Desktop\\AutoIT\\Fileupload.exe");
	}

}
