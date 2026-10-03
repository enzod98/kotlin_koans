## Asociar

Aprende sobre [asociación](https://kotlinlang.org/docs/collection-transformations.html#associate).
Implementa las siguientes funciones usando
[`associateBy`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/associate-by.html),
[`associateWith`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/associate-with.html), 
y [`associate`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/associate.html):

* Construye un mapa del nombre del cliente al cliente
* Construye un mapa del cliente a su ciudad 
* Construye un mapa del nombre del cliente a su ciudad

```kotlin
val list = listOf("abc", "cdef")

list.associateBy { it.first() } == 
        mapOf('a' to "abc", 'c' to "cdef")

list.associateWith { it.length } == 
        mapOf("abc" to 3, "cdef" to 4)

list.associate { it.first() to it.length } == 
        mapOf('a' to 3, 'c' to 4)
```