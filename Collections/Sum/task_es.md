## Suma

Implementa una función que calcule el total de dinero que el cliente ha gastado: 
la suma de los precios de todos los productos ordenados por un cliente específico.
Tenga en cuenta que cada producto debería ser contado tantas veces como fue ordenado.

Utiliza
[`sum`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sum.html) en una colección de números o 
[`sumOf`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sum-of.html) para convertir los elementos a números
primero y luego sumarlos.

```kotlin
listOf(1, 5, 3).sum() == 9
listOf("a", "b", "cc").sumOf { it.length } == 4
```
