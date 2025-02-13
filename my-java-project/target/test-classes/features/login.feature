Feature: Login a SauceDemo

  Scenario: Iniciar sesión con credenciales válidas
    Given el usuario está en la página de login
    When ingresa el usuario "standard_user" y la contraseña "secret_sauce"
    And hace clic en el botón de login
    Then debería ver la página de productos

  Scenario: Iniciar sesión con credenciales inválidas
    Given el usuario está en la página de login
    When ingresa el usuario "usuario_invalido" y la contraseña "clave_incorrecta"
    And hace clic en el botón de login
    Then debería ver un mensaje de error "Epic sadface: Username and password do not match any user in this service"
