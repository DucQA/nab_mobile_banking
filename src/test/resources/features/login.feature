Feature: Login Error Handling

  As a NAB mobile banking user
  I want to receive clear error messages for failed login attempts
  So that I can understand authentication issues

  Background:
    Given I launch the NAB mobile banking app
    And I am on the login screen

  Scenario Outline: Login validation with invalid credentials
    When I enter the authentication credentials:
      | NAB ID   | <id>       |
      | Password | <password> |
    And I tap on the Login button
    Then I should see an error message "<message>"

    Examples:
      | id         | password   | message                                 |
      | 2457867069 | k(ez1B^224 | Your username or password was incorrect |
      | 0782931125 | axIge(FYun | Your username or password was incorrect |
      | 8404895265 | &lRXlArzdW | Your username or password was incorrect |
      | 5453594712 | hr#q(Wq79g | Your username or password was incorrect |
      | 0802979450 | @o8cJZHX%! | Your username or password was incorrect |
      | 0051008206 | 9zh8Sav7q_ | Your username or password was incorrect |
      | 8894108857 | CqBkc^BJbZ | Your username or password was incorrect |
      | 5630633982 | vIm9JC&cSr | Your username or password was incorrect |
      | 9700655758 | !ny4R$zj@4 | Your username or password was incorrect |
      | 3325170156 | MKE&ayHh2B | Your username or password was incorrect |
