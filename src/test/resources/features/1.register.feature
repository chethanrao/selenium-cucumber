Feature:Mercury Tour registration process

Scenario:	Create an account on mercury tour website
			
			
		Given I navigate to mercury tour
	    When I click on register
	    Then I set my first name "first"
	    And I set my last name "last"
	    And I set my phone number "82993900"
	    And I set email address "m@gmail.com"
	    And I set my address "123 meteor county"
	    And I set my city "Tampa"
	    And I set my postcode "33647"
	    And I select country "UNITED STATES"
	    And I set username "crao"
	    And I set password "crao"
	    And I set confirm password "crao"
	    And I click submit button
	    And the registration is successful