Feature: Testing tags

@Regression
Scenario: Test Chrome Browser
Given Chrome Browser is launched
Then Open the google page
And Close browser

@Unit
Scenario: Test Edge browser
Given Edge browser is open 
Then Open the facebook page
Then Browser is closed