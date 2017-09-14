package pages;

import java.util.Properties;

import org.openqa.selenium.By;

import env.TestBase;
import env.Props;


public class HomePage implements TestBase{
	
	String url=null;
	
	Props props=null;
	
	By byRegister=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a");

	By byItinerary=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a");

	By bySignOnRegister=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]");
	
	By bySignOn=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a");
	
	public void navigateToBase(){
		
		
		url=getNavigationUrl();
		
		driver.navigate().to(url);
		
	}
	
	
	
	public void clickOnRegister(){
		
		driver.findElement(byRegister).click();
	}

	public void clickOnItinerary(){
		
		driver.findElement(byItinerary).click();
	}

	
	public void clickOnSignOn(){
		
		driver.findElement(bySignOn).click();
	}
	
	public void clickOnSignOnRegister(){
		
		driver.findElement(bySignOnRegister).click();
	}
	
	public String getNavigationUrl(){
		
		props=new Props();
		
		Properties property=props.getPropertiesFromFile("test.properties");
		
		return property.getProperty("url");

	}
	
	
}