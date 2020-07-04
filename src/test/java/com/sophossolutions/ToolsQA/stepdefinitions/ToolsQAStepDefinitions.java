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


    @When("^Selecciono el formulario$")
    public void seleccionoElFormulario() throws InterruptedException {
        home.click();
        forms.click();
        Thread.sleep(2000);
    }

    @Then("^Valido los datos$")
    public void validoLosDatos() {

    }

}
