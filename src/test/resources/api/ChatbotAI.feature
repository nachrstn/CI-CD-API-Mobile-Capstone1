Feature: Chatbot AI
  As an user
  I want to be able to asking to AI
  So that I can get answer from AI


  Scenario: GET - Get AI chatbot by user ID success
    Given I set GET endpoint AI chatbot by user ID
    When I send GET HTTP request AI chatbot by user ID
    Then I receive response code 200 for get AI chatbot by user ID

  Scenario: GET - Get AI chatbot by user ID invalid endpoint
    Given I set GET AI chatbot by user ID invalid endpoint
    When I send GET HTTP request AI chatbot by user ID invalid endpoint
    Then I receive response code 404 for Get AI chatbot by user ID invalid endpoint

  Scenario: GET - Get AI chatbot by session ID success
    Given I set GET endpoint AI chatbot by session ID
    When I send GET HTTP request AI chatbot by session ID
    Then I receive response code 200 for get AI chatbot by session ID

  Scenario: GET - Get AI chatbot by session ID invalid endpoint
    Given I set GET AI chatbot by session ID invalid endpoint
    When I send GET HTTP request AI chatbot by session ID invalid endpoint
    Then I receive response code 404 for Get AI chatbot by session ID invalid endpoint

  Scenario: POST - POST Create user chatbot success
    Given I set POST Create user chatbot
    When I send POST HTTP request Create user chatbot
    Then I receive response code 200 Create user chatbot

  Scenario: POST - POST Create user chatbot invalid endpoint
    Given I set POST Create user chatbot invalid endpoint
    When I send POST HTTP request Create user chatbot invalid endpoint
    Then I receive response code 404 Create user chatbot invalid endpoint
