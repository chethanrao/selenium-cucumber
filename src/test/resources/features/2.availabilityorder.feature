Feature: This is to login and book a flight for a traveller 

Scenario:	Login and find flight for one passenger online

			Given I navigate to mercury tour
			When In home page,I set my user name "crao"
			And In home page,I set my Password "crao"
			And In home page,I click sign in button 
			And I select travel type "roundtrip" 
			And I select "1" passenger
			And I select departing from "New York" dropdown
			And I select flight departure month "June"
			And I select flight departure day "3"
			And I select arriving flight arriving in "London"
			And I select return month "October"
			And I select return day "24"
			And I select service class "First class"
			And I select airline "Unified Airlines"
			And I click continue button on flight finder page
			And I select departing flight "Blue Skies Airlines 361"
			And I select arriving flight "Unified Airlines 633"
			And I click continue button on the select flight page
			
			And In book flight page,I set first name"first name"
			And In book flight page,I set last name"last name"
			And In book flight page,I select meal "Diabetic"
			And In book flight page,I select card type "MasterCard"
			And In book flight page,I set credit card number "4319887766666"
			And In book flight page,I select the credit card expiration month "04"
			And In book flight page,I select the credit card expiration year "2010"
			And In book flight page,I set first name as it appear on credit card "first"
			And In book flight page,I set middle name as it appear on credit card "middle"
			And In book flight page,I set last name on credit card "last"
			And In book flight page,I click the checkbox for ticketless travel
			And In book flight page,I set the firstline of the credit card billing address"address 1"
			And In book flight page,I set the secondline of the credit card billing address"address 2"
			And In book flight page,I set the city of the credit card billing address"Chicago"
			And In book flight page,I set the state or province from the credit card billing address"12341 street"
			And In book flight page,I set the postcode of the billing address "82938"
			And In book flight page,I select the country "UNITED STATES"
			And In book flight page,I click the check box for the same billing address
			And In book flight page,I click the secure purchase button
			Then In book flight page,The Flight Confirmation page is displayed