## Plantillas de cadenas

Las cadenas entre comillas triples no solo son útiles para las cadenas multilínea, sino también
para crear patrones regex, ya que no necesitas escapar una barra invertida con una barra invertida.

El siguiente patrón coincide con una fecha en el formato `13.06.1992`
(dos dígitos, un punto, dos dígitos, un punto, cuatro dígitos):

```kotlin
fun getPattern() = """\d{2}\.\d{2}\.\d{4}"""
```

Usando la variable `month`, reescribe este patrón de tal manera que coincida con la fecha en el formato `13 JUN 1992`
(dos dígitos, un espacio en blanco, una abreviatura de mes, un espacio en blanco, cuatro dígitos).