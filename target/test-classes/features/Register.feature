Feature: Register functionality

  Scenario: User creates with only mandatory fields
    Given User navigated to register page
    When User enter below details
      | firstName | Anam                |
      | lastName  | kumar               |
      | email     | anamkumar4@gmail.com|
      | telephone |          1234567890 |
      | password  | anamkumar@gmail.com |
    And User click on privacy policy
    And user click on continue
    Then User should be created successfully

  Scenario: User creates with all fields
    Given User navigated to register page
    When User enter below details
      | firstName | Anam                |
      | lastName  | kumar               |
      | email     | anamkumar4@gmail.com|
      | telephone |          1234567890 |
      | password  | anamkumar@gmail.com |
    And user click on news letter
    And User click on privacy policy
    And user click on continue
    Then User should warned for duplicate email
