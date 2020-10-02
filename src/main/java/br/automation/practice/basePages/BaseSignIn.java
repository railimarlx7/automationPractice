package br.automation.practice.basePages;

import org.openqa.selenium.WebDriver;

import br.automation.practice.core.DriveFactory;
import br.automation.practice.core.ObjetosPages;

public class BaseSignIn extends ObjetosPages {
	DriveFactory driveFactory;

	public BaseSignIn(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

	public static void inputEmail(String email) {
		campoEmail.sendKeys(email);
	}

	public static void inputSenha(String senha) {
		password.sendKeys(senha);
	}

	public static void clickSignIN() {
		authentication.click();
	}

}
