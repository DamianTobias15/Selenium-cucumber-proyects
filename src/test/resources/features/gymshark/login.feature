Feature: Login functionality

  @gymshark @login @smoke
  Scenario: Successful login with valid credentials
    Given I navigate to the login page
    And I click the account button
    When I enter username "standard_user" and password "secret_sauce"
    And I click the login button
    Then I should be redirected to the inventory page

 @gymshark @login @negative
  Scenario: Failed login with invalid credentials
    Given I navigate to the login page
    And I click the account button
    When I enter username "invalid_user" and password "wrong_password"
    And I click the login button
    Then I should see an error message