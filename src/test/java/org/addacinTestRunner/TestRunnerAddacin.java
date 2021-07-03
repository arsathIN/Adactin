package org.addacinTestRunner;

import org.addacinUserLab.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\AddacinBooking\\AddacinHotel.feature", glue = "org.addacinStepDefinition", dryRun = false, plugin = {
		"pretty", "json:src\\test\\resources\\ReportJvm\\output.json" })
public class TestRunnerAddacin {
	@AfterClass
	public static void jvmReportGeneration() {
		JvmReport.generateJvmReport(System.getProperty("user.dir") + "\\src\\test\\resources\\ReportJvm\\output.json");

	}
}
