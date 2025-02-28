@filter
Feature: Filtrar productos por categoría en Gymshark

  Scenario: Filtrar productos por categoría "Hoodies"
    Given Abro el navegador
    And Cierro el banner de cookies si está visible
    And Estoy en la página de productos para hombres
    When Selecciono la categoría "Hoodies" del menú de filtros
    Then Todos los productos mostrados pertenecen a la categoría "Hoodies"
    And El contador de resultados refleja la cantidad de productos