package RunnerClass;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.CommonLibraries;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = { "Features/Newtours.feature" },
		glue = { "StepDefinition","Utilities", "RunnerClass"},
		 tags ="@TestScenarioMultiple",// "@TestSceanrio", //"@Test11",
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	/**
	 **********************************************************************
	 * @MethodName : createReporterfolder()
	 * @Description : This function is used to set report path
	 ***********************************************************************
	 */
	@BeforeTest
	public void createReporterfolder()
	{
	CommonLibraries.createReport();
	}

	

}
