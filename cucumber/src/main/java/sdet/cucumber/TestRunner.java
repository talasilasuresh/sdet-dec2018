package sdet.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@CucumberOptions(features = "Features/VerifyTitle.feature")
//CucumberOptions(features = "Features/Login.feature")
@CucumberOptions(features = "Features/DDT_InvalidLogin.feature")
	public class TestRunner extends AbstractTestNGCucumberTests {
		
	}
	
	

