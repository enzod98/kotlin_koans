## FlatMap

Aprende sobre [aplanamiento](https://kotlinlang.org/docs/collection-transformations.html#flatten)
e implementa dos funciones utilizando
[`flatMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/flat-map.html):

* La primera debería devolver todos los productos que el cliente dado ha ordenado
* La segunda debería devolver todos los productos que al menos un cliente ordenó

```kotlin
val resultado = listOf("abc", "12")
    .flatMap { it.toList() }

resultado == listOf('a', 'b', 'c', '1', '2')
```