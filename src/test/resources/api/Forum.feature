Feature: Register
  As an quality engineer
  I want to be able to authenticate my account
  So that I can access all the features

  Scenario: GET - Get all forum success
    Given I set GET endpoint all forum
    When I send GET HTTP request all forum
    Then I receive response code 200 for get all forum

  Scenario: GET - Get all forum invalid endpoint
    Given I set GET all forum invalid endpoint
    When I send GET HTTP request all forum invalid endpoint
    Then I receive response code 404 for Get all forum invalid endpoint

  Scenario: GET - Get all forum invalid method
    Given I set GET all forum invalid method
    When I send GET HTTP request all forum invalid method
    Then I receive response code 405 for Get all forum invalid method


  Scenario: GET - Get search forum success
    Given I set GET endpoint search forum
    When I send GET HTTP request search forum
    Then I receive response code 200 for get search forum

  Scenario: GET - Get search forum invalid endpoint
    Given I set GET search forum invalid endpoint
    When I send GET HTTP request search forum invalid endpoint
    Then I receive response code 404 for Get search forum invalid endpoint

  Scenario: GET - Get search forum invalid method
    Given I set GET search forum invalid method
    When I send GET HTTP request search forum invalid method
    Then I receive response code 405 for Get search forum invalid method

  Scenario: GET - Get search forum invalid search keyword
    Given I set GET search forum invalid search keyword
    When I send GET HTTP request search forum invalid search keyword
    Then I receive response code 400 for search forum invalid search keyword

  Scenario: POST - Post create new forum success
    Given I set POST endpoint create new forum
    When I send POST HTTP request create new forum
    Then I receive response code 200 create new forum

  Scenario: POST - Post create new forum invalid endpoint
    Given I set POST create new forum invalid endpoint
    When I send POST HTTP request create new forum invalid endpoint
    Then I receive response code 404 create new forum invalid endpoint

  Scenario: POST - Post create new forum invalid method
    Given I set POST create new forum invalid method
    When I send POST HTTP request create new forum invalid method
    Then I receive response code 405 create new forum invalid method

  Scenario: POST - Post create new forum invalid json payload
    Given I set POST create new forum invalid json payload
    When I send POST HTTP request create new forum invalid json payload
    Then I receive response code 400 create new forum invalid json payload

  Scenario: DELETE - Delete forum success
    Given I set DELETE endpoint forum
    When I send DELETE HTTP request forum
    Then I receive response code 200 forum

  Scenario: DELETE - Delete forum invalid endpoint
    Given I set DELETE forum invalid endpoint
    When I send DELETE HTTP request forum invalid endpoint
    Then I receive response code 404 forum invalid endpoint

  Scenario: DELETE - Delete forum invalid method
    Given I set DELETE forum invalid method
    When I send DELETE HTTP request forum invalid method
    Then I receive response code 405 forum invalid method




