@EBAY
Feature: Validacion de busqueda de Ebay
  As un usuario comun
  I quiero validar la pagina de Ebay
  So mostrar resultados de busqueda

  Background:
    Given Cargar la pagina de Ebay

  @EBAY1
  Scenario Outline: Accediendo al Home Ebay para validar busqueda
    When Escribir producto "<producto>" en Ebay
    And Hacer click en busqueda en Ebay
    And Hacer click en marca Adidas en Ebay
    Then Validar resultados en Ebay

    Examples:
      | producto |
      | zapatos  |
