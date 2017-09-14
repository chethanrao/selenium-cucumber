package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import env.TestBase;


public class BookFlightPage implements TestBase{
	
	By byFristNamePassenger=By.name("passFirst0");

	By byLastNamePassenger=By.name("passLast0");

	By byPassengerMealPreference=By.name("pass.0.meal");

	By byCardType=By.name("creditCard");

	By byCreditCardNumber=By.name("creditnumber");
	
	By byCreditCardExpirationMonth=By.name("cc_exp_dt_mn");

	By byCreditCardExpirationYear=By.name("cc_exp_dt_yr");
	
	By byCreditCardFirstName=By.name("cc_frst_name");
	
	By byCreditCardMiddleName=By.name("cc_mid_name");
	
	By byCreditCardLastName=By.name("cc_last_name");
	
	By byTicketLessCheckBox=By.name("ticketLess");
	
	By byBillAddress1=By.name("billAddress1");
	
	By byBillAddress2=By.name("billAddress2");
	
	By byBillCity=By.name("billCity");
	
	By byBillState=By.name("billState");

	By byBillZip=By.name("billZip");
	
	By byBillCountry=By.name("delCountry");
	
	By bySameAsBillingAddressCheckBox=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input");
	
	By byBuyFlights=By.name("buyFlights");
	
	public void setFirstNamePassenger(String firstName){
		driver.findElement(byFristNamePassenger).sendKeys(firstName);
	}
	
	public void setLastNamePassenger(String lastName){
		driver.findElement(byLastNamePassenger).sendKeys(lastName);

	}
	
	public void selectPassengerMealPreference(String mealPreference){
		
		Select select=new Select(driver.findElement(byPassengerMealPreference));
		select.selectByVisibleText(mealPreference);
		
	}
	
	public void selectCardType(String creditCardtype){
		Select select=new Select(driver.findElement(byCardType));
		select.selectByVisibleText(creditCardtype);
		
	}
	
	public void setCreditCardNumber(String creditCardNumber){
		
		driver.findElement(byCreditCardNumber).sendKeys(creditCardNumber);

	}
	
	public void selectCardExpirationMonth(String expirationMonth){
		Select select=new Select(driver.findElement(byCreditCardExpirationMonth));
		select.selectByVisibleText(expirationMonth);
	}
	
	public void selectCardExpirationYear(String expirationYear){
		Select select=new Select(driver.findElement(byCreditCardExpirationYear));
		select.selectByValue(expirationYear);
	}
	
	public void creditCardFirstName(String creditCardFirstName){
		driver.findElement(byCreditCardFirstName).sendKeys(creditCardFirstName);
	}
	
	public void middleNameOnCdreditCard(String creditCardMiddleName){
		driver.findElement(byCreditCardMiddleName).sendKeys(creditCardMiddleName);

	}
	
	public void lastNameOnCdreditCard(String creditCardLastName){
		driver.findElement(byCreditCardLastName).sendKeys(creditCardLastName);

	}
	
	public void clickTicketlessTravelCheckBox(){
		driver.findElement(byTicketLessCheckBox).click();
	}
	
	public void billingAddressFirstLine(String address1){
		
		driver.findElement(byBillAddress1).sendKeys(address1);


	}
	
	public void billingAddressSecondLine(String address2){
		driver.findElement(byBillAddress2).sendKeys(address2);

	}
	
	public void typeBillingAddressCity(String addCity){
		
		driver.findElement(byBillCity).sendKeys(addCity);

		
	}
	
	public void setBillState(String billState){
		driver.findElement(byBillState).sendKeys(billState);
	}
	
	public void setBillPostCode(String inputPostcode){
		
		driver.findElement(byBillZip).sendKeys(inputPostcode);
	}
	
	public void selectBillCountry(String country){
		Select select=new Select(driver.findElement(byBillCountry));
		select.selectByVisibleText(country);
		
	}
	
	public void clickCheckBoxForSameBillingAddress(){
		driver.findElement(bySameAsBillingAddressCheckBox).click();
		
	}
	public void  clickSecurePurchaseButton(){
		driver.findElement(byBuyFlights).click();
	}
	
}
