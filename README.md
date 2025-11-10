# Ejercicio de Herencia: Sistema de Envíos

El objetivo es modelar una jerarquía de clases en Programación Orientada a Objetos para gestionar diferentes tipos de envíos. Se define una clase base `Envio` y varias clases derivadas que especializan su comportamiento.

[Image of class hierarchy diagram for Envio, EnvioNacional, EnvioInternacional, and EnvioUrgente]

---

## 1. Clase Base: `Envio`

Representa un envío genérico. Es la clase "madre" de todas las demás. No la líes.

### Atributos
* `codigo` (String)
* `destino` (String)
* `peso` (double)
* `costeBase` (double)

### Constructores
* **Completo**: Recibe todos los atributos como parámetros.
* **Vacío**: Inicializa el objeto con valores por defecto.

### Métodos
* Todos los **getters y setters** para los atributos.
* `getCosteTotal()`: Devuelve simplemente el `costeBase`.
* `esPesado()`: Devuelve `true` si el `peso