Feature: AMS login

Scenario: AMS Login
Given Firefox browser
When I try to login with valid credentials "admin" and "admin12"
Then application should login


Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters Credentials to LogIn
    | admin | admin |
	Then Message displayed Login Successfully