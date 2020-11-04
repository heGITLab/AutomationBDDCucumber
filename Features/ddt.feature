Feature: Login functionality of OrangeHRM Application
#Data Driven Testing - we are using column names

  Scenario: Verification of Login Button with number of credentials
    Given Open the chrome and launch the application
    When Enter the Username and Password
      | username | password |
      | Admin    | admin123 |
    Then Login to the application
    And Click on time, attendance and punchInOut
    And Enter punch inOut details
      | dateIn     | timeIn  | noteIn | dateOut    | timeOut  | noteOut |
      | 2020-10-27 | 01:00   | noteIn | 2020-10-27 | 02:00    | noteOut |
      | 2020-10-28 | 01:00   | noteIn | 2020-10-28 | 02:00    | noteOut |
    Then Close the browser