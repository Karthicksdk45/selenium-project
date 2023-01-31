package SeleniumAutomation.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import SeleniumAutomation.TestComponents.BaseUrl;
public class ErrorValidation extends BaseUrl
{
	@Test
	public void errorVal() throws IOException, InterruptedException
	{
		pom.loginCredentials("Karthicksdk45@gmail.com", "Karthick@5");
		Assert.assertEquals("Incorrect email or password.", pom.getErrorMessage());
	}
}
