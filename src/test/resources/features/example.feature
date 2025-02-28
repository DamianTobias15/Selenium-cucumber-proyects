Feature: Ejemplo de prueba automatizada
  Scenario: Navegar a Google
    Given Abro el navegador
    When Navego a "https://www.google.com"
    Then El título de la página contiene "Google"