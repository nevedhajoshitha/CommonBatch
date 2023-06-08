package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Goog.feature", glue = "StepDef", plugin = {"pretty","html:target/Cucumber.html"}
		)
public class GoogTest {

}
