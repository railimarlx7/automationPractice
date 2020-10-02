package br.automation.practice.basePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.automation.practice.core.DriveFactory;
import br.automation.practice.core.ObjetosPages;

public class BaseItem extends ObjetosPages {
	DriveFactory driveFactory;

	public BaseItem(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

	public static void entrarFrame() {
		driver.switchTo().frame(0);
	}

	public static void selecionarQuantidade(String quantidade) {
		qtd.clear();
		qtd.sendKeys(quantidade);
	}

	public static void selecionarTamanho(String tamanho) {
		Select tamanhos = new Select(size);
		tamanhos.selectByVisibleText(tamanho);
	}

	public static void selecionarCor(String cor) {
		driver.findElement(By.name(cor)).click();
	}

	public static void adicionarAoCarrinho() throws InterruptedException {
		addToCart.click();
		Thread.sleep(1000);
	}

	@SuppressWarnings("deprecation")
	public static void prosseguirCheckout() {
		wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckout));
		driver.switchTo().activeElement();
		element.click();
	}

	public static void confirmaCheckout() {
		confirmaCheckout.click();
	}

}
