## Argumentos por defecto

Imagina que tienes varias sobrecargas de 'foo()' en Java:

```java
public String foo(String name, int number, boolean toUpperCase) {
    return (toUpperCase ? name.toUpperCase() : name) + number;
}
public String foo(String name, int number) {
    return foo(name, number, false);
}
public String foo(String name, boolean toUpperCase) {
    return foo(name, 42, toUpperCase);
}
public String foo(String name) {
    return foo(name, 42);
}
```

Puedes reemplazar todas estas sobrecargas de Java con una función en Kotlin.
Cambia la declaración de la función `foo` de forma que haga que el código que utiliza `foo` compile.
Usa [argumentos por defecto y nombrados](https://kotlinlang.org/docs/functions.html#default-arguments).