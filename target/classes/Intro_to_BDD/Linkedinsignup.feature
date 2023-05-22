Feature: signin
 
@Signin
Scenario: LinkedIn signin
Given I am on the LinkedIn homepage
When I click on the Join now button
When I should be directed to the sign-up page
When I enter the Email in the field
When I click the signin  button
Then I see signed successfully

