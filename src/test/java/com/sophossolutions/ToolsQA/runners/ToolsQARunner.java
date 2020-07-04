package com.sophossolutions.ToolsQA.runners;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com.sophossolutions.ToolsQA/features/tools_qa.feature",
        glue = "com.sophossolutions.ToolsQA.stepdefinitions",
        snippets = SnippetType.CAMELCASE,

        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:target/reports/html/",
                "junit:target/reports/junit/allcukes.xml",
                "json:target/reports/cukes.json" }

)

public class ToolsQARunner {
}
