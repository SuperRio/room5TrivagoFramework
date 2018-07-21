Feature: Search for any location on Room5 by using the search bar
  I want to use this template for my search

  Scenario: Location Search
    Given I want to search for a specific location
    When I type my location
    And click enter
    Then I shall see the appropriate results
