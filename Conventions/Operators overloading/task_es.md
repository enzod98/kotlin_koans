## Sobrecarga de operadores

Implementa la aritmética de fechas y el soporte para añadir años, semanas y días a una fecha.
Podrías escribir el código de esta manera: `date + YEAR * 2 + WEEK * 3 + DAY * 15`.

Primero, añade la función de extensión `plus()` a `MyDate`, tomando `TimeInterval` como argumento.
Utiliza la función de utilidad `MyDate.addTimeIntervals()` declarada en
`DateUtil.kt`

Luego, intenta dar soporte para añadir varios intervalos de tiempo a una fecha.
Es posible que necesites una clase extra.