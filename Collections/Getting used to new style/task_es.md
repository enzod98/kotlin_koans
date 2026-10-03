## Acostumbrándose al nuevo estilo

Podemos reescribir y simplificar el siguiente código utilizando lambdas y operaciones en las colecciones.
Completamos los vacíos en `doSomethingWithCollection`,
la versión simplificada de la función `doSomethingWithCollectionOldStyle`,
para que su comportamiento permanezca igual y no se modifique de ninguna manera.

```kotlin
fun doSomethingWithCollectionOldStyle(
    collection: Collection<String>
): Collection<String>? {
    val groupsByLength = mutableMapOf<Int, MutableList<String>>()
    for (s in collection) {
        var strings: MutableList<String>? = groupsByLength[s.length]
        if (strings == null) {
            strings = mutableListOf()
            groupsByLength[s.length] = strings
        }
        strings.add(s)
    }

    var maximumSizeOfGroup = 0
    for (group in groupsByLength.values) {
        if (group.size > maximumSizeOfGroup) {
            maximumSizeOfGroup = group.size
        }
    }

    for (group in groupsByLength.values) {
        if (group.size == maximumSizeOfGroup) {
            return group
        }
    }
    return null
}
```