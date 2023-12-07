Feature: Register
  As an quality engineer
  I want to be able to authenticate my account
  So that I can access all the features

  Scenario: GET - Get all transactions success
    Given I set GET endpoint all transactions
    When I send GET HTTP request all transactions
    Then I receive response code 200 for get all transactions

  Scenario: GET - Get all transactions invalid endpoint
    Given I set GET all transactions invalid endpoint
    When I send GET HTTP request all transactions invalid endpoint
    Then I receive response code 404 for Get all transactions invalid endpoint

  Scenario: GET - Get all transactions invalid method
    Given I set GET all transactions invalid method
    When I send GET HTTP request all transactions invalid method
    Then I receive response code 405 for Get all transactions invalid method

  Scenario: POST - Post create new payment success
    Given I set POST endpoint create new payment
    When I send POST HTTP request create new payment
    Then I receive response code 200 create new payment

  Scenario: POST - Post create new payment invalid endpoint
    Given I set POST create new payment invalid endpoint
    When I send POST HTTP request create new payment invalid endpoint
    Then I receive response code 404 create new payment invalid endpoint

  Scenario: POST - Post create new payment invalid method
    Given I set POST create new payment invalid method
    When I send POST HTTP request create new payment invalid method
    Then I receive response code 405 create new payment invalid method

  Scenario: POST - Post create new payment invalid json payload
    Given I set POST create new payment invalid json payload
    When I send POST HTTP request create new payment invalid json payload
    Then I receive response code 400 create new payment invalid json payload

  Scenario: POST - Post create refund for patient success
    Given I set POST endpoint create refund for patient
    When I send POST HTTP request create refund for patient
    Then I receive response code 200 create refund for patient

  Scenario: POST - Post create refund for patient invalid endpoint
    Given I set POST create refund for patient invalid endpoint
    When I send POST HTTP request create refund for patient invalid endpoint
    Then I receive response code 404 create refund for patient invalid endpoint

  Scenario: POST - Post create refund for patient invalid method
    Given I set POST create refund for patient invalid method
    When I send POST HTTP request create refund for patient invalid method
    Then I receive response code 405 create refund for patient invalid method

  Scenario: POST - Post create refund for patient invalid json payload
    Given I set POST create refund for patient invalid json payload
    When I send POST HTTP request create refund for patient invalid json payload
    Then I receive response code 400 create refund for patient invalid json payload

  Scenario: POST - Post create cancel appointment success
    Given I set POST endpoint create cancel appointment
    When I send POST HTTP request create cancel appointment
    Then I receive response code 200 create cancel appointment

  Scenario: POST - Post create cancel appointment invalid endpoint
    Given I set POST create cancel appointment invalid endpoint
    When I send POST HTTP request create cancel appointment invalid endpoint
    Then I receive response code 404 create cancel appointment invalid endpoint

  Scenario: POST - Post create cancel appointment invalid method
    Given I set POST create cancel appointment invalid method
    When I send POST HTTP request create cancel appointment invalid method
    Then I receive response code 405 create cancel appointment invalid method

  Scenario: POST - Post create cancel appointment invalid json payload
    Given I set POST create cancel appointment invalid json payload
    When I send POST HTTP request create cancel appointment invalid json payload
    Then I receive response code 400 create cancel appointment invalid json payload
