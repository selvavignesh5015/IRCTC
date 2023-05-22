 Feature: _Login Feature

 
Scenario Outline: Login with valid data

Given I launch the application

When I enter the username "<username>"

And I clicked login button 

#Then I verified that a user login successfullly


Examples:

|username|
|j2ee| 
Scenario Outline: Submit and validate the order for the fish

Given Click on Fish 

Given  Click on F1-SW-01

And  add to cart

And Proceed to checkout

And Click on continue 

Then Click on confirm



Scenario Outline: Submit and validate the order for the Birds

Given Click on Birds

Given  Click on AV-CB-01

And  add to cart

And Proceed to checkout

And Click on continue 

Then Click on confirm












