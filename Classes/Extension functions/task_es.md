## Funciones de extensión

Aprende acerca de las [funciones de extensión](https://kotlinlang.org/docs/extensions.html#extension-functions).
Luego implementa las funciones de extensión `Int.r()` y `Pair.r()` y haz que conviertan `Int` y `Pair` a un `RationalNumber`.

[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/) es una clase definida en la biblioteca estándar:

```kotlin
data class Pair<out A, out B>(
    val first: A,
    val second: B
)
```

<div class="hint">
  En el caso de <code>Int</code>, el denominador es 1.
</div>