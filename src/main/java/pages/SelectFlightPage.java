package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import env.TestBase;


public class SelectFlightPage implements TestBase{

	By byOutFlight=By.name("outFlight");

	
	By byInFlight=By.name("inFlight");
	
	By continueButton=By.name("reserveFlights");

	

	
	public void selectDepartureFlight(String departureFlight){

		List<WebElement> list=driver.findElements(byOutFlight);
		
		if (departureFlight.equalsIgnoreCase("Unified Airlines 363")){
				list.get(3).click();
		}else if(departureFlight.equalsIgnoreCase("Pangaea Airlines 362")){
			     list.get(2).click();;
		}else if(departureFlight.equalsIgnoreCase("Blue Skies Airlines 361")){
		     	 list.get(1).click();;
		}else{
	     	     list.get(0).click();;
		}
	}
	
	public void selectReturnFlight(String returnFlight){
		List<WebElement> list=driver.findElements(byInFlight);
		
		if (returnFlight.equalsIgnoreCase("Unified Airlines 633")){
			list.get(3).click();
		}else if(returnFlight.equalsIgnoreCase("Pangea Airlines 632")){
			list.get(2).click();;
		}else if(returnFlight.equalsIgnoreCase("Blue Skies Airlines 631")){
			list.get(1).click();;
		}else{
			list.get(0).click();;
		}
	}
	
	public void clickContinueButton(){
		driver.findElement(continueButton).click();
	}
}
