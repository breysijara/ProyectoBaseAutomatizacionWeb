@AMAZON
Feature: Validacion de busqueda de Amazon
  As un usuario comun
  I quiero validar la pagina de Amazon
  So mostrar resultados de busqueda

  Background:
    Given Cargar la pagina de Amazon

  @AMAZON1
  Scenario Outline: Accediendo al Home Amazon para validar busqueda
    When Escribir producto "<producto>"
    And Hacer click en busqueda
    And Hacer click en marca Adidas
    Then Validar resultados "1 a 48 de más de 3,000 resultados para"

    Examples:
      | producto |
      | zapatos  |