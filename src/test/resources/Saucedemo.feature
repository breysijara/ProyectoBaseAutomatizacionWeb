# new feature
# Tags: optional
@Login
Feature: saucedemo

  @LoginCorrecto
  Scenario Outline: LoginSaucedemo
    Given que me encuentro en la página de saucedemo
    When  se ingresa las credenciales correctas "<username>" y password "<password>"
    Then  se valida el resultado correcto "<resultado>"
    Examples:
      | username                | password     | resultado |
      | standard_user           | secret_sauce | PRODUCTS  |
      | problem_user            | secret_sauce | PRODUCTS  |
      | performance_glitch_user | secret_sauce | PRODUCTS  |


  @UserBloqueado
  Scenario: UserBloqueado
    Given que me encuentro en la página de saucedemo
    When  se ingresa las credenciales del usuario bloqueado "locked_out_user" y password "secret_sauce"
    Then  se valida el resultado  "Epic sadface: Sorry, this user has been locked out."
