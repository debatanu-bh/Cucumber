Feature: Testthe Web login feature
  Scenario: User should be able to login with valid credentials
    Given User is on login page
    When The user enters the valid credential
    And hits submit button
    Then login is sucessful

#Feature: This feature will comprise of testing Flipkart application
  Scenario: Login to Flikpart
    Given User enters correct credentials
    When The user enters password and login
    And clicks submit
    Then LoginSuccess