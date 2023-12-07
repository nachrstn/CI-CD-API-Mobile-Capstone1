Feature: Notification
  As an quality engineer
  I want to be able to see all patient appointment
  So that patients can make an appointment with doctor


  Scenario: GET - Get notifications success
    Given I set GET endpoint notifications
    When I send GET HTTP request notifications
    Then I receive response code 200 for get notifications

  Scenario: GET - Get notifications invalid endpoint
    Given I set GET notifications invalid endpoint
    When I send GET HTTP request notifications invalid endpoint
    Then I receive response code 404 for Get notifications invalid endpoint

  Scenario: GET - Get notifications invalid method
    Given I set GET notifications invalid method
    When I send GET HTTP request notifications invalid method
    Then I receive response code 405 for Get notifications invalid method

