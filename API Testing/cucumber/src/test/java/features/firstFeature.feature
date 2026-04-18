Feature:Test dummy features

Scenario: To verify that user is able to run test cases
Given I am a customer
When I login to ecom app
Then My wishlist should be displayed


Scenario Outline: To verify that user is able to run test cases
Given User logs in with the credential "<username>"  "<password>"
When I login to ecom app
Then My wishlist should be displayed

Examples:
|username|password|
|user1|pass1|
|user2|pass2|