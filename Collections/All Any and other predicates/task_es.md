## All, Any y otros predicados

Aprende sobre [probar predicados](https://kotlinlang.org/docs/collection-filtering.html#test-predicates) 
y [recuperar elementos por condición](https://kotlinlang.org/docs/collection-elements.html#retrieve-by-condition).

Implementa las siguientes funciones utilizando
[`all`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/all.html),
[`any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html),
[`count`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/count.html),
[`find`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find.html):

* `checkAllCustomersAreFrom` debería retornar verdadero si todos los clientes son de una ciudad dada
* `hasCustomerFrom` debería revisar si hay al menos un cliente de una ciudad dada
* `countCustomersFrom` debería retornar la cantidad de clientes de una ciudad dada
* `findCustomerFrom` debería retornar un cliente que vive en una ciudad dada, o `null` si no hay ninguno

```kotlin
val numbers = listOf(-1, 0, 2)
val isZero: (Int) -> Boolean = { it == 0 }
numbers.any(isZero) == true
numbers.all(isZero) == false
numbers.count(isZero) == 1
numbers.find { it > 0 } == 2
```