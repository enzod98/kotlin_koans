## Conversiones inteligentes

Reescribe el siguiente código Java utilizando [conversiones inteligentes](https://kotlinlang.org/docs/typecasts.html#smart-casts) y la expresión [when](https://kotlinlang.org/docs/control-flow.html#when-expression):

```java
public int eval(Expr expr) {
    if (expr instanceof Num) {
        return ((Num) expr).getValue();
    }
    if (expr instanceof Sum) {
        Sum sum = (Sum) expr;
        return eval(sum.getLeft()) + eval(sum.getRight());
    }
    throw new IllegalArgumentException("Expresión desconocida");
}
```