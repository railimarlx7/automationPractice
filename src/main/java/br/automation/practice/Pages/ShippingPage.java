package br.automation.practice.Pages;

import org.openqa.selenium.WebDriver;

import br.automation.practice.basePages.BaseShipping;
import br.automation.practice.core.DriveFactory;
import br.automation.practice.core.ObjetosPages;

public class ShippingPage extends ObjetosPages {
	DriveFactory driveFactory;

	public ShippingPage(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

	public static void ralizarPagamento() {
		BaseShipping.aceitarTermos();
		BaseShipping.processarCarrinho();
	}

}
