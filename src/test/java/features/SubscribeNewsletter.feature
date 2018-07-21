Feature: Subscribe to trivago newsletter
  I want to receive trivago Magazine articles, news, and updates on hotel offers from trivago.

  Scenario: Newsletter Subscription
    Given I want to receive updates from trivago
    When I check the newsletter checkbox
    And enter my email
    And click on inspireMe
    Then I shall get subscribed
