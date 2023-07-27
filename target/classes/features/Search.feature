Feature: Search Functionality

  Scenario: User Searching in home page
    Given User is on HomePage "Your Store"
    And User search "Mobile" in page
    When User Click on search icon
    And user select Phones & PDAs "Phones & PDAs"from All Categories drop down "All Categories"
    And user tick Search in product descriptions "Search in product descriptions"
    And user tick Search in subcategories "Search in subcategories"
    And USer click on new search
    Then Mobile should be searched sucessfully
  
    Scenario: User Searching in home page
    Given User is on HomePage "Your Store"
    And User search "Desktop" in page
    When User Click on search icon
    And user select "Desktops" from All Categories drop down
    And user tick Search in product descriptions "Search in product descriptions"
    And user tick Search in subcategories "Search in subcategories"
    And USer click on new search
    Then Mobile should be searched sucessfully
