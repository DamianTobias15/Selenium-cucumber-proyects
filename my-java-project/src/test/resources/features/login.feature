Feature: Prueba de inicio de sesión

  Scenario: Usuario inicia sesión correctamente
    Given el usuario está en la página de inicio de sesión
    When ingresa su usuario y contraseña válidos
    Then debería ver la página de inicio correctamente
