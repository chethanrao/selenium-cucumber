package env;



import org.openqa.selenium.WebDriver;

public interface TestBase 
{
	public static WebDriver driver = Env.CreateWebDriver(Env.getBrowserName());
	
}
