Feature: Green kart

Scenario: Search an item and compare whether the proper data is displaying

Given I am in the green kart page
When I click on the search bar
And enter some keys
Then it should display only the products based on the search