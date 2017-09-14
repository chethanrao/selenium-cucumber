package env;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Env 
{
	static WebDriver driver = null;
	static String browserName = null;
	
	static Props props=null;
	
	public static String getBrowserName()
	{
		props=new Props();
		
		Properties property=props.getPropertiesFromFile("test.properties");
		
		browserName = property.getProperty("browser"); 
		
	
		return browserName;
	}
	
	public static WebDriver CreateWebDriver(String browser)
	{

			switch (browser.toLowerCase()) {
			
			case "chrome":
				
				
				System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

				driver = new ChromeDriver();
				break;

			
			 default:
				 System.out.println("Invalid browser name "+browser);
				 System.exit(0);
					break;	
			}
			
			
			return driver;
        }
	}
