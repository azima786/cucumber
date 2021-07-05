@LoginFeature @smoke
Feature: validate techfios login functionality 

Background: 
#	Given User is on Techfios Login Page 
#	Given User is on "Techfios" Login Page 
	Given User is on "Techfios" Login Page 
	
	@scenario1 @smoke
Scenario: 1 User should be able to login with valid credentials 

	When user enters password as "abc123" 
	When user enters username as "demo@techfios.com" 
	And user click on signon button 
	Then user should land on Dashboard Page 
#	
#	@scenario2 @smoke
#Scenario: 2 User should be able to login with valid credentials 
#
#	When user enters password as "abc124" 
#	When user enters username as "demo@techfios.com" 
#	And user click on signon button 
#	Then user should land on Dashboard Page 
#
#@scenario3	
#	Scenario: 3 User should be able to login with valid credentials 
#
#	When user enters password as "abc124" 
#	When user enters username as "demo2@techfios.com" 
#	And user click on signon button 
#	Then user should land on Dashboard Page 
#	
#	@scenario4
#	Scenario: 4 User should be able to login with valid credentials 
#
#	When user enters password as "abc123" 
#	When user enters username as "demo1@techfios.com" 
#	And user click on signon button 
#	Then user should land on Dashboard Page 