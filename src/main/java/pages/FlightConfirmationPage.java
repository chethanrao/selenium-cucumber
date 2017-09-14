package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import env.TestBase;



public class FlightConfirmationPage implements TestBase{
	
	
	By flightConfirmationPage=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]");;
	
	
	public void isFlightConfirmationMessageDisplayed(){
		
		String text=driver.findElement(flightConfirmationPage).getText();
		
		System.out.println("text message:"+text);
		
		Assert.assertTrue(text.contains("itinerary has been booked!"));
		       
	}
}
