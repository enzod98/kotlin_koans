## Tipos anulables

Aprende sobre 
[seguridad de nulos y llamadas seguras](https://kotlinlang.org/docs/null-safety.html)
en Kotlin y reescribe el siguiente código Java para que solo tenga una expresión `if`:

```java
public void enviarMensajeACliente(
    @Nullable Cliente cliente,
    @Nullable String mensaje,
    @NotNull EnviadorCorreo enviadorCorreo
) {
    if (cliente == null || mensaje == null) return;

    InformacionPersonal informacionPersonal = cliente.getInformacionPersonal();
    if (informacionPersonal == null) return;

    String correo = informacionPersonal.getCorreo();
    if (correo == null) return;

    enviadorCorreo.enviarMensaje(correo, mensaje);
}
```