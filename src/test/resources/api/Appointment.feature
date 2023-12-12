Feature: Appointment
  As an quality engineer
  I want to be able to see all patient appointment
  So that patients can make an appointment with doctor

  Scenario: GET - Get all specialist success
    Given I set GET endpoint all specialist
    When I send GET HTTP request all specialist
    Then I receive response code 200 for get all specialist

  Scenario: GET - Get all specialist invalid endpoint
    Given I set GET all specialist invalid endpoint
    When I send GET HTTP request all specialist invalid endpoint
    Then I receive response code 400 for Get all specialist invalid endpoint



  Scenario: GET - Get all clinics success
    Given I set GET endpoint all clinics
    When I send GET HTTP request all clinics
    Then I receive response code 200 for get all clinics

  Scenario: GET - Get all clinics invalid endpoint
    Given I set GET all clinics invalid endpoint
    When I send GET HTTP request all clinics invalid endpoint
    Then I receive response code 400 for Get all clinics invalid endpoint



  Scenario: GET - Get all doctors by specialists success
    Given I set GET endpoint all doctors by specialists
    When I send GET HTTP request all doctors by specialists
    Then I receive response code 200 for get all doctors by specialists

  Scenario: GET - Get all doctors by specialists invalid endpoint
    Given I set GET all doctors by specialists invalid endpoint
    When I send GET HTTP request all doctors by specialists invalid endpoint
    Then I receive response code 400 for Get all doctors by specialists invalid endpoint



  Scenario: GET - Get all doctors by clinics success
    Given I set GET endpoint all doctors by clinics
    When I send GET HTTP request all doctors by clinics
    Then I receive response code 200 for get all doctors by clinics

  Scenario: GET - Get all doctors by clinics invalid endpoint
    Given I set GET all doctors by clinics invalid endpoint
    When I send GET HTTP request all doctors by clinics invalid endpoint
    Then I receive response code 400 for Get all doctors by clinics invalid endpoint



  Scenario: GET - Get all doctors success
    Given I set GET endpoint all doctors
    When I send GET HTTP request all doctors
    Then I receive response code 200 for get all doctors

  Scenario: GET - Get all doctors invalid endpoint
    Given I set GET all doctors invalid endpoint
    When I send GET HTTP request all doctors invalid endpoint
    Then I receive response code 400 for Get all doctors invalid endpoint



  Scenario: GET - Get search doctors success
    Given I set GET endpoint search doctors
    When I send GET HTTP request search doctors
    Then I receive response code 200 for get search doctors

  Scenario: GET - Get search doctors invalid endpoint
    Given I set GET search doctors invalid endpoint
    When I send GET HTTP request search doctors invalid endpoint
    Then I receive response code 400 for Get search doctors invalid endpoint



  Scenario: GET - Get doctor by ID success
    Given I set GET endpoint doctor by ID
    When I send GET HTTP request doctor by ID
    Then I receive response code 200 for get doctor by ID

  Scenario: GET - Get doctor by ID invalid endpoint
    Given I set GET doctor by ID invalid endpoint
    When I send GET HTTP request doctor by ID invalid endpoint
    Then I receive response code 400 for Get doctor by ID invalid endpoint



#  Scenario: POST - Post create new clinics success
#    Given I set POST endpoint create new clinics
#    When I send POST HTTP request create new clinics
#    Then I receive response code 200 create new clinics
#
#  Scenario: POST - Post create new clinics invalid endpoint
#    Given I set POST create new clinics invalid endpoint
#    When I send POST HTTP request create new clinics invalid endpoint
#    Then I receive response code 400 create new clinics invalid endpoint
#




  Scenario: POST - Post create new consultation success
    Given I set POST endpoint create new consultation
    When I send POST HTTP request create new consultation
    Then I receive response code 201 create new consultation

  Scenario: POST - Post create new consultation invalid endpoint
    Given I set POST create new consultation invalid endpoint
    When I send POST HTTP request create new consultation invalid endpoint
    Then I receive response code 404 create new consultation invalid endpoint







