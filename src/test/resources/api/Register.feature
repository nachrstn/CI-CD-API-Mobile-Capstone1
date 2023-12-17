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
    Then I receive response code 400 for Register

  Scenario: POST - Post registration with registered email
    Given I set POST registration with registered email
    When I send POST HTTP request registration with registered email
    Then I receive response code 400 registration with registered email





