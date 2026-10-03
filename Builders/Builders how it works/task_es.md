## Constructores: cómo funcionan

Responda a las preguntas a continuación.

**1. En el código Kotlin**

```kotlin
tr {
    td {
        text("Producto")
    }
    td {
        text("Popularidad")
    }
}
```

**`td` es:**

a. una construcción sintáctica incorporada especial

b. una declaración de función

c. una invocación de función

***

**2. En el código Kotlin**

```kotlin
tr (color = "amarillo") {
    td {
        text("Producto")
    }
    td {
        text("Popularidad")
    }
}
```

**`color` es:**

a. una nueva declaración de variable

b. un nombre de argumento

c. un valor de argumento

***

**3. El bloque**

```kotlin
{
    text("Producto")
}
```

**de la pregunta anterior es:**

a. un bloque dentro de la construcción sintáctica incorporada `td`

b. un literal de función (o "lambda")

c. algo misterioso

***

**4. Para el código**

```kotlin
tr (color = "amarillo") {
    this.td {
        text("Producto")
    }
    td {
        text("Popularidad")
    }
}
```

**¿Cuál de las siguientes es verdad?**

a. este código no se compila

b. `this` se refiere a una instancia de una clase externa

c. `this` se refiere a un parámetro receptor TR del literal de función:

```kotlin
tr (color = "amarillo") {
    this@tr.td {
        text("Producto")
    }
}
```