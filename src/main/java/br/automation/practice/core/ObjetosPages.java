package br.automation.practice.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class ObjetosPages {
	protected static WebDriver driver;
	protected static WebDriverWait wait;

	public ObjetosPages(WebDriver driver) {
		ObjetosPages.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Elementos HomePage
	@FindBy(id = "search_query_top")
	@CacheLookup
	protected static WebElement campoPesquisa;

	@FindBy(name = "submit_search")
	@CacheLookup
	protected static WebElement botaoSearch;

	// Elementos ResultadosPage
	@FindBy(css = "[title='Faded Short Sleeve T-shirts']")
	@CacheLookup
	public static WebElement produto;

	// Elementos ItemPage
	@FindBy(css = "#quantity_wanted")
	@CacheLookup
	public static WebElement qtd;

	@FindBy(id = "group_1")
	@CacheLookup
	public static WebElement size;

	@FindBy(name = "Submit")
	@CacheLookup
	public static WebElement addToCart;

	@FindBy(css = "a.btn.btn-default.button.button-medium")
	@CacheLookup
	public static WebElement proceedToCheckout;

	@FindBy(css = "a.button.btn.btn-default.standard-checkout.button-medium")
	@CacheLookup
	public static WebElement confirmaCheckout;

	// Elementos SigInPage
	@FindBy(id = "email")
	@CacheLookup
	public static WebElement campoEmail;

	@FindBy(id = "passwd")
	@CacheLookup
	public static WebElement password;

	@FindBy(id = "SubmitLogin")
	@CacheLookup
	public static WebElement authentication;
	// Elementos AdressPage
	@FindBy(css = "p > button > span")
	@CacheLookup
	public static WebElement continuaCheckout;

	// Elementos ShippingPage
	@FindBy(id = "cgv")
	@CacheLookup
	public static WebElement termos;

	@FindBy(name = "processCarrier")
	@CacheLookup
	public static WebElement processCarrier;

	// Elementos ShippingPage
	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	@CacheLookup
	public static WebElement payByBankWire;

	@FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
	@CacheLookup
	public static WebElement confirmOrder;

	@FindBy(css = "div > p > strong")
	@CacheLookup
	public static WebElement confirmation;

}
