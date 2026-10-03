## Cadenas de texto de triple comilla

Aprenda sobre los [diferentes literales de cadena y plantillas de cadena](https://kotlinlang.org/docs/strings.html#string-literals) en Kotlin. 

Puede utilizar las útiles funciones de la biblioteca 
[`trimIndent`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/trim-indent.html) 
y [`trimMargin`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/trim-margin.html) 
para dar formato a las cadenas de texto de triple comilla multilineales
de acuerdo con el código circundante.

Reemplace la llamada a `trimIndent` con la llamada a `trimMargin` 
tomando `#` como valor de prefijo para que la cadena resultante no contenga 
el carácter de prefijo.