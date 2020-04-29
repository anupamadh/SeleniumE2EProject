Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize the browser with Chrome
And Navigate to "http://www.qaclickacademy.com/" site
And Click on Login link in home page to land on secure sign in Page
When User enters <username> and <password> and logs in
Then Verify that user is successfully logged in
And close browsers

Examples:
|username				|password	|
|xxx@yahoo.com			|xxx		|
|test123@gmail.com		|12345		|