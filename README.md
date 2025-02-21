Contenido del README.md
markdown
Copy
# Selenium Cucumber Framework

Este es un framework de automatización de pruebas construido con **Selenium**, **Cucumber** y **Java**. Está diseñado para facilitar la creación, ejecución y reporte de pruebas automatizadas para aplicaciones web.

---

## 📋 Requisitos Previos

Antes de utilizar este framework, asegúrate de tener instaladas las siguientes herramientas:

- **Java JDK 8 o superior** (recomendado JDK 11).
- **Maven** (para la gestión de dependencias y construcción del proyecto).
- **Navegadores** (Chrome, Firefox, etc.) y sus respectivos drivers.
- **IDE** (IntelliJ IDEA, Eclipse, etc.) para desarrollo.

---

## 🛠 Configuración

Sigue estos pasos para configurar el proyecto en tu entorno local:

1. **Clona el repositorio:**
   ```bash
   git clone https://github.com/DamianTobias15/Selenium-cucumber-proyects.git
Navega al directorio del proyecto:

bash
Copy
cd Selenium-cucumber-proyects
Instala las dependencias:

bash
Copy
mvn clean install
Configura los drivers de los navegadores:

Asegúrate de que los drivers (ChromeDriver, GeckoDriver, etc.) estén en la ruta correcta o en el PATH del sistema.

También puedes usar WebDriverManager para manejar automáticamente los drivers.

🚀 Ejecución de Pruebas
Para ejecutar las pruebas, utiliza los siguientes comandos:

Ejecutar todas las pruebas:

bash
Copy
mvn test
Ejecutar pruebas específicas:

Usa tags de Cucumber para ejecutar pruebas específicas. Por ejemplo:

bash
Copy
mvn test -Dcucumber.options="--tags @smoke"
Generar reportes:

Después de ejecutar las pruebas, los reportes de ExtentReports se generarán en la carpeta target/extent-reports/.

📂 Estructura del Proyecto
El proyecto está organizado de la siguiente manera:

Copy
src/
├── test/
│   ├── java/
│   │   ├── pages/          # Clases de Page Object Model (POM)
│   │   ├── steps/          # Step definitions de Cucumber
│   │   ├── runners/        # Clases para ejecutar pruebas
│   │   ├── utils/          # Utilidades comunes (DriverManager, ReportManager, etc.)
│   ├── resources/
│   │   ├── features/       # Archivos .feature de Cucumber
│   │   ├── config.properties # Archivo de configuración
target/
├── extent-reports/         # Reportes generados por ExtentReports
📊 Reportes
Este framework utiliza ExtentReports para generar reportes detallados de las pruebas ejecutadas. Después de cada ejecución, puedes encontrar los reportes en la carpeta target/extent-reports/.

🤝 Contribución
Si deseas contribuir a este proyecto, sigue estos pasos:

Haz un fork del repositorio.

Crea una rama con tu nueva funcionalidad (git checkout -b feature/nueva-funcionalidad).

Realiza tus cambios y haz commit (git commit -m 'Añadir nueva funcionalidad').

Haz push a la rama (git push origin feature/nueva-funcionalidad).

Abre un Pull Request.

