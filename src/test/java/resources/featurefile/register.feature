Feature: Register

  Scenario: User should create account successfully
    Given I am on homepage
    When I click on register link
    And I enters following users details
      | bhavesh  | patel    | bha11v111@gmail.com  | 123456 | 123456 |
      | gaurang | patel | gaur1a1n1g@gmail.com | 123456 | 123456 |
      | deena  | patel    | d1e1e1na@gmail.com  | 123456 | 123456 |
