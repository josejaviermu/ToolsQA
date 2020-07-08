Feature: Registro de formulario para estudiante
  Yo como estudiante de ToolsQA
  Necesito registrarme en el formulario
  Para tener mis datos en la pagina


  Scenario: Registro en formulario
    Given Necesito navegar a "http://demoqa.com/forms"
    When Selecciono el formulario con los datos
##    When Selecciono el formulario con los datos "Fulano","De tal","prueba@correo.com"
    Then Valido los datos
