Feature: Login functionality

  Scenario: Login with valid credentials
    Given User has navigated to login page
    When User enter valid "ainam.kdumar@gmail.com" to user field
    And User has entered valid password "ainam.kdumar@gmail.com" in password
    And User click on continue button
    Then User should successfully logged in

  Scenario: Login with invalid credential
    Given User has navigated to login page
    When User enter invalid "ainam@gmail.com" to user field
    And User has entered invalid password "ainam@gmail.com" in password
    And User click on continue button
    Then User should get error "Warning: No match for E-Mail Address and/or Password."

  Scenario: Login with invalid email but valid pass credential
    Given User has navigated to login page
    When User enter invalid "aina@gmail.com" to user field
    And User has entered invalid password "ainam.kdumar@gmail.com" in password
    And User click on continue button
    Then User should get error "Warning: No match for E-Mail Address and/or Password."

  Scenario: Login with valid user and invalid password credential
    Given User has navigated to login page
    When User enter invalid "ainam.kdumar@gmail.com" to user field
    And User has entered invalid password "ainam@gmail.com" in password
    And User click on continue button
    Then User should get error "Warning: No match for E-Mail Address and/or Password."

  Scenario: Login with null credential
    Given User has navigated to login page
    When User enter null "" to user field
    And User has entered null password "" in password
    And User click on continue button
    Then User should get error "Warning: No match for E-Mail Address and/or Password."
