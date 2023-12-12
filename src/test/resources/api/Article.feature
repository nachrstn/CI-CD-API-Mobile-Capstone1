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


  Scenario: GET - Get article by ID success
    Given I set GET endpoint article by ID
    When I send GET HTTP request article by ID
    Then I receive response code 200 for get article by ID

  Scenario: GET - Get article by ID invalid endpoint
    Given I set GET article by ID invalid endpoint
    When I send GET HTTP request article by ID invalid endpoint
    Then I receive response code 404 for Get article by ID invalid endpoint

