Feature: Fill in the contact form
  I want to fill the contact form and sent it

  Scenario: Fill In The Contact Form
    Given I want to fill the contact form
    When I click on contact button
    And write my feedback
    And click on send
    Then my feedback shall be sent