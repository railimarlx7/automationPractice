package br.automation.practice.Pages;

import org.openqa.selenium.WebDriver;

import br.automation.practice.basePages.BaseHome;

public class HomePage {
	static WebDriver driver;

	public static void buscaProduto(String item) {
	BaseHome.pesquisarItem(item);
	BaseHome.clickPesequisar();

	}
}
