Feature: Order the product
@Launch
Scenario Outline: Order the product
		Given Enter the valid credentials <userName> and <password>
		When check for the products available
		And Order the product
		Then verify the confirmation message
		Examples:
		|userName								|password		|
		|Karthicksdk45@gmail.com|Karthick@45|