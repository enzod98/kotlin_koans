## Clases de datos

Aprende sobre [clases](https://kotlinlang.org/docs/classes.html),
[propiedades](https://kotlinlang.org/docs/properties.html)
y [clases de datos](https://kotlinlang.org/docs/data-classes.html)
y luego reescribe el siguiente código Java a Kotlin:

```java
public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
```

Después, añade el modificador `data` a la clase resultante. 
El compilador generará algunos métodos útiles para esta clase: `equals`/`hashCode`, `toString`, y algunos otros.