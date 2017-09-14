package stepDefintions;

import pages.BookFlightPage;
import pages.FlightConfirmationPage;
import pages.FlightFinderPage;
import pages.HomePage;
import pages.SelectFlightPage;
import pages.SignOnPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BookFlightSteps{
	HomePage homePage=null;
	SignOnPage signOnPage=null;
	FlightFinderPage  flightFinderPage=null;
	SelectFlightPage selectFlightPage;
	BookFlightPage bookFlightPage;
	FlightConfirmationPage flightConfirmationPage;
	
	@When("^I click on sign on menu in home page$")
	public void clickSignOn(){
		homePage = new HomePage();
		homePage.clickOnSignOn();
	}
	
	@When("^In home page,I set my user name \"([^\"]*)\"$")
	public void setUserName(String username) {
		
		signOnPage=new SignOnPage();
		signOnPage.setUserName(username);
	}

	@When("^In home page,I set my Password \"([^\"]*)\"$")
	public void setPassword(String password) {
		signOnPage=new SignOnPage();
		signOnPage.setPassword(password);
	}

	@When("^In home page,I click sign in button$")
	public void clickSignIn()  {
		signOnPage=new SignOnPage();
		signOnPage.clickSignInSubmitButton();
	}

	@When("^I select travel type \"([^\"]*)\"$")
	public void selectTravelType(String selectTripTypeFromRadioButton){
		flightFinderPage=new FlightFinderPage();
		flightFinderPage.selectFlightType(selectTripTypeFromRadioButton);
	}

	@When("^I select \"([^\"]*)\" passenger$")
	public void selectPassenger(String numberOfPassengers){
		flightFinderPage=new FlightFinderPage();

		flightFinderPage.selectPassengers(numberOfPassengers);
	}

	@When("^I select departing from \"([^\"]*)\" dropdown$")
	public void selectFlightDepartingFrom(String departFrom){
		flightFinderPage=new FlightFinderPage();

		flightFinderPage.selectDepartingFrom(departFrom);
	}

	@When("^I select flight departure month \"([^\"]*)\"$")
	public void selectFlightDepartureMonth(String departureMonth) {
		flightFinderPage=new FlightFinderPage();

		flightFinderPage.selectDepartureMonth(departureMonth);
	}

	@When("^I select flight departure day \"([^\"]*)\"$")
	public void i_select_departure_day(String departureDay){
		flightFinderPage=new FlightFinderPage();

		flightFinderPage.selectDepartureDay(departureDay);
	}

	@When("^I select arriving flight arriving in \"([^\"]*)\"$")
	public void i_select_arriving_In(String arrivalCity) {
		flightFinderPage=new FlightFinderPage();

		flightFinderPage.selectArrivingPlace(arrivalCity);
	}

	@When("^I select return month \"([^\"]*)\"$")
	public void selectReturnM(String returnMonth) {
		flightFinderPage=new FlightFinderPage();

		flightFinderPage.selectReturningMonth(returnMonth);
	}
	
	@When("^I select return day \"([^\"]*)\"$")
	public void selectReturnDay(String inputReturnDay) {
		flightFinderPage=new FlightFinderPage();

		flightFinderPage.selectReturningDay(inputReturnDay);
	}

	@When("^I select service class \"([^\"]*)\"$")
	public void selectServiceClass(String inputServiceClass) {
		flightFinderPage=new FlightFinderPage();

		flightFinderPage.selectServiceClass(inputServiceClass);
	}

	@When("^I select airline \"([^\"]*)\"$")
	public void selectAirline(String inputAirline) {
		flightFinderPage=new FlightFinderPage();

		flightFinderPage.selectAirline(inputAirline);
		
	}

	@When("^I click continue button on flight finder page$")
	public void i_click_continue_button_on_flight_finder_page(){
		flightFinderPage=new FlightFinderPage();

	     flightFinderPage.clickOnContinueButton();
		
	}

	

	@When("^I select departing flight \"([^\"]*)\"$")
	public void selectFlightUnderDepart(String departureFlight){
		selectFlightPage=new SelectFlightPage();

		selectFlightPage.selectDepartureFlight(departureFlight);
		
	}

	@When("^I select arriving flight \"([^\"]*)\"$")
	public void selectArrivingFlight(String arrivingFlight){
		selectFlightPage=new SelectFlightPage();

		selectFlightPage.selectReturnFlight(arrivingFlight);
	}

	@When("^I click continue button on the select flight page$")
	public void i_click_continue_button_on_the_select_flight_page(){
		selectFlightPage=new SelectFlightPage();

		selectFlightPage.clickContinueButton();
	}

	

	@When("^In book flight page,I set first name\"([^\"]*)\"$")
	public void setFirstPassengerName(String firstName){
		bookFlightPage=new BookFlightPage();
		bookFlightPage.setFirstNamePassenger(firstName);
	}

	@When("^In book flight page,I set last name\"([^\"]*)\"$")
	public void setLastPassengerName(String lastName){
		bookFlightPage=new BookFlightPage();

		bookFlightPage.setLastNamePassenger(lastName);
	}

	@When("^In book flight page,I select meal \"([^\"]*)\"$")
	public void selectPassengerMealPreference(String passengerMealPreference){
		bookFlightPage.selectPassengerMealPreference(passengerMealPreference);
	}

	@When("^In book flight page,I select card type \"([^\"]*)\"$")
	public void selectCardType(String creditCardtype) {
		bookFlightPage=new BookFlightPage();

		bookFlightPage.selectCardType(creditCardtype); 
	}

	@When("^In book flight page,I set credit card number \"([^\"]*)\"$")
	public void setCreditCardNumber(String creditCardNum)  {
		bookFlightPage=new BookFlightPage();

		bookFlightPage.setCreditCardNumber(creditCardNum); 
	}

	@When("^In book flight page,I select the credit card expiration month \"([^\"]*)\"$")
	public void i_select_the_credit_card_expiration_month(String expMonth)  {
		bookFlightPage=new BookFlightPage();

		bookFlightPage.selectCardExpirationMonth(expMonth);
	}

	@When("^In book flight page,I select the credit card expiration year \"([^\"]*)\"$")
	public void i_select_the_credit_card_expiration_year(String expYear)  {
		bookFlightPage=new BookFlightPage();

		bookFlightPage.selectCardExpirationYear(expYear);
	}

	@When("^In book flight page,I set first name as it appear on credit card \"([^\"]*)\"$")
	public void i_set_first_name_as_it_appear_on_credit_card(String creditCardFName)  {
		bookFlightPage=new BookFlightPage();

		bookFlightPage.creditCardFirstName(creditCardFName);
	}

	@When("^In book flight page,I set middle name as it appear on credit card \"([^\"]*)\"$")
	public void i_set_middle_name_as_it_appear_on_credit_card(String creditCardMName)  {
		bookFlightPage=new BookFlightPage();

		bookFlightPage.middleNameOnCdreditCard(creditCardMName); 
	}
	
	@When("^In book flight page,I set last name on credit card \"([^\"]*)\"$")
	public void i_set_last_name_on_credit_card(String creditCardlName)  {
		bookFlightPage=new BookFlightPage();

		bookFlightPage.lastNameOnCdreditCard(creditCardlName);
	}
	

	@When("^In book flight page,I click the checkbox for ticketless travel$")
	public void i_click_the_checkbox_for_ticketless_travel()  {
		bookFlightPage=new BookFlightPage();

		bookFlightPage.clickTicketlessTravelCheckBox();
	}

	@When("^In book flight page,I set the firstline of the credit card billing address\"([^\"]*)\"$")
	public void i_set_the_firstline_of_the_credit_card_billing_address(String address)  {
		bookFlightPage=new BookFlightPage();

		bookFlightPage.billingAddressFirstLine(address);
	}

	@When("^In book flight page,I set the secondline of the credit card billing address\"([^\"]*)\"$")
	public void i_set_the_secondline_of_the_credit_card_billing_address(String address2){
		bookFlightPage=new BookFlightPage();

		bookFlightPage.billingAddressSecondLine(address2);
	}

	@When("^In book flight page,I set the city of the credit card billing address\"([^\"]*)\"$")
	public void i_set_the_city_of_the_credit_card_billing_address(String addCity){
		bookFlightPage=new BookFlightPage();

		bookFlightPage.typeBillingAddressCity(addCity);
	}

	@When("^In book flight page,I set the state or province from the credit card billing address\"([^\"]*)\"$")
	public void setBillState(String setBillState){
		bookFlightPage=new BookFlightPage();

		bookFlightPage.setBillState(setBillState);
	}

	@When("^In book flight page,I set the postcode of the billing address \"([^\"]*)\"$")
	public void setBillPostCode(String inputPostcode){
		bookFlightPage=new BookFlightPage();

		bookFlightPage.setBillPostCode(inputPostcode);
	}

	@When("^In book flight page,I select the country \"([^\"]*)\"$")
	public void selectBillCountry(String country){
		bookFlightPage=new BookFlightPage();

		bookFlightPage.selectBillCountry(country); 
	}

	@When("^In book flight page,I click the check box for the same billing address$")
	public void clickCheckBoxForSameBillingAddress(){
		bookFlightPage=new BookFlightPage();

		bookFlightPage.clickCheckBoxForSameBillingAddress();
	}

	@When("^In book flight page,I click the secure purchase button$")
	public void i_click_the_secure_purchase_button(){
		bookFlightPage=new BookFlightPage();

		bookFlightPage.clickSecurePurchaseButton();
	}

	@Then("^In book flight page,The Flight Confirmation page is displayed$")
	public void the_Flight_Confirmation_page_is_displayed(){
		flightConfirmationPage=new FlightConfirmationPage();
		
		flightConfirmationPage.isFlightConfirmationMessageDisplayed();
	}

	


}
