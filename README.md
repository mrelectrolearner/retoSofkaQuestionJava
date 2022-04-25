# retoSofkaQuestionJava

## Montar base de datos y modificar credenciales de MySQL
Se agregó en el directorio principal del proyecto el script de SQL, llamado QAScript.sql. Por favor, ejecutar este archivo para montar la base de datos con las preguntas, respuestas y algunos jugadores por defecto. El nombre del 'schema' es database_challenge
### Credenciales MySQL
Por favor, modificar las credenciales de MySQL (url, user, password) en el archivo ubicado en el path src/main/java/model/dao/ConnectionDB.java,
para conectar correctamente la base de datos con la aplicación de manera local.

## Planteamiento del reto

En este reto vamos a modelar un concurso de preguntas y respuestas, la intención es diseñar una solución que permita tener un banco de preguntas con diferentes opciones para una única respuesta, además cada pregunta debe estar en una categoría o un grupos de preguntas similares del mismo nivel, por cada ronda se deberá asignar un premio a conseguir, las rondas del juego son nivel que van aumentando en la medida que el jugador gana premios.

Dentro del reto se debe considerar lo siguiente:

- Manejo de clases u objetos a nivel de modelamiento.

- Persistencia de datos o guardado de históricos.

- Manejos de listas o colecciones y ciclos de control adecuados

- Conocimiento de cualquier lenguaje de programación.

- Manejo de Git (versión de control).

### Use Case/Problem

Lo que se busca en este juego es pre-construir una serie de preguntas con 4 opciones de respuesta y una de ella válida, además de una categoría asociada con el mismo nivel de dificultad. Cada pregunta debe estar categorizada y debe existir mínimo 5 preguntas por categoría donde por cada ronda se debe extraer una pregunta de esa categoría de forma aleatoria, debe existir 5 rondas en todo el juego, cada ronda otorga premios (puntos o dinero) cuando el jugador acierta correctamente.

El acomulado de premios está dentro del concurso pero si dado el caso el jugador pretender salir de juego puede retirarse antes de responder a la pregunta, si por el contrario el jugador pierde entonces saldría del juego sin el acomulado que llevaría en ese momento.

## Stack tecnológico 

Java

mySQL
