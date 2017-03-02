package com.learnselenium.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options( format = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json"}, 
features = "src/main/java/FeatureFiles/" ,
glue = "com.learnselenium.cucumber"
		
		) 

/*@Cucumber.Options(
		format = { "pretty", "html:target/cucumber" } ,
        features= {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json"}
        )*/


public class runTest {
}