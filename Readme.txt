README

* Proyecto de Prueba utilizando el Patron de diseño pom, para el desarrollo de test automatizados.
* Los tests se ejecutan en Chrome utilizando Selenium WebDriver
* Se utiliza como ejemplo la web: https://www.experta.com.ar/

Instrucciones:

Para ejecutar las pruebas se debe importar el proyecto a Cliente de Explipse (Generado con Eclipse IDE)

Una vez importado el proyecto, importar las librerias de maven. (Maven > Update Project)

Podemos ejecutar los tests de las siguientes formas:

1° Ejecutando los tests ubicados en /src/test/java en forma unitaria.
2° Ejecutando la clase /src/test/java/TestRunner.java esto ejecutara todos los tests
3° Ejecutando la clase /src/test/java/TestSuite.java esto ejecutara todos los tests agrupados en la suite (en este caso son todos.)
4° Ejecutandolos a traves de maven con el comando "clean install test surefire-report:report" 
Esto ejecutara todos las pruebas, generara un reporte con los tiempos de ejecucion por test y resultados.  (Util para integrar con herramientas de integracion-continua)
Y compilara un jar ejecutable.

Para ejecutar el jar usar el comando "java -jar selenium-tests-0.0.1-SNAPSHOT.jar"

Escenarios de pruebas.

Cotizador Hogar: 
Se accede al Sitio https://www.experta.com.ar/ Y selecciona el boton "Conoce Mas" en la sección Personas>Hogar
Luego valida que se muestre el elemento cotizador.

Search Test: Se accede al buscador general, y se realiza la busqueda por la palabra "ART".
Se valida que devuelva una Grilla de Resultados.