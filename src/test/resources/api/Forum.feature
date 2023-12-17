Feature: Forum
  As an user
  I want to be able to communicated with doctor
  So that I can get advice from doctor

  Scenario: GET - Get all forum success
    Given I set GET endpoint all forum
    When I send GET HTTP request all forum
    Then I receive response code 200 for get all forum

  Scenario: GET - Get all forum invalid endpoint
    Given I set GET all forum invalid endpoint
    When I send GET HTTP request all forum invalid endpoint
    Then I receive response code 400 for Get all forum invalid endpoint


  Scenario: GET - Get forum by id success
    Given I set GET endpoint forum by id
    When I send GET HTTP request forum by id
    Then I receive response code 200 for get forum by id

  Scenario: GET - Get forum by id invalid endpoint
    Given I set GET forum by id invalid endpoint
    When I send GET HTTP request forum by id invalid endpoint

  Scenario: GET - Get search forum success
    Given I set GET endpoint search forum
    When I send GET HTTP request search forum
    Then I receive response code 200 for get search forum

  Scenario: GET - Get search forum invalid endpoint
    Given I set GET search forum invalid endpoint
    When I send GET HTTP request search forum invalid endpoint
    Then I receive response code 400 for Get search forum invalid endpoint


  Scenario: POST - Post create new forum success
    Given I set POST endpoint create new forum
    When I send POST HTTP request create new forum
    Then I receive response code 201 create new forum

  Scenario: POST - Post create new forum invalid endpoint
    Given I set POST create new forum invalid endpoint
    When I send POST HTTP request create new forum invalid endpoint
    Then I receive response code 404 create new forum invalid endpoint


  Scenario: POST - Post create new forum invalid ID patient
    Given I set POST create new forum invalid ID patient
    When I send POST HTTP request create new forum invalid ID patient
    Then I receive response code 400 create new forum invalid ID patient


  Scenario: DELETE - Delete forum success
    Given I set DELETE endpoint forum
    When I send DELETE HTTP request forum
    Then I receive response code 200 forum

  Scenario: DELETE - Delete forum invalid endpoint
    Given I set DELETE forum invalid endpoint
    When I send DELETE HTTP request forum invalid endpoint
    Then I receive response code 400 forum invalid endpoint






