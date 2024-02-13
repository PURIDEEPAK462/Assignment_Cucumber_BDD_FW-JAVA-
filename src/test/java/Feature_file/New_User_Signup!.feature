@Registeration_feature
Feature: new user signup with valid credentials
  @New_User_Signup!
  Scenario: Verify ew user able to signup with valid credentials
    Given open the browser
    When open the url "https://www.automationexercise.com/"
    Then Click on Signup_Login button
  Then Verify 'New User Signup!' is visible
  Then Enter name as  and email address as
  Then Click Signup button

