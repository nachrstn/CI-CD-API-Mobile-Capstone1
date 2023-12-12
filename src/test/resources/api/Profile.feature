Feature: Profile
  As an quality engineer
  I want to be able to see my account
  So that I can manage my account



  Scenario: GET - Get all patients success
    Given I set GET endpoint all patients
    When I send GET HTTP request all patients
    Then I receive response code 200 for get all patients

  Scenario: GET - Get all patients invalid endpoint
    Given I set GET all patients invalid endpoint
    When I send GET HTTP request all patients invalid endpoint
    Then I receive response code 404 for Get all patients invalid endpoint


  Scenario: GET - Get patient by id success
    Given I set GET endpoint patient by id
    When I send GET HTTP request patient by id
    Then I receive response code 200 for get patient by id

  Scenario: GET - Get patient by id invalid endpoint
    Given I set GET patient by id invalid endpoint
    When I send GET HTTP request patient by id invalid endpoint
    Then I receive response code 404 for Get patient by id invalid endpoint


  Scenario: POST - Post create new patient success
    Given I set POST endpoint create new patient
    When I send POST HTTP request create new patient
    Then I receive response code 200 create new patient

  Scenario: POST - Post create new patient invalid endpoint
    Given I set POST create new patient invalid endpoint
    When I send POST HTTP request create new patient invalid endpoint
    Then I receive response code 404 create new patient invalid endpoint



  Scenario: DELETE - Delete patient by id success
    Given I set DELETE endpoint patient by id
    When I send DELETE HTTP request patient by id
    Then I receive response code 200 patient by id

  Scenario: DELETE - Delete patient by id invalid endpoint
    Given I set DELETE patient by id invalid endpoint
    When I send DELETE HTTP request patient by id invalid endpoint
    Then I receive response code 404 patient by id invalid endpoint



  Scenario: PUT - Put update patient profile success
    Given I set PUT endpoint update patient profile
    When I send PUT HTTP request update patient profile
    Then I receive response code 200 update patient profile

  Scenario: PUT - Put update patient profile invalid endpoint
    Given I set PUT update patient profile invalid endpoint
    When I send PUT HTTP request update patient profile invalid endpoint
    Then I receive response code 404 update patient profile invalid endpoint



