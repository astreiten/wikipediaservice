# wikipediaservice

Instructivo para utilizar el servicio Wikipedia:

- Obtener una instancia del módulo ServiceModule (módulo estático).
- Pedirle una instancia de ServiceImpl con el método getService(). 
- Con el método getMeaning(String input) solicitar la definición buscada.
- El método retornará nulo en caso de estar mal formada la entrada, o si no se encontraron resultados. 
- Caso contrario, retornará un string con la definición.
- En caso de una falla de conexión, lanza una excepción IOException.
