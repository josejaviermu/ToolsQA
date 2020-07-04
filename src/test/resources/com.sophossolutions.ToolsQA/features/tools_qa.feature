Feature: Registro de formulario para estudiante
  Yo como estudiante de ToolsQA
  Necesito registrarme en el formulario
  Para tener mis datos en la pagina


  Scenario: Registro en formulario
    Given Necesito navegar a "http://demoqa.com/"
    When Selecciono el formulario
    Then Valido los datos
