package Executa;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/features/NovoCliente.feature",
		glue = {"Steps"},
		dryRun = false,
		monochrome = true,
		tags = " @geekoo",
		plugin = {"pretty", "html:target/cucumber-report.html"}
		)

public class Executa {

}
