package br.automation.practice.Pages;

import org.openqa.selenium.WebDriver;

import br.automation.practice.basePages.BaseSignIn;
import br.automation.practice.core.DriveFactory;
import br.automation.practice.core.ObjetosPages;

public class SignInPage extends ObjetosPages {
	DriveFactory driveFactory;
	
	public SignInPage(WebDriver driver) {
		super(driver);
		driveFactory = new DriveFactory(driver);
	}

	public static void efetuarLogin(String email, String senha) {
		BaseSignIn.inputEmail(email);
		BaseSignIn.inputSenha(senha);
		BaseSignIn.clickSignIN();
	}	
	
	
		
}
