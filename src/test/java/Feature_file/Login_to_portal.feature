@login_feature
Feature: Login_to_portal
  login with existing member
  @login_member

Scenario: Test Case 1: Login User with valid email and password
  verify login feature with valid member details
  Given open the browser
  When open the url "https://www.automationexercise.com/"
    Then Click on Signup_Login button
    Then Verify Login to your account is visible
    Then Enter correct email address "purideepak1@gmail.com" and password "Deep@123"
    Then Click login button
    Then Verify that Logged in as username is visible
    And close browser

  @login_with_invalid_member
  Scenario Outline: Test Case 2: Login User with incorrect email and password
  verify member with invalid member credentials first with invalid email and pass and then correct.
  data driven testing
    Given open the browser
  When open the url "<url>"
  Then Click on Signup_Login button
  And  Enter incorrect email address "<email>" and password "<password>"
  Then Click login button
  And  Verify error 'Your email or password is incorrect!' is visible
    And close browser


    Examples:
      | url                                 | email                 | password |
      | https://www.automationexercise.com/ | purideepak2@gmail.com | Deep@124 |

  @logout_feature
  Scenario: Test Case 3: Logout User
  verify user able to logout successfully
    Given open the browser
    When open the url "https://www.automationexercise.com/"
    Then Click on Signup_Login button
    #Then Verify Login to your account is visible
    Then Enter correct email address "purideepak1@gmail.com" and password "Deep@123"
    Then Click login button
   # Then Verify that Logged in as username is visible
    Then Click Logout button
    And Verify that user is navigated to login page
    And close browser

    @Test_case_page
    Scenario: Test Case 4: Verify Test Cases Page without login
      Given open the browser
      When open the url "https://www.automationexercise.com/"
      And Click on 'Test Cases' button
     #Then Verify user is navigated to test cases page successfully and msg shown as "Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:"



