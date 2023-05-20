# new feature
# Tags: optional

@Rebates
Feature: Login a la aplicacion Rebates
  Como Analista comercial
  Quiero Ingresar a la aplicacion Rebates
  Para ingresar informacion



  @LoginOK
  Scenario: Login Acuerdo regular
    Given Que el sistema Rebates este disponible
    When inicio sesión con mis credenciales
    Then Se valida el inicio de sesion





