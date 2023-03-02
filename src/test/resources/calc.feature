# new feature
# Tags: optional

Feature: A description

  @tabla
  Scenario Outline: Tabla
    Given que me encuentro en la página de testsheepn
    When  se ingresa el primer valor First number "<numero1>" y Second number "<numero2>" y "<Operador>"
    Then  se valida el resultado "<resultado1>"
    Examples:
      | numero1 | numero2 | Operador       | resultado1 |
      | 5       | 6       | suma           | 11         |
      | 9       | 6       | resta          | 3          |
      | 6       | 6       | multiplicacion | 36         |
      | 9       | 3       | divide         | 3          |
      | 9       | 6       | concatena      | 96         |


