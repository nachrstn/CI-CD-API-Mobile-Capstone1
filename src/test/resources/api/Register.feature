Feature: Register
  As an quality engineer
  I want to be able to authenticate my account
  So that I can access all the features

  Scenario: POST - Successful Register
    Given I set POST endpoints Register
    When I send POST HTTP request Register
    Then I receive response code 201 Register
    And I receive valid data for Register

  Scenario: POST - Register invalid endpoint
    Given I set POST Register invalid endpoint
    When I send POST HTTP request Register invalid endpoint
    Then I receive response code 404 for Register

  Scenario: POST - Register invalid method
    Given I set POST Register invalid method
    When I send POST HTTP request Register invalid method
    Then I receive response code 405 for Register invalid method

  Scenario: POST - Register invalid payload
    Given I set POST Register invalid payload
    When I send POST HTTP request Register invalid payload
    Then I receive response code 400 for Register invalid payload



