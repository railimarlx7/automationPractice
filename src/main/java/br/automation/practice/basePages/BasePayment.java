package br.automation.practice.basePages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import br.automation.practice.core.DriveFactory;
import br.automation.practice.core.ObjetosPages;

public class BasePayment extends ObjetosPages {
	DriveFactory driveFactory;

	public BasePayment(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}
	
	
	public static void pagarComCartao() {
		payByBankWire.click();
	}	
	
	public static void confirmarPagamento() {
		confirmOrder.click();
	}	
	
	public static void mensagemDeConfirmacao(String mensagem) {
		assertEquals(mensagem, confirmation.getText()); 
		
	}	
}
