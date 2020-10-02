package br.automation.practice.Pages;

import org.openqa.selenium.WebDriver;

import br.automation.practice.basePages.BaseAddress;
import br.automation.practice.core.DriveFactory;
import br.automation.practice.core.ObjetosPages;

public class AddressPage extends ObjetosPages {
	DriveFactory driveFactory;

	public AddressPage(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

	public static void clicOnProceedCheckout() {
		BaseAddress.checkout();
	}

}
