Feature: Login
  As an quality engineer
  I want to be able to authenticate my account
  So that I can access all the features

  Scenario: POST - Successful Login
    Given I set POST endpoints Login
    When I send POST HTTP request Login
    Then I receive response code 200 Login

  Scenario: POST - Login invalid endpoint
    Given I set POST Login invalid endpoint
    When I send POST HTTP request Login invalid endpoint
    Then I receive response code 400 for Login invalid endpoint

  Scenario: POST - Post login invalid password
    Given I set POST login invalid password
    When I send POST HTTP request login invalid password
    Then I receive response code 401 login invalid password

  Scenario: POST - Post login invalid email
    Given I set POST login invalid email
    When I send POST HTTP request login invalid email
    Then I receive response code 401 login invalid email

  Scenario: POST - Post login empty password
    Given I set POST login empty password
    When I send POST HTTP request login empty password
    Then I receive response code 401 login empty password

  Scenario: POST - Post login empty email
    Given I set POST login empty email
    When I send POST HTTP request login empty email
    Then I receive response code 401 login empty email

#
#  Scenario: PUT - PUT change password success
#    Given I set PUT endpoint change password
#    When I send PUT HTTP request change password
#    Then I receive response code 200 change password
#
#  Scenario: PUT - PUT change password invalid endpoint
#    Given I set PUT change password invalid endpoint
#    When I send PUT HTTP request change password invalid endpoint
#    Then I receive response code 404 change password invalid endpoint



