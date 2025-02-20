Feature: Login Functionality

  Scenario: Successful login
    Given I navigate to the home page
    When I enter username "testuser" and password "password123"
    And I click the login button
    Then I should see the welcome message