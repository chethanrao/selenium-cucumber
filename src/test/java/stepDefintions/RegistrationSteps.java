package stepDefintions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.ItineraryPage;
import pages.RegisterPage;



public class RegistrationSteps{

	HomePage homePage=null;
	
	RegisterPage registerPage=null;
	
	ItineraryPage itineraryPage=null;

	@Given("^I navigate to mercury tour$")
	public void navigateToMercuryWebsite(){
		homePage=new HomePage();
		
		homePage.navigateToBase();
	}
	
	@When("^I click on register$")
	public void clickOnRegister(){
		homePage=new HomePage();
		
		homePage.clickOnRegister();
		
	}
	
	@When("^I click on itinerary$")
	public void clickOnItinerary(){
		homePage=new HomePage();
		
		homePage.clickOnItinerary();
	}
	
	@When("^I verify itinerary is displayed$")
	public void verifyItinerary(){
		itineraryPage=new ItineraryPage();
		
		itineraryPage.isItinarayDisplayed();
	}
	
	@When("^I set my first name \"([^\"]*)\"$")
	public void setFirstName(String firstName) throws Throwable {
		registerPage=new RegisterPage();
		
		registerPage.setFirstName(firstName);
	}

	@When("^I set my last name \"([^\"]*)\"$")
	public void setLastName(String lastName) throws Throwable {
		registerPage=new RegisterPage();

		registerPage.setLastName(lastName); 
	}

	@When("^I set my phone number \"([^\"]*)\"$")
	public void setPhone(String phonenumber) throws Throwable {
		registerPage.setPhone(phonenumber); 
	}
	
	@When("^I set email address \"([^\"]*)\"$")
	public void setEmail(String email) throws Throwable {
		registerPage=new RegisterPage();

		registerPage.setEmail(email);
	}
	
	@When("^I set my address \"([^\"]*)\"$")
	public void setMyAddess(String address1) throws Throwable {
		registerPage=new RegisterPage();

		registerPage.setAddress1(address1);
	}

	
	@When("^I set my city \"([^\"]*)\"$")
	public void setCity(String city) throws Throwable {
		registerPage=new RegisterPage();

		registerPage.setCity(city);
	}
	
	@When("^I set my state \"([^\"]*)\"$")
	public void setState(String state) throws Throwable {
		registerPage=new RegisterPage();

		registerPage.setState(state);
	}

	@When("^I set my postcode \"([^\"]*)\"$")
	public void setPostCode(String postcode) throws Throwable {
		registerPage=new RegisterPage();

		registerPage.setPostalCode(postcode);
	}

	@When("^I select country \"([^\"]*)\"$")
	public void selectCountry(String countryName) throws Throwable {
		registerPage=new RegisterPage();

		registerPage.setCountry(countryName);
	}

	@When("^I set username \"([^\"]*)\"$")
	public void setUserName(String username) throws Throwable {
		registerPage=new RegisterPage();

		registerPage.setUserName(username);
	}

	@When("^I set password \"([^\"]*)\"$")
	public void i_enter_password(String password) throws Throwable {
		registerPage=new RegisterPage();

		registerPage.setPassword(password);
	}

	@When("^I set confirm password \"([^\"]*)\"$")
	public void i_enter_confirm_password(String confirmPassword) throws Throwable {
		registerPage=new RegisterPage();

		registerPage.setConfirmPassword(confirmPassword);
	}

	@When("^I click submit button$")
	public void i_click_submit_button() throws Throwable {
		registerPage=new RegisterPage();

		registerPage.clickOnSubmit();;
	}

	@Then("^the registration is successful$")
	public void my_registration_is_successful() throws Throwable {

		registerPage.isRegistrationSuccessful();
	}

	
}