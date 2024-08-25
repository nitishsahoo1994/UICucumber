package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",dryRun = false,
glue="stepDefinitions",monochrome = true,tags = "",plugin = {"pretty","html:target/cuccumber.html"})
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
