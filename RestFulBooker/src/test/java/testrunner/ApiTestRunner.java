package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/api"},
        glue = {"stepdefinitions/api"},
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)
public class ApiTestRunner extends AbstractTestNGCucumberTests {
}
