Feature: Green kart page

Scenario: Validate the data flow between search bar and page

Given I am in the green kart page
When I click on the search bar and pass the data as "tom"
And get the data displaying in the page
Then compare the data sent over search bar and data displaying 

Scenario: Validate the data flow between search bar and page

Given I am in the green kart page
When I click on the search bar and pass the data as "car"
And get the data displaying in the page
Then compare the data sent over search bar and data displaying