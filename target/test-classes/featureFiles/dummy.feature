Feature: Verify User Login Test Cases

@Alby
Scenario: verify user login with correct creds
Given when user is on HomePage
When user enter  "standard_user" and "secret_sauce"
Then user is able to see login successfully


#Scenario: verify user not able to  login with incorrect creds
#
#Given when user is on HomePage
#When user enter  "Na" and "Obsqura"
#Then user should not able to see logout button


@Smoke
Scenario Outline: verify user not able to  login with incorrect creds
Given when user is on HomePage
When user enter incorrect "<userName>" and "<password>"
Then user should not able to see logout button
 Examples:
        |  userName  |  password  |
        |  Mandy |   qwerty123    |
        | Sandy  |   hchjvhc12    |
				|123@@2  |  ###$%$        |


@Reg			
Scenario: verify error validations
    Given when user is on HomePage
    When user enters following data
     | Mandy       |     Sandhu     |    
     |Pratiskha    |     Varma1    |    
     |Febinsha           |    Nasreen |   
    Then user should not able to see logout button
    		


