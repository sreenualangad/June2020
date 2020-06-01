Feature: Login Functionality
Scenario Outline: User can able to login
Given load url
When user has to fill"<username>" and "<password>"
And user can click Login
Then verify user is in Search page
Examples: 
|username|password|
|sreenualangad| sreenu6595|

Scenario: user able to fill the search page
When user fill details
And user click search
Then verify user see his own details

Scenario: user can able to go for payment or not
When user select and proceed
Then verify user is own payment page

Scenario: user can see and select his own details
When user select and click continue
Then verify user in payment page

Scenario: user can fill payment details
When user proceed to pay
Then verify his code generated


 
