
Feature: I want to login into the application
  @tag2
  Scenario Outline: Login into the application with valid username and password
    Given I am in the login page
    When I enter the valid <un> and <pwd>
    Then I will be getting the title as "Let's Shop"

    Examples: 
      | un  										|     pwd					|
      | Karthicksdk45@gmail.com |     Karthick@45 |
