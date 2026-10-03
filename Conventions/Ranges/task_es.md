## Rangos

Utilizando [rangos](https://kotlinlang.org/docs/ranges.html)
implementa una función que verifique si la fecha está en el rango
entre la primera fecha y la última fecha (inclusive).

Puedes crear un rango de cualquier elemento comparable.
En Kotlin, las comprobaciones [`in`](https://kotlinlang.org/docs/operator-overloading.html#in-operator)
se traducen a las correspondientes llamadas `contains`
y [`..`](https://kotlinlang.org/docs/operator-overloading.html#arithmetic-operators)
a las llamadas `rangeTo`:

```kotlin
val lista = listOf("a", "b")
"a" in lista  // lista.contains("a")
"a" !in lista // !lista.contains("a")

fecha1..fecha2 // fecha1.rangeTo(fecha2)
```
Por lo tanto, asegúrate de que la fecha se encuentre en el rango entre la primera y la última fecha.