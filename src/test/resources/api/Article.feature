Feature: Article
  As an quality engineer
  I want to be able to see all article
  So that patients can read article

  Scenario: GET - Get all articles success
    Given I set GET endpoint all articles
    When I send GET HTTP request all articles
    Then I receive response code 200 for get all articles

  Scenario: GET - Get all articles invalid endpoint
    Given I set GET all articles invalid endpoint
    When I send GET HTTP request all articles invalid endpoint
    Then I receive response code 404 for Get all articles invalid endpoint

  Scenario: GET - Get all articles invalid method
    Given I set GET all articles invalid method
    When I send GET HTTP request all articles invalid method
    Then I receive response code 405 for Get all articles invalid method

