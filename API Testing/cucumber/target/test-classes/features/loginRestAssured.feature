Feature: Test dummy features

@tag1
Scenario Outline: To verify that user is able to login with the help api hit
Given hit api with credential "<userEmail>" and "<userPassword>" 
When apply post method
Then Response data get

Examples:
| userEmail          | userPassword |
| ranjeet@gmail.com  | Ranjeet@123  |
