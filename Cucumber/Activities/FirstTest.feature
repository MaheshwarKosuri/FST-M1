Feature: Basic Syntax
  Scenario: Scenario 1
    Given user is on test page
    When user click about us button
    Then user should redirect to about us page
    Then close the browser