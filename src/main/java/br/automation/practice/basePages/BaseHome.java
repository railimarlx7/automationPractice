package br.automation.practice.basePages;

import org.openqa.selenium.WebDriver;

import br.automation.practice.core.DriveFactory;
import br.automation.practice.core.ObjetosPages;

public class BaseHome extends ObjetosPages {
	DriveFactory driveFactory;

	public BaseHome(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

//	public void getHomePage(String url) {
//		driveFactory.getHomePage(url);
//	}

	public static void pesquisarItem(String item) {
		DriveFactory.getHomePage();
		campoPesquisa.sendKeys(item);
	}
	
	public static void clickPesequisar() {
		botaoSearch.click();
	}

}
