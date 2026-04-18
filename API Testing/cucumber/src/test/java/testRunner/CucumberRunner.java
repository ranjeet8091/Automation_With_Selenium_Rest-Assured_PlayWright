package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// 
//@CucumberOptions(features = "src/test/java/features",dryRun = true,
//glue = "stepDefinitions" , monochrome = true,
//plugin = {"pretty" , "html: target/cucumber.html" , "json: target/cucumber.json"})
//public class CucumberRunner extends AbstractTestNGCucumberTests{
//	
//
//}


@CucumberOptions(features = "src/test/java/features",dryRun = true,
glue = "stepDefinitions" , monochrome = true,
plugin = {"pretty" , "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})
public class CucumberRunner extends AbstractTestNGCucumberTests{
	

}
