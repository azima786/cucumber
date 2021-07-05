@otherFeature @smoke
Feature: Other validate techfios login functionality 2

Background: 
	Given User is on "Techfios" Login Page 
	
	@other1 @smoke
Scenario Outline:  User should be able to login with valid credentials 
When user enters "<username>" and "<password>" 
And user click on signon button
Then user should land on Dashboard Page

Examples: 
|Username|Password|
|demo@techfios.com|abc123|
|demo@techfios.com|abc124|
|demo1@techfios.com|abc123|
|demo1@techfios.com|abc124|