package br.automation.practice.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import br.automation.practice.core.DriveFactory;
import br.automation.practice.core.Log;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = { "@CT01" }, 
		features = "src/test/features", 
		glue = { "stepdefinition", "hooks" }, 
		plugin = {"pretty"},
		monochrome = true, 
		snippets = SnippetType.CAMELCASE, 
		dryRun = false, 
		strict = true)
public class RunCucumber {

	@AfterClass
	public static void finalizaTest() throws IOException {
		Log.screenshot();
		DriveFactory.fecharBrowser();
	}

}
