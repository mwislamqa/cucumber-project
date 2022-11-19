@LoginTest
Feature: login feature
Scenario Outline: login with valid user name and password
Given user get the URL
When user enter "<userName>" and "<password>"
Then user able to login scessfully 
Examples:
|userName | password |
|standard_user 	| secret_sauce	|
|problem_user | secret_sauce |