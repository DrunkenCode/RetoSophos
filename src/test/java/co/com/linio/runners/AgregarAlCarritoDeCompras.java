package co.com.linio.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/AgregarAlCarritoDeCompras.feature",
        glue = "co.com.linio.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class AgregarAlCarritoDeCompras {

}
