Feature:Login functionality

  Scenario: As a user, I should be able to log in so that I can land on homepage.

    Given User  navigate to log in page

    When user enter valid user name
    And  user enter valid password
    Then  user click "Log in" button


Scenario: AC2   "Wrong login/password" message should be displayed for invalid credentials (valid username-invalid password and invalid username-valid password)
  When User  navigate to log in page
  And  user enter valid user name
  And user enter invalid password
  And user click "Log in" button
  Then user see "Wrong login/password " message displayed