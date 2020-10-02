package br.automation.practice.basePages;

import org.openqa.selenium.WebDriver;

import br.automation.practice.core.DriveFactory;
import br.automation.practice.core.ObjetosPages;

public class BaseShipping extends ObjetosPages {
	DriveFactory gem;

	public BaseShipping(WebDriver driver) {
		super(driver);
		gem = new DriveFactory(driver);
	}
	
	public static void aceitarTermos() {
		termos.click();
	}


	public static void processarCarrinho() {
		processCarrier.click();
	}
		
}
