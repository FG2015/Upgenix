Feature:Login functionality
  @all

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

  Scenario: AC3- "Please fill out this field" message should be displayed if the password or username is empty
    When User  navigate to log in page
    And  user enter valid user name
    And  user leave  password box empty
    And user click "Log in" button
    Then user see "Please fill out this field" message on the page

    Scenario: AC4- User should see the password in bullet signs by default while typing (like ****)
      When User  navigate to log in page
      And user enter valid user name
      And user enter valid password
      And user should see the password in bullet signs

      Scenario: AC5- Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
        Given User  navigate to log in page

        When user enter valid user name
        And  user enter valid password
        Then user click ENTER key



