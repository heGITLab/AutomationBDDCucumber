Feature: Login functionality of OrangeHRM Application

  Scenario Outline: Verification of Login Button with number of credentials
    Given Open the chrome and launch the application
    When Enter the Username "<username>" and Password "<password>"
    Then Login to the application
    And Click on time, attendance and punchInOut
    And Enter punch in details "<inDate>" and "<inTime>" and "<inNote>"
    And Enter punch out details "<outDate>" and "<outTime>" and "<outNote>"
    Then Close the browser

    Examples:
      | username | password | inDate     | inTime | inNote | outDate    | outTime | outNote |
      | Admin    | admin123 | 2020-10-21 | 01:00  | noteIn | 2020-10-21 | 02:00   | noteOut |

