## Constructores de cadenas de texto y mapas

Los literales de función con receptor son muy útiles para crear constructores, por ejemplo:

```kotlin
fun buildString(build: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.build()
    return stringBuilder.toString()
}

val s = buildString {
    this.append("Números: ")
    for (i in 1..3) {
        // 'this' se puede omitir
        append(i)
    }
}

s == "Números: 123"
```

Implementa la función `buildMutableMap` que toma un parámetro (de tipo de función de extensión), crea un nuevo `HashMap`,
lo construye, y lo devuelve como resultado. Note que a partir de la versión 1.3.70, la biblioteca estándar tiene una función similar `buildMap`.
