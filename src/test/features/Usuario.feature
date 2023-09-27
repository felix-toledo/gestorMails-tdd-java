Feature: Creacion del usurio.

  Scenario: Usuario se inicializa.
    Given existe la clase usuario.
    When se crea una nueva instancia usuario.
    Then tenemos un usuario nuevo, con nombre, apellido, y su respectivo correo.

  Scenario: Usuario se inicializa y se guarda en una lista de usuarios del gestor de mails.
    Given existe la clase usuario Y existe la clase gestor de mails.
    When se crea una nueva instancia de usuario.
    Then se tiene que guardar en una lista de usuarios del gestor de mails.
