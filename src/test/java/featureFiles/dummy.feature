Feature: Verify User Login Test Cases


Scenario: verify user login with correct creds
Given when user is on HomePage
When user enter correct "hello" and "123"
Then user is able to see logout button


Scenario: verify user not able to  login with incorrect creds

Given when user is on HomePage
When user enter incorrect userName and password
Then user should not able to see logout button


Scenario Outline: verify user not able to  login with incorrect creds
Given when user is on HomePage
When user enter incorrect userName and password
Then user should not able to see logout button

 Examples:
        |  userName  |  password  |
        |  Mandy |   qwerty123    |
        | Sandy  |   hchjvhc12    |
				|        |                |
				|123@@2  |  ###$%$        |
				
Scenario: verify error validations
    Given user is on login pagge
    When user enters following data
     |UserName     |     Password   |        ErrorMsg                  |
     | Mandy       |     Sandhu     |    Password mising digit         |
     |Pratiskha    |     Varma1     |    Password missing special char |
     |Ni           |     Sharma12$  |    Username missing lenghth      |
 
     Then validate error msgs				


