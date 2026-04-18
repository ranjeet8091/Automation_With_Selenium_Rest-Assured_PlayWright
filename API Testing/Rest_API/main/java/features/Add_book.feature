
Feature: Library Operation

@tag1
Scenario Outline: Add book in the library
Given Details of book "<name>" and "<isbn>" and "<aisle>" and "<author>"
When User hits the end-point with post method
Then User receives the output with msg successfully added

Examples:
| name| isbn| aisle| author     |
| Learn Appium Automation with Java| bcd | 227  | Johnfoe   |


@tag2
Scenario Outline: get all the book 
Given 	Get all the book of a author "<AuthorName>"
When User hits the end-point with get method
Then User get array of Object of book

Examples:
|AuthorName|
|Johnfoe|

@tag3
Scenario Outline: all the book with help of ID 
Given Get all book based on Id "<ID>"
When User hit the endpoint with get Method of Id
Then User get array Of object

Examples:
|ID|
|bcde264|


@tag4
Scenario Outline: Delete book with ID
Given delte a book based on ID "<ID>"
When user hit the enpoind POSt
Then user will see the msg book deleted

Examples:
|ID|
|bcde800|













