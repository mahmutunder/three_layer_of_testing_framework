package com.threeLayerOfTesting.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * This class servers only for fail test cases.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/threeLayerOfTesting/steps"

)
public class FailedTestRunner {
}
