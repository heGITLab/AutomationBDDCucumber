Feature: Login functionality of OrangeHRM Application
#Data Tables with List object - we are not using column names

  Scenario: Verification of Login Button with number of credentials
    Given Open the chrome and launch the application
    When Enter the Username and Password
      | Admin | admin123 |
    Then Login to the application
    And Click on time, attendance and punchInOut
    And Enter punch in details
      | 2020-10-21 | 01:00 | noteIn |
    And Enter punch out details
      | 2020-10-21 | 02:00 | noteOut |
    Then Close the browser

