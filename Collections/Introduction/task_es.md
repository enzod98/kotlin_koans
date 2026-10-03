## Introducción

Esta sección fue inspirada por [GS Collections Kata](https://github.com/goldmansachs/gs-collections-kata).

Kotlin puede mezclarse fácilmente con código Java.
Las colecciones predeterminadas en Kotlin son todas colecciones de Java en el fondo.
Aprenda sobre [vistas de solo lectura y modificables en las colecciones de Java](https://kotlinlang.org/docs/collections-overview.html#collection-types).

La [biblioteca estándar de Kotlin](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/)
contiene muchas funciones de extensión que hacen que trabajar con colecciones sea más conveniente.
Por ejemplo, operaciones que transforman una colección en otra, comenzando con 'to':
[`toSet`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/to-set.html) o
[`toList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/to-list.html).

Implemente la función de extensión `Shop.getSetOfCustomers()`.
La clase `Shop` y todas las clases relacionadas se pueden encontrar en `Shop.kt`.