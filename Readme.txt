README

* Proyecto de Prueba utilizando el Patron de diseño pom, para el desarrollo de test automatizados.
* Los tests se ejecutan en Chrome utilizando Selenium WebDriver
* Se utiliza como ejemplo la web: https://www.experta.com.ar/

Instrucciones:

Para ejecutar las pruebas se debe importar el proyecto a Cliente de Explipse (Generado con Eclipse IDE)

Una vez importado el proyecto, importar las librerias de maven. (Maven > Update Project)
Para ejecutar los test, situarse sobre el directorio /selenium-tests/src/test
Dar Click derecho sobre el directorio y ejecutar como JUnit Test.

Esto ejecutara los escenarios:

Cotizador Hogar: El cual accede al sitio Web, y se dirige al centro de la pagina donde estan los sitios para personas.
Y selecciona el boton "Conoce Mas"
Luego valida que se muestre el cotizador.

Search Test: Se accede al buscador general, y se prueba la busqueda "ART".
Se valida que devuelva una Grilla de Resultados.