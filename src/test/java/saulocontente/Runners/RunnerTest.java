package saulocontente.runners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src\\test\\java\\saulocontente\\step_definitions\\features\\LoginFeature.feature",
    glue = "saulocontente.step_definitions",
    plugin = {"pretty", "html:target/report-html"},
    snippets = SnippetType.CAMELCASE,
    strict = true,
    dryRun = false
)
public class RunnerTest {
    
}