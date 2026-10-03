## Invocar

Los objetos con el método [`invoke()`](https://kotlinlang.org/docs/operator-overloading.html#invoke-operator) pueden ser invocados como una función.

Se puede agregar una extensión `invoke` para cualquier clase, pero es mejor no abusar de ella:

```kotlin
operator fun Int.invoke() { println(this) }

1() // ¿eh?..
```

Implemente la función `Invokable.invoke()` para contar el número de veces que se invoca.