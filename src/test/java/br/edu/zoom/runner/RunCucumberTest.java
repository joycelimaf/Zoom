package br.edu.zoom.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = { "pretty" }, features = "src/test/resources/Features/", 
	glue = "",tags = {"@tag1"}
)

public class RunCucumberTest {

}
