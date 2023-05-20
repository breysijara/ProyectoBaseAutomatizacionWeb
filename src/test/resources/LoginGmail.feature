# new feature
# Tags: optional

@LoginGmail
Feature: Login to Gmail
  Scenario: Successful login
    Given estoy en la pagina de Gmail
    When ingreso mi email y password
    And I click on the login button
    Then I should be logged in to Gmail



