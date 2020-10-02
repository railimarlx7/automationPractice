package br.automation.practice.Pages;

import org.openqa.selenium.WebDriver;

import br.automation.practice.basePages.BaseItem;
import br.automation.practice.core.DriveFactory;
import br.automation.practice.core.ObjetosPages;

public class ItemPage extends ObjetosPages {
	DriveFactory driveFactory;
	
	public ItemPage(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

	public static void personalizaCarrinho(String quantidade, String tamanho, String cor) throws InterruptedException {
		BaseItem.entrarFrame();
		BaseItem.selecionarQuantidade(quantidade);
		BaseItem.selecionarTamanho(tamanho);
		BaseItem.selecionarCor(cor);
		BaseItem.adicionarAoCarrinho();
		BaseItem.prosseguirCheckout();
		BaseItem.confirmaCheckout();
	}	
	
	
		
}
