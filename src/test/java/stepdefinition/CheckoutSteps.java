package stepdefinition;

import org.openqa.selenium.WebDriver;

import br.automation.practice.Pages.AddressPage;
import br.automation.practice.Pages.HomePage;
import br.automation.practice.Pages.ItemPage;
import br.automation.practice.Pages.PaymentPage;
import br.automation.practice.Pages.ResultadosPage;
import br.automation.practice.Pages.ShippingPage;
import br.automation.practice.Pages.SignInPage;
import br.automation.practice.basePages.BaseHome;
import br.automation.practice.basePages.BaseItem;
import br.automation.practice.basePages.BasePayment;
import br.automation.practice.basePages.BaseSignIn;
import br.automation.practice.core.DriveFactory;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CheckoutSteps {

	static WebDriver driver;

	@SuppressWarnings("unused")
	@Dado("^navegador aberto na aplicacao web$")
	public void navegador_aberto_na_web() throws Throwable {
		DriveFactory driveFactory = new DriveFactory();
		driver = DriveFactory.getHomePage();

	}

	@SuppressWarnings("unused")
	@Quando("^pesquiso um item \"([^\"]*)\" e visualizo o resultado$")
	public void pesquiso_um_item_e_visulaizo_o_resultado(String item) throws Throwable {

		BaseHome home = new BaseHome(driver);
		HomePage.buscaProduto(item);
		ResultadosPage.detalheProduto();
	}

	@SuppressWarnings("unused")
	@Quando("^preencho os dados do item com quantidade: \"([^\"]*)\", tamanho: \"([^\"]*)\", cor: \"([^\"]*)\" e adiciono ao carrinho$")
	public void preencho_os_dados_do_item_com(String quantidade, String tamanho, String cor) throws Throwable {

		BaseItem item = new BaseItem(driver);
		ItemPage.personalizaCarrinho(quantidade, tamanho, cor);

	}

	@SuppressWarnings("unused")
	@E("^realizo Login com email \"([^\"]*)\" e senha \"([^\"]*)\"$")
	public void realizo_Login_com_email_e_senha(String email, String senha) throws Throwable {

		BaseSignIn signin = new BaseSignIn(driver);
		SignInPage.efetuarLogin(email, senha);
		AddressPage.clicOnProceedCheckout();
		ShippingPage.ralizarPagamento();

	}

	@SuppressWarnings("unused")
	@Entao("^realizo o pagamento via cartao de credito e valido a mensagem \"([^\"]*)\"$")
	public void valido_a_mensagem(String mensagem) throws Throwable {
		
		BasePayment bp = new BasePayment(driver);
		PaymentPage.finalizaCompra(mensagem);
	}

}
