## Máximo mínimo

Aprenda acerca de las [operaciones de agregación de colecciones](https://kotlinlang.org/docs/collection-aggregate.html).

Implemente dos funciones:

* La primera debería devolver el cliente que ha realizado la mayor cantidad de pedidos en esta tienda.
* La segunda debería devolver el producto más caro que el cliente dado ha pedido.

Las funciones 
[`maxOrNull`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/max-or-null.html),
[`minOrNull`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/min-or-null.html),
[`maxByOrNull`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/max-by-or-null.html), y
[`minByOrNull`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/min-by-or-null.html)
pueden ser útiles.

```kotlin
listOf(1, 42, 4).maxOrNull() == 42
listOf("a", "ab").minByOrNull(String::length) == "a"
```

Puede usar [referencias invocables](https://kotlinlang.org/docs/lambdas.html#instantiating-a-function-type)
en lugar de lambdas. Puede ser especialmente útil en cadenas de llamadas, donde
`it` ocurre en diferentes lambdas y tiene diferentes tipos.
Implemente la función `getMostExpensiveProductBy` usando referencias invocables.