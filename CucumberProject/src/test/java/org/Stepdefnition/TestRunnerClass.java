package org.Stepdefnition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue = "org.Stepdefnition",
monochrome = true, 
dryRun = false, 
snippets = SnippetType.CAMELCASE,
strict = false,
plugin = {"html:Report" ,"junit:Report\\junitreport.xml" , "json:Report\\jsonreport.json", "pretty"})
public class TestRunnerClass {

}
