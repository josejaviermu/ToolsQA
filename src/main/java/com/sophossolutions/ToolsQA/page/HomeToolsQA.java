package com.sophossolutions.ToolsQA.page;

import com.sophossolutions.ToolsQA.actions.Actions;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeToolsQA extends PageObject {

//    By divForms = By.xpath("//body/div/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[2]/div[1]");
    By divForms = By.xpath("//*[@id='app']/div/div/div[2]/div/div[2]/div/div[2]/svg");

    public void irA(String paginaWeb) {
        Actions.goTo(getDriver(),paginaWeb);
    }

    public void click(){
        Actions.click(getDriver(),divForms);
    }
}
