package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import env.TestBase;



public class ItineraryPage implements TestBase{
	
	
	By itinarary=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img");;
	
	
	public void isItinarayDisplayed(){
		
		driver.findElement(itinarary).isDisplayed();
		       
	}
}
