@PruebaCarrito
Feature: : Comprando con carrito
  Usuario
  Quiero
  Para

  @CompraOk
  Scenario Outline: : Happy Path de compra exitosa utilizzando carrito
    Given que me encuentro en la pagina Blaze
    When añado el producto al carrito "<product>"
    And realizo la compra del producto
    Then verifico la compra exitosa
    Examples:
      | product           |
      | Samsung galaxy s6 |


