## Partición

Aprenda sobre [partición](https://kotlinlang.org/docs/collection-filtering.html#partition) 
y la sintaxis de [declaración de desestructuración](https://kotlinlang.org/docs/destructuring-declarations.html)
que a menudo se usa junto con `partition`.

Luego implemente una función para devolver clientes que tienen más pedidos no entregados 
que pedidos entregados usando 
[`partition`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/partition.html).

```kotlin
val numbers = listOf(1, 3, -4, 2, -11)
val (positive, negative) =
    numbers.partition { it > 0 }

positive == listOf(1, 3, 2)
negative == listOf(-4, -11)
```