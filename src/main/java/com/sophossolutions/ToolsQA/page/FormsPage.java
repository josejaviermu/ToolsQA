package com.sophossolutions.ToolsQA.page;

import com.sophossolutions.ToolsQA.actions.Actions;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormsPage extends PageObject {

    By btnPracticeForm = By.id("item-0");

    public void click() {
        Actions.cick(getDriver(),btnPracticeForm);
    }
}
