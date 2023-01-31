Feature: Check the Login page with invalid credentials
@errorValidation
Scenario Outline: Enter the invalid credentials in login page and validate the message

Given I am in the login page of app
When I enter the invalid credentials <un> and <pwd> and click on login button
Then Check for the response received

Examples:
	|	un											|		pwd					|
	|	Karthicksdk45@gmail.com	|		Karthick@4	|
