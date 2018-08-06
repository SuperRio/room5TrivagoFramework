Feature: Fill in the contact form
  Description: I want to fill the contact form and sent it

  Scenario Outline: Fill In The Contact Form
    Given I want to fill the contact form
    When I click on contact button
    And write my "<feedback>"
    And click on send
    Then my feedback shall be sent

    Examples: 
      | feedback                                                                                                         |
      | 'Examples' Hello Trivago Team, my feedback about trivago magazine website is: Singapore's flag is not displaying |
      | 'Examples' Hello Trivago Team, my feedback is about .....                                                        |
