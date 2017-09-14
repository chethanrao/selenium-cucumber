package pages;




import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import env.TestBase;



public class FlightFinderPage implements TestBase{

	
	By byRoundTrip=By.xpath("//input[@name='tripType' and @value='roundtrip']");
	
	By byOneWay=By.xpath("//input[@name='tripType' and @value='oneway']");

	By byPassengerCount=By.name("passCount");
	
	By byDepartingFrom=By.name("fromPort");
	
	By byDepartingMonth=By.name("fromMonth");
	
	By byDepartingDay=By.name("fromDay");
	
	By byArrivalPlace=By.name("toPort");
	
	By byReturningMonth=By.name("toMonth");

	By byReturningDay=By.name("toDay");
	
	By byEconomicClass=By.xpath("//input[@name='servClass' and @value='Coach']");
	
	By byBusinessClass=By.xpath("//input[@name='servClass' and @value='Business']");

	By byFirstClass=By.xpath("//input[@name='servClass' and @value='First']");
	
	By byContinueButton=By.name("findFlights");

	By bySelectAirline=By.name("airline");

	
	
	public void selectFlightType(String flightType){
		
		if (flightType.equalsIgnoreCase("round trip"))
			driver.findElement(byRoundTrip).click();
		else if (flightType.equalsIgnoreCase("one way"))
			driver.findElement(byOneWay).click();

		
	}
	
	public void selectPassengers(String numberOfPassengers){
		
		Select select=new Select(driver.findElement(byPassengerCount));
		
		select.selectByVisibleText(numberOfPassengers);
		
	}
	
	public void selectDepartingFrom(String departFrom){
		Select select=new Select(driver.findElement(byDepartingFrom));

		select.selectByVisibleText(departFrom);	
		
	}
	
	public void selectDepartureMonth(String departureMonth){
		
		Select select=new Select(driver.findElement(byDepartingMonth));
		
		select.selectByVisibleText(departureMonth);	

	}

	public void selectDepartureDay(String departureDay){
		
		Select select=new Select(driver.findElement(byDepartingDay));
		
		select.selectByVisibleText(departureDay);	
	
	}
	
	public void selectArrivingPlace(String arrivalPlace){
		Select select=new Select(driver.findElement(byArrivalPlace));
		select.selectByVisibleText(arrivalPlace);
	}
	
	public void selectReturningMonth(String inputReturnMonth){
		Select select=new Select(driver.findElement(byReturningMonth));
		select.selectByVisibleText(inputReturnMonth);

	}
	
	public void selectReturningDay(String inputReturnDay){
		
		Select select=new Select(driver.findElement(byReturningDay));

		select.selectByVisibleText(inputReturnDay);
	}
	
	public void selectServiceClass(String serviceClass){
		if (serviceClass.equalsIgnoreCase("Economy Class"))
			driver.findElement(byEconomicClass).click();			
		else if (serviceClass.equalsIgnoreCase("Business Class"))
			driver.findElement(byBusinessClass).click();			
		else
			driver.findElement(byFirstClass).click();			

		
	}
	
	public void selectAirline(String inputAirline){
		Select select=new Select(driver.findElement(bySelectAirline));
		
		select.selectByVisibleText(inputAirline);


	}
	
	public void clickOnContinueButton(){

		driver.findElement(byContinueButton).click();
	}
}
