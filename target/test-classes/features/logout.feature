@Re
Feature: Logout Functionality

  Scenario: AC1- User can log out and ends up in login page.

    Given user is on the login page
    When user enters valid username and password
    And user click login button
    And user is on the homepage
    And user clicks on his username top right of the screen
    And user click Log out
    And user click step back button
    Then user still on login page
