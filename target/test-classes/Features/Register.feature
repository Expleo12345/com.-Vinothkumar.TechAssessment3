Feature: Providing required data for register using data Table
  Scenario: Register using valid credentials
  	Given url to launch webpage
    When User clicking register Page to enter credentials
    And User clicking radio button
    And User entering firstname,Lastname,email,password and also confirm password
    | FirstName      | LastName    |            Email              | Password    | Confirm Password |
    | vinoth      | kumar         | vinothbcr74@gmail.com             | Vinothkumar@74      |  Vinothkumar@74           |
    And User clicks register button
    Then Check weather User register successfully