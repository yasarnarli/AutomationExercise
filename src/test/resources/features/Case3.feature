Feature: Case 3:Incorrect email and password

  @case3
  Scenario Outline: : The user login with incorrect email addresses and passwords
    Given The user launches browser and navigates to automationexercise.com website
    Then The user verifies that home page is visible successfully
    When The user clicks on " Signup / Login" page link button
    Then The user verifies that "Login to your account" is visible
    When The user enters incorrect "<emailAddress>" and "<password>" and clicks login button
    Then The user verifies that error "<message>"

    Examples:
      | emailAddress        | password  | message                                                        |
      | devran@gmail.com    | incorrect | Your email or password is incorrect!                           |
      | incorrect@gmail.com | 2520yn    | Your email or password is incorrect!                           |
      | incorrect@gmail.com | incorrect | Your email or password is incorrect!                           |

