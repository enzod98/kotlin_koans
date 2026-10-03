## Tipo Nothing

El [tipo Nothing](https://kotlinlang.org/docs/exceptions.html#the-nothing-type) puede usarse como tipo de retorno para una función que siempre arroja una excepción. Cuando llamas a una función de este tipo, el compilador utiliza la información de que la ejecución no continúa más allá de la función.

Especifica el tipo de retorno `Nothing` para la función `failWithWrongAge`. Ten en cuenta que sin el tipo `Nothing`, la función `checkAge` no se compila porque el compilador asume que la `edad` puede ser `null`.