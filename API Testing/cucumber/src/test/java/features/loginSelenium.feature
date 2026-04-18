Feature: Test dummy features

@tag1
Scenario Outline: To verify that user is able to login
Given login with credential "<userEmail>" and "<userPassword>" and "<url>"
When i login in rahul shety page
Then user navigate to dashboard

Examples:
| userEmail          | userPassword | url                                                           |
| ranjeet@gmail.com  | Ranjeet@123  | https://rahulshettyacademy.com/client/#/auth/login            |
| ranjeett@gmail.com | Ranjeet@123  | https://rahulshettyacademy.com/client/#/auth/login            |