## Ordenar

Aprende acerca de
[la ordenación de colecciones](https://kotlinlang.org/docs/collection-ordering.html)
y 
[la diferencia](https://kotlinlang.org/docs/collection-operations.html#write-operations)
entre las operaciones en el lugar en las colecciones mutables y las operaciones que retornan nuevas colecciones.

Implementa una función para retornar la lista de clientes,
ordenados en forma descendente por el número de pedidos que han hecho.
Usa
[`sortedDescending`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sorted-descending.html) o 
[`sortedByDescending`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sorted-by-descending.html).

```kotlin
val strings = listOf("bbb", "a", "cc")
strings.sorted() ==
        listOf("a", "bbb", "cc")

strings.sortedBy { it.length } ==
        listOf("a", "cc", "bbb")

strings.sortedDescending() ==
        listOf("cc", "bbb", "a")

strings.sortedByDescending { it.length } ==
        listOf("bbb", "cc", "a")
```
