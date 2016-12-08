Feature: AMS login

Scenario: AMS Login
Given Firefox browser
When I try to login with valid credentials 
Then application should login
