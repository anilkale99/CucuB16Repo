package com.b15demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	
		features = {"src/test/resources/com/b15demo/"},
		glue={"com/b15demo/"}
		
		
		)



public class RuncucumberPathStepDefsTest {
}