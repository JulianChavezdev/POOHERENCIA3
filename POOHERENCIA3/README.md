##Crea las siguientes clases:

Envio, con los siguientes elementos:
Atributos:
codigo (cadena de texto)
destino (cadena de texto)
peso (número decimal)
costeBase (número decimal)
Constructores:
Completo
Vacío
Métodos:
Todos los getters y setters
getCosteTotal() que devuelva el costeBase sin modificaciones
esPesado() que devuelva true si el peso es mayor que 10 kg, y false en caso contrario
toString() que devuelva “Envío <codigo> con destino <destino>”
EnvioNacional, que hereda de Envio, con los siguientes elementos:
Atributos:
iva (número decimal)
Constructores:
Completo
Vacío
Con codigo, destino, peso y costeBase, que ponga iva a 21
Métodos:
Todos los getters y setters
getCosteTotal() que devuelva el costeBase más el IVA
toString() que devuelva “Envío nacional <codigo> con destino <destino>”
EnvioInternacional, que hereda de Envio, con los siguientes elementos:
Atributos:
tasaAduanas (número decimal, representa un porcentaje)
paisDestino (cadena de texto)
Constructores:
Completo
Vacío
Métodos:
Todos los getters y setters
getCosteTotal() que devuelva el costeBase más la tasa de aduanas
toString() que devuelva “Envío internnacional <codigo> con destino <destino> (<paisDestino>)”
EnvioUrgente, que hereda de Envio, con los siguientes elementos:
Atributos:
recargo (número decimal, representa un coste fijo)
Constructores:
Completo
Vacío
Métodos:
Todos los getters y setters
getCosteTotal() que devuelva el costeBase más el recargo
toString() que devuelva “Envío urgente <codigo> con destino <destino>”
