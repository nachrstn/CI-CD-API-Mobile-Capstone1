Feature: Notification
  As an quality engineer
  I want to be able to see all notification
  So that I can view updates on my account


  Scenario: GET - Get notifications success
    Given I set GET endpoint notifications
    When I send GET HTTP request notifications
    Then I receive response code 200 for get notifications

  Scenario: GET - Get notifications invalid endpoint
    Given I set GET notifications invalid endpoint
    When I send GET HTTP request notifications invalid endpoint
    Then I receive response code 404 for Get notifications invalid endpoint



