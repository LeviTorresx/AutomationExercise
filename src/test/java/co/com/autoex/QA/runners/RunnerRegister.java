package co.com.autoex.QA.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "co.com.autoex.QA.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerRegister {}