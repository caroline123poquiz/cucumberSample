package com.bto.aardviser.selenium.testrunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue="com.bto.aardviser.selenium.stepdefinitions")
public class TestRunner_GoogleHomepage {

	
	
}
