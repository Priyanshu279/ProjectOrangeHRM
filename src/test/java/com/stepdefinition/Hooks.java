package com.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import com.utils.DriverClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
@Before
public void setUP() {
	DriverClass.setUpDriver();
}

@After(order = 1)
public void takeScreenshot(Scenario scenario) throws IOException{
	if(scenario.isFailed()) {
		TakesScreenshot ts = (TakesScreenshot) DriverClass.getDriver();
		byte[] scr = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(scr,"image/png","Screenshot");
	}else {
		TakesScreenshot ts = (TakesScreenshot) DriverClass.getDriver();
		byte[] scr = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(scr,"image/png","Screenshot");
	}
}

@After(order = 0)
public void setDown() {
	DriverClass.tearDown();
}

}
