package com.sophossolutions.ToolsQA.stepdefinitions;

import com.sophossolutions.ToolsQA.page.FormsPage;
import com.sophossolutions.ToolsQA.page.HomeToolsQA;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ToolsQAStepDefinitions {

    HomeToolsQA home;
    FormsPage forms;

    @Given("^Necesito navegar a \"([^\"]*)\"$")
    public void necesitoNavegarA(String url) {
        home.irA(url);
    }


    @When("^Selecciono el formulario con los datos$")
    public void seleccionoElFormularioConLosDatos() {
//    @When("^Selecciono el formulario con los datos \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
//    public void seleccionoElFormularioConLosDatos(String nombre, String apellido, String correo) throws InterruptedException {
//        home.click();
        forms.click();
//        forms.escribir(nombre,apellido,correo);
        forms.escribir();
//        Thread.sleep(7000);
    }

    @Then("^Valido los datos$")
    public void validoLosDatos() {

    }

}
