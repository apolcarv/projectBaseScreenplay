# projectBaseScreenplay
Se crea proyecyo base con patron de diseño screenplay  - actualizado 2024

# ERROR

Hola julian buen dia, espero que este super bien, estoy buscando a la solucion del problema entre serenity y el webDriver, he leido las documentaciones e implementado las configuraciones correspondientes, pero no he podido con solucionar. si tienes alguna idea o quizas algun indicio de lo que puede ser, seria genial que lo compartieras.}

link del repo por si deseas echar un vistazo al projecto base:  https://github.com/apolcarv/projectBaseScreenplay

Actualice las dependecias a la version que indicastes en el video y estos son los resultados:
Navegador EDGE

## ERROR:

### Maquina: Windows

### File:   Ferenity.conf


## Opcion:    ms:edgeOptions

WARNING: Invalid Status code=403 text=Forbidden
java.io.IOException: Invalid Status code=403 text=Forbidden
net.thucydides.core.webdriver.DriverConfigurationError: Could not instantiate class org.openqa.selenium.edge.EdgeDriver
Caused by: net.thucydides.core.webdriver.DriverConfigurationError: Could not instantiate new WebDriver instance of type class org.openqa.selenium.edge.EdgeDriver (Unable to establish websocket connection to http://localhost:61528/devtools/browser/66974f39-a3df-4f33-a276-4749e8bc4f99
### ------No a abre navegador

## opcion:  chrome.switches
net.thucydides.core.webdriver.DriverConfigurationError: Could not instantiate class org.openqa.selenium.edge.EdgeDriver
Caused by: net.thucydides.core.webdriver.DriverConfigurationError: Could not instantiate new WebDriver instance of type class org.openqa.selenium.edge.EdgeDriver (Could not start a new session. Response code 500. Message: session not created: Microsoft Edge failed to start: exited normally.
(session not created: DevToolsActivePort file doesn't exist)
### ---Abre el navegador, mas NO carga la pagina
Dato curioso me abre muchas terminales(es raro anteriormente no me pasaba)