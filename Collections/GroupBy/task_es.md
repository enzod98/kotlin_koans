## Agrupar por

Aprende sobre [agrupación](https://kotlinlang.org/docs/collection-grouping.html).
Utiliza
[`groupBy`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/group-by.html)
para implementar la función para construir un mapa que almacena a los clientes que viven en una ciudad determinada.

```kotlin
val resultado = 
    listOf("a", "b", "ba", "ccc", "ad")
        .groupBy { it.length }

resultado == mapOf(
    1 to listOf("a", "b"),
    2 to listOf("ba", "ad"),
    3 to listOf("ccc"))
```