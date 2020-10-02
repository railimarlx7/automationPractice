package br.automation.practice.core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Log {
		
	public static void screenshot() throws IOException{	
		TakesScreenshot ss =  (TakesScreenshot) DriveFactory.getDriver();
		File log = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(log,  new File("Log/screenshot.jpg"));
	}
	
}