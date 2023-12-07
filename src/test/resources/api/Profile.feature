Feature: Appointment
  As an quality engineer
  I want to be able to see all patient appointment
  So that patients can make an appointment with doctor



  Scenario: GET - Get all patients success
    Given I set GET endpoint all patients
    When I send GET HTTP request all patients
    Then I receive response code 200 for get all patients

  Scenario: GET - Get all patients invalid endpoint
    Given I set GET all patients invalid endpoint
    When I send GET HTTP request all patients invalid endpoint
    Then I receive response code 404 for Get all patients invalid endpoint

  Scenario: GET - Get all patients invalid method
    Given I set GET all patients invalid method
    When I send GET HTTP request all patients invalid method
    Then I receive response code 405 for Get all patients invalid method

  Scenario: GET - Get patient by id success
    Given I set GET endpoint patient by id
    When I send GET HTTP request patient by id
    Then I receive response code 200 for get patient by id

  Scenario: GET - Get patient by id invalid endpoint
    Given I set GET patient by id invalid endpoint
    When I send GET HTTP request patient by id invalid endpoint
    Then I receive response code 404 for Get patient by id invalid endpoint

  Scenario: GET - Get patient by id invalid method
    Given I set GET patient by id invalid method
    When I send GET HTTP request patient by id invalid method
    Then I receive response code 405 for Get patient by id invalid method

  Scenario: POST - Post create new patient success
    Given I set POST endpoint create new patient
    When I send POST HTTP request create new patient
    Then I receive response code 200 create new patient

  Scenario: POST - Post create new patient invalid endpoint
    Given I set POST create new patient invalid endpoint
    When I send POST HTTP request create new patient invalid endpoint
    Then I receive response code 404 create new patient invalid endpoint

  Scenario: POST - Post create new patient invalid method
    Given I set POST create new patient invalid method
    When I send POST HTTP request create new patient invalid method
    Then I receive response code 405 create new patient invalid method

  Scenario: POST - Post create new patient invalid json payload
    Given I set POST create new patient invalid json payload
    When I send POST HTTP request create new patient invalid json payload
    Then I receive response code 400 create new patient invalid json payload

  Scenario: DELETE - Delete patient by id success
    Given I set DELETE endpoint patient by id
    When I send DELETE HTTP request patient by id
    Then I receive response code 200 patient by id

  Scenario: DELETE - Delete patient by id invalid endpoint
    Given I set DELETE patient by id invalid endpoint
    When I send DELETE HTTP request patient by id invalid endpoint
    Then I receive response code 404 patient by id invalid endpoint

  Scenario: DELETE - Delete patient by id invalid method
    Given I set DELETE patient by id invalid method
    When I send DELETE HTTP request patient by id invalid method
    Then I receive response code 405 patient by id invalid method

  Scenario: PUT - Put update patient profile success
    Given I set PUT endpoint update patient profile
    When I send PUT HTTP request update patient profile
    Then I receive response code 200 update patient profile

  Scenario: PUT - Put update patient profile invalid endpoint
    Given I set PUT update patient profile invalid endpoint
    When I send PUT HTTP request update patient profile invalid endpoint
    Then I receive response code 404 update patient profile invalid endpoint

  Scenario: PUT - Put update patient profile invalid method
    Given I set PUT update patient profile invalid method
    When I send PUT HTTP request update patient profile invalid method
    Then I receive response code 405 update patient profile invalid method

  Scenario: PUT - Put update patient profile invalid json payload
    Given I set PUT update patient profile invalid json payload
    When I send PUT HTTP request update patient profile invalid json payload
    Then I receive response code 400 update patient profile invalid json payload
