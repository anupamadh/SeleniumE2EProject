Feature: Login into Application

Scenario: Positive test validating login
Given Initialize the browser with Chrome
And Navigate to "http://www.qaclickacademy.com/" site
And Click on Login link in home page to land on secure sign in Page
When User enters "xxx@yahoo.com" and "xxx" and logs in 
Then Verify that user is successfully logged in

