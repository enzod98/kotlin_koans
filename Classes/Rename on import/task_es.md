## Cambiar nombre al importar

Cuando [importas](https://kotlinlang.org/docs/packages.html#imports)
una clase o una función, puedes especificar un nombre diferente para esta 
al añadir `as NuevoNombre` después de la directiva de importación.
Esto puede ser útil si quieres usar dos clases o funciones con nombres similares 
de diferentes bibliotecas.

Descomenta el código y haz que se compile.
Cambia el nombre de `Random` del paquete `kotlin` a `KRandom`, 
y el de `Random` del paquete `java` a `JRandom`.