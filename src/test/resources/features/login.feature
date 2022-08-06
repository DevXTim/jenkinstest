Feature: Login feature
  Author - Aya
  Reviewer - Dana
  Background: Verify user is on the main page
    Given user entered correct URL
    Then verify the title of the webpage is Digital Bank
    And verify all sign-in text boxes and buttons are present

  Scenario: Verify user is able to login with valid credentials
    Given user enters valid username "<mari.smith@gmail.com>" and password "<M@ry2001>"
    When user clicks on Sign In button
    Then verify user is successfully logged in to the account

    @jenkins
  Scenario: Verify user is able to login with valid credentials Jenkins
    Given user enters valid username and password
    When user clicks on Sign In button
    Then verify user is successfully logged in to the account

  Scenario: Verify user is not able to login with both invalid credentials
    Given user enters invalid username "<username>" and password "<password>"
    When user clicks on Sign In button
    Then verify user login failed with an error message

  Scenario:  Verify user is not able to login with valid username and invalid password
    Given user enters valid username "<username>" and invalid password "<password>"
    When user clicks on Sign In button
    Then verify user login failed with an error message
  Scenario: Verify user is not able to login with invalid username and valid password
    Given user enters invalid username "<username>" and valid password "<password>"
    When user clicks on Sign In button
    Then verify user login failed with an error message

  Scenario: verify user is not able to login with blank credentials
    Given user leaves username and password fields blank
    When user clicks on Sign In button
    Then verify user login failed with an error message

  Scenario: verify user is locked out after more than 3 unsuccessful attempts
    Given user had more than 3 unsuccessful login attempts
    When user clicks on Sign In button
    Then verify user login failed with an error message









