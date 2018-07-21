Feature: Navigate to Destination
  I want to use the menu at top left to navigate to a destination.

  Scenario: Navigate to Destination
    Given I want to navigate to a destination
    When I click on the top left menu
    And click on my desired destination
    Then I shall get navigated to it
