Feature: Login functionality of OrangeHRM Application

  Scenario: Verification of Login Button with number of credentials
    Given Open the chrome and launch the application
    When Enter the Username "Admin" and Password "admin123"
    Then Login to the application
    And Click on time, attendance and punchInOut
    And Enter punch in details "2020-10-21" and "01:00" and "noteIn"
    And Enter punch out details "2020-10-21" and "02:00" and "noteIn"
    Then Close the browser

