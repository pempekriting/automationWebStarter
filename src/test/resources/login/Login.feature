@Login

Feature: Login
  As a User, I can login into the Kuncie Apps

  Scenario: Login with valid credentials
    Given the user is already on the login page
    When the user login with valid credentials
    Then the user should directed to the dashboard user


  Scenario Outline: Check catalogue
    Given the user already login into the website
    Then the user should see catalogue product with <productName>
    Examples:
      | productName             |
      | Sauce Labs Backpack     |
      | Sauce Labs Bike Light   |
      | Sauce Labs Bolt T-Shirt |
