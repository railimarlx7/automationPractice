package br.automation.practice.basePages;

import org.openqa.selenium.WebDriver;

import br.automation.practice.core.DriveFactory;
import br.automation.practice.core.ObjetosPages;

public class BaseAddress extends ObjetosPages {
	DriveFactory driveFactory;

	public BaseAddress(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

	public static void checkout() {
		continuaCheckout.click();
	}

}
