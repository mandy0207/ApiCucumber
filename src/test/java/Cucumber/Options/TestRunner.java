package Cucumber.Options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/featureFiles", glue="stepDefinitions", monochrome=true, 
tags="@Smoke")
public class TestRunner extends AbstractTestNGCucumberTests {

	
}
