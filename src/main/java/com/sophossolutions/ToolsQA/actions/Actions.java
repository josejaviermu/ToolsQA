package com.sophossolutions.ToolsQA.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Actions {

    public static void goTo(WebDriver driver, String url){
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    public static void click(WebDriver driver, By target) {
        driver.findElement(target).click();
    }

    public static void write(WebDriver driver,By target, String text){
        driver.findElement(target).clear();
        driver.findElement(target).sendKeys(text);
    }

    public static void select(WebDriver driver, By target, String palabra) {
        Select select = new Select(driver.findElement(target));
        select.selectByVisibleText(palabra);
    }

    public static void autocomplete(WebDriver driver,By target, String text){
        driver.findElement(target).sendKeys(text);
        driver.findElement(target).sendKeys(Keys.ENTER);
    }
}
