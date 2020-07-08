package com.sophossolutions.ToolsQA.page;

import com.sophossolutions.ToolsQA.actions.Actions;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormsPage extends PageObject {
    //div[@class='element-list collapse show']//li[contains(@class,'btn btn-light')]//*[local-name()='svg']
//    By btnPracticeForm = By.xpath("//div[@class='element-list collapse show']");
//    By btnPracticeForm = By.xpath("//div[@class='element-list collapse show']//li[contains(@class,'btn btn-light')]");
    By btnPracticeForm = By.xpath("//div[@class='element-list collapse show']//li[contains(@class,'btn btn-light')]");
    //By btnPracticeForm = By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li");
    By campoFirstName = By.id("firstName");
    By campoLastName = By.id("lastName");
    By campoEmail = By.id("userEmail");
    By campoMobile = By.id("userNumber");
    By campoAddress = By.id("currentAddress");
    By radioBoton = By.xpath("//label[contains(text(),'Male')]");
    By selectDate = By.id("dateOfBirthInput");
    By selectAnho = By.xpath("//option[contains(text(),'2000')]");
    By selectMes = By.xpath("//option[contains(text(),'July')]");
    By selectDia = By.xpath("//div[@class='react-datepicker__day react-datepicker__day--007']");
    //div[@class='react-datepicker__day react-datepicker__day--031']
    //div[@class='react-datepicker__day react-datepicker__day--007 react-datepicker__day--weekend']
    //div[@class='react-datepicker__day react-datepicker__day--001']
    By checkHobbies = By.xpath("//label[contains(text(),'Sports')]");
    By campoSubjects = By.id("subjectsInput");
    By selectPicture = By.id("uploadPicture");
    By selectState = By.id("react-select-3-input");
    By selectCity = By.id("react-select-4-input");
    By btnSubmit = By.id("submit");
    String nombre = "Fulano";
    String apellido = "De Tal";
    String correo = "prueba@correo.com";
    String ncelular = "3008739463";
    String direccion = "cra 4 # 23 - 76";
    String fechaDeNacimiento = "01 May 2000";
    String tema1 = "maths";
    String tema2 = "physics";
    String rutaImagen = "C:/Users/jose.martinezu/Downloads/image001.jpg";
    String estado = "NCR";
    String city = "Noida";

    public void click() {
        Actions.click(getDriver(),btnPracticeForm);
    }

    public void escribir(String nombre, String apellido, String correo){
        Actions.write(getDriver(),campoFirstName, nombre);
        Actions.write(getDriver(),campoLastName, apellido);
        Actions.write(getDriver(),campoEmail, correo);
    }

    public void escribir(){
        Actions.write(getDriver(),campoFirstName, nombre);
        Actions.write(getDriver(),campoLastName, apellido);
        Actions.write(getDriver(),campoEmail, correo);
        Actions.click(getDriver(),radioBoton);
        Actions.write(getDriver(),campoMobile,ncelular);
        Actions.click(getDriver(),selectDate);
        Actions.click(getDriver(),selectAnho);
        Actions.click(getDriver(),selectMes);
        Actions.click(getDriver(),selectDia);
        Actions.autocomplete(getDriver(),campoSubjects,tema1);
        Actions.autocomplete(getDriver(),campoSubjects,tema2);
        Actions.write(getDriver(),selectPicture,rutaImagen);
        Actions.click(getDriver(),checkHobbies);
        Actions.write(getDriver(),campoAddress,direccion);
        Actions.autocomplete(getDriver(),selectState,estado);
        Actions.autocomplete(getDriver(),selectCity,city);
        Actions.click(getDriver(),btnSubmit);

    }

}
