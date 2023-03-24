@Re
Feature: Logout Functionality

  Scenario: AC1- User can log out and ends up in login page.

    Given user is on the login page
    When user enters valid username and password
    And user click login button
    And user is on the homepage
    And user clicks on his username top right of the screen
    And user click Log out


    Scenario: The user can not go to the home page again by clicking the step back button after successfully logged out.
