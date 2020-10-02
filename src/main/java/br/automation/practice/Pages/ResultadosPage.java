package br.automation.practice.Pages;

import org.openqa.selenium.WebDriver;

import br.automation.practice.basePages.BaseResultado;
import br.automation.practice.core.DriveFactory;
import br.automation.practice.core.ObjetosPages;

public class ResultadosPage extends ObjetosPages {
	DriveFactory driveFactory;
	
	public ResultadosPage(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

	public static void detalheProduto() {
		BaseResultado.clickProduto();
	}	
	
	
		
}
