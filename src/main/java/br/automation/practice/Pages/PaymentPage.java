package br.automation.practice.Pages;

import org.openqa.selenium.WebDriver;

import br.automation.practice.basePages.BasePayment;
import br.automation.practice.core.DriveFactory;
import br.automation.practice.core.ObjetosPages;

public class PaymentPage extends ObjetosPages {
	DriveFactory driveFactory;

	public PaymentPage(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

	public static void finalizaCompra(String mensagem) {
		BasePayment.pagarComCartao();
		BasePayment.confirmarPagamento();
		BasePayment.mensagemDeConfirmacao(mensagem);
	}

}
