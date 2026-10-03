## Fold y reduce

Aprende sobre [fold y reduce](https://kotlinlang.org/docs/collection-aggregate.html#fold-and-reduce)
y [operaciones específicas de conjuntos](https://kotlinlang.org/docs/set-operations.html)
e implementa una función que devuelve el conjunto de productos que todos los clientes pidieron (una **intersección** de productos comprados por todos los clientes) utilizando [`reduce`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reduce.html).

Puedes usar la función `Customer.getOrderedProducts()` definida en la tarea anterior (copia su implementación).

```kotlin
listOf(1, 2, 3, 4)
        .fold(1) { partProduct, element ->
            element * partProduct
        } == 24
```
<div class="hint">

También podrías necesitar la función 
[intersect](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/intersect.html).
</div>