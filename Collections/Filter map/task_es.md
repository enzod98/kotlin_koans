## Filtro; mapa

Aprende sobre [mapeo](https://kotlinlang.org/docs/collection-transformations.html#map) y 
[filtrado](https://kotlinlang.org/docs/collection-filtering.html#filter-by-predicate) de una colección.

Implementa las siguientes funciones de extensión
utilizando las
funciones [`map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/map.html) y
[`filter`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter.html):

* Encuentra todas las diferentes ciudades de las que provienen los clientes
* Encuentra a los clientes que viven en una ciudad dada

```kotlin
val numbers = listOf(1, -1, 2)
numbers.filter { it > 0 } == listOf(1, 2)
numbers.map { it * it } == listOf(1, 1, 4)
```