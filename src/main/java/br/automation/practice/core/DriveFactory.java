package br.automation.practice.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriveFactory extends ObjetosPages {

	public DriveFactory() {
		super(setChrome());
	}

	public DriveFactory(WebDriver driver) {
		super(driver);
	}

	public static WebDriver setChrome() {
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		options.addArguments("--headless");
		return new ChromeDriver();
	}

	public static WebDriver getDriver() {

		return driver;
	}

	public static WebDriver getHomePage() {
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		return driver;
	}

	public static void fecharBrowser() {
		driver.quit();
	}

}
