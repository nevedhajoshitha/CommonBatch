Feature: Testing Google

Scenario: Test Search function
Given Google is open
When User enters a <text> to search 
And Click on Search button
Then Close the browser

Examples:
|text|
|Selenium|
|Cucumber|
		