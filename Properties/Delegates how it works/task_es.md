## Delegados

Puede declarar sus propios [delegados](https://kotlinlang.org/docs/delegated-properties.html#property-delegate-requirements).
Implemente los métodos de la clase `EffectiveDate` para que pueda delegar en ella.
Almacene solo el tiempo en milisegundos en la propiedad `timeInMillis`.

Use las funciones de extensión `MyDate.toMillis()` y `Long.toDate()`, definidas en
`MyDate.kt`.