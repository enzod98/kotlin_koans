## Bucle For

Un [bucle for](https://kotlinlang.org/docs/control-flow.html#for-loops) de Kotlin 
puede iterar a través de cualquier objeto si el miembro `iterator` correspondiente o la función de extensión está disponible.

Haz que la clase `DateRange` implemente [`Iterable<MyDate>`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/),
para que pueda ser iterada.
Utiliza la función `MyDate.followingDate()` definida en `DateUtil.kt`;
no tienes que implementar la lógica para encontrar la siguiente fecha por tu cuenta.

Emplea una [expresión de objeto](https://kotlinlang.org/docs/object-declarations.html#object-expressions)
que desempeña el mismo papel en Kotlin que una clase anónima en Java.