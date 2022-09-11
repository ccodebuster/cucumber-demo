Feature: Login Test
  As user I want to login into nop commerce website

  Scenario: User should navigate to login page Successfully
    Given I am on Home Page
    When  I click on login link
    Then I should navigate to login page successfully and see "Welcome, Please Sign In!"

  Scenario: user should login with valid credentials
    Given I am on Home Page
    When I click on login link
    And I enter email "lorduk@gmail.com"
    And I enter password "123456"
    And I click on login button
    Then I verify login successfully

  Scenario Outline: Verify error message with invalid credentials
    Given I am on Home Page
    When I click on login link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    And I should see error "<message>"

    Examples:
      | email          | password | message                                                                                     |
      | dh12@gmail.com | 123456   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | dh13@gmail.com | 123456   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | dh14@gmail.com | 123456   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |