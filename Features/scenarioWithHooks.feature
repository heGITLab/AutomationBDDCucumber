Feature: OrangeHRM live application test

#  tagged hooks
  @First
  Scenario: OrangeHRM login functionality
    Given User is on login page
    When User enter username and password
    And User click on login button
    And User logged in and is on home page
    Then User logout

#  tagged hooks
  @Second
  Scenario: OrangeHRM Time Sheet functionality
    Given User is on login page
    When User enter username and password
    And User click on login button
    And User logged in and is on home page
    Then User logout

#  tagged hooks
  @Third
  Scenario Outline: OrangeHRM admin functionality
    Given User is on login page
    When User enter username and password
    And User click on login button
    And User logged in and is on home page
    Then User logout
    Examples:
      | user1 |
      | user2 |