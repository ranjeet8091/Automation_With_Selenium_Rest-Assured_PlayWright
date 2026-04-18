
Feature: Library operations
	
Scenario Outline: Add book in the library
Given: Details of book "<name>" and "<isbn>" and "<aisle>" and "<author>"
When: User hits the end-point with post method
Then: User receives the output with msg successfully added

Examples:
| name                             | isbn| aisle| author     |
| Learn Appium Automation with Java| bcd | 227  | John foe   |