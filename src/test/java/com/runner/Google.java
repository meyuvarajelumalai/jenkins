package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\elang\\eclipse-workspace\\cucumber\\src\\test\\java\\com\\feature\\google.feature",
glue = "com.Stepdefinition1")
public class Google {
	
	

}
