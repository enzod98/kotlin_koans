## Argumentos nombrados

Haz que la función `joinOptions()` devuelva la lista en formato JSON (por ejemplo, `[a, b, c]`)
especificando solo dos argumentos.

[Los argumentos predeterminados y nombrados](https://kotlinlang.org/docs/functions.html#default-arguments) ayudan a minimizar el número de sobrecargas y mejorar la legibilidad de la invocación de la función.
La función de la biblioteca [`joinToString`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/join-to-string.html)
está declarada con valores predeterminados para los parámetros:

```kotlin
fun joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    /* ... */
): String
```

Se puede llamar en una colección de Strings.