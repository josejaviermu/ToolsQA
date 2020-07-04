package com.sophossolutions.ToolsQA.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Actions {

    public static void goTo(WebDriver driver, String url){
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    public static void cick(WebDriver driver, By target) {
        driver.findElement(target).click();
    }
}
