package com.e2etestsautomation;

import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	 features = {"src/spec/features"},
	 plugin = {"pretty", "html:target/cucumber-report.html"}, 
	 tags = (" @outline"),
	 monochrome = true ,
	 snippets = CAMELCASE
)
public class RunWebSuiteTest {
	

}
