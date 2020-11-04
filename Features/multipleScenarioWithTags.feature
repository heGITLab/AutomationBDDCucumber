Feature: OHRM Live Web Application Testing

  @SmokeTest @RegressionTest
  Scenario: Login functionality with happy path
    Given : application loging with valid data

  @RegressionTest
  Scenario: Login functionality with negative path
    Given : application loging with invalid data

  @SmokeTest
  Scenario: PunchInOut functionality
    Given : PunchInOut record with valid data

  @SmokeTest @RegressionTest
  Scenario: Admin search functionality of system users
    Given : Verifying user searching with valid data

  @SmokeTest
  Scenario: Recruitment candidate search functionality
    Given : Verifying candidate searching with valid data

  @End2End
  Scenario: Logout functionality
    Given : Application logout

  Scenario: Close the ApplicationBrowser
    Given : ApplicationBrowser close