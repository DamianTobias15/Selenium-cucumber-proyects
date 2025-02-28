Feature: Navegación a la página de productos para hombres
  @smoke
  Scenario: Verificar carga correcta de la página de productos para hombres
    Given Abro el navegador
    When Navego a la página "https://www.gymshark.com/collections/all-products/mens"
    Then El título de la página contiene "Men's"
    And Se muestra la sección de productos destacados