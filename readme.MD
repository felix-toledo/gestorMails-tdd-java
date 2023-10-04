Desarrollo TDD: El sistema debe ser desarrollado siguiendo la metodología de Desarrollo Dirigido por Pruebas (TDD).

[![Java CI with Maven](https://github.com/felix-toledo/gestorMails-tdd-java/actions/workflows/maven.yml/badge.svg)](https://github.com/felix-toledo/gestorMails-tdd-java/actions/workflows/maven.yml)

#Un usuario debe poder crear un correo electrónico.
[]Los correos electrónicos deben tener las siguientes propiedades: Asunto, Contenido, Remitente (un solo contacto) y Para (múltiples contactos).

#Envío de Correos Electrónicos:
[]Un usuario puede enviar un correo a múltiples contactos al especificar varios destinatarios en el campo "Para".
[]Cuando un usuario envía un correo, este debe ser almacenado en la Bandeja de Enviados del emisor y la de recibidos del remitente.

#Contacto:
[]Un "Contacto" es un objeto que contiene información de Nombre de la persona y Email de dicha persona. Se utiliza para especificar el remitente o los destinatarios en el campo "Para".

#Filtros:
[]Los usuarios deben poder crear filtros para organizar sus correos electrónicos.
[]Los filtros son carpetas que no contienen correos, sino que filtran correos en base a elementos del email, como parte del asunto, parte del contenido, remitente o destinatarios en el campo "Para".
[]Los filtros deben tener un nombre descriptivo, como "Correos de la UCP".
[]Los filtros deben ser capaces de buscar correos que hayan sido enviados por un email con un dominio específico, como "@ucp.edu.ar".
[]La aplicación debe ser capaz de gestionar al menos 5 filtros.
[]De estos 5 filtros, al menos 2 o 3 de ellos deben ser complejos, es decir, deben poder buscar correos en función de 2 o más campos simultáneamente (por ejemplo, asunto y remitente).

#Búsqueda de Correos:
[]Los usuarios pueden buscar correos en la bandeja de entrada.
[]La búsqueda debe permitir buscar correos por texto en cualquiera de los campos de los correos electrónicos, como asunto, contenido, remitente o destinatarios en el campo "Para".


#Creación de Usuario:
[]La aplicación debe permitir que los usuarios se registren y creen cuentas de usuario.
[]Para crear un usuario, se deben recopilar y almacenar información básica, como nombre, apellido y dirección de correo electrónico.
[]Cada usuario debe tener su propio espacio de trabajo y bandeja de entrada privada para gestionar sus correos electrónicos y filtros personalizados.
