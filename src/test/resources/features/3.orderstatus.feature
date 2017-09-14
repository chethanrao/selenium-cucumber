Feature: verify order status/see itenerary 

@smokeTest		
Scenario:	verify order status/see iternary

			Given I navigate to mercury tour
			When In home page,I set my user name "crao"
			And In home page,I set my Password "crao"
			And In home page,I click sign in button 
			
			And I click on itinerary
			
			And I verify itinerary is displayed
		