package org.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Lenovo\\eclipse-workspace\\Addactin\\src\\test\\resources\\addact.feature",glue="org.stepdefinition")
public class TestRunner {

	
}
