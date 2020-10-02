#automationpractice
Automação com Selenium WebDriver + Junit + Cucumber + Maven

##### Caso de teste: realizar uma compra com sucesso.
	Dado navegador aberto na aplicacao web
    	Quando pesquiso um item "<item>" e visualizo o resultado
    	E preencho os dados do item com quantidade: "<quantidade>", tamanho: "<tamanho>", cor: "<cor>" e adiciono ao carrinho
    	E realizo Login com email "<email>" e senha "<senha>"
    	Entao realizo o pagamento via cartao de credito e valido a mensagem "<mensagem>"

#### Requisitos:
- Java 1.8
- Maven
- Eclipse
- Google Chrome
- Chrome Driver

##### Com Cucumber
Para executar o teste desenvolvido com Selenium Webdriver, JUnit e Cucumber, você deve executar o seguinte arquivo: 'src/test/java/Runs/RunCucumber.java'


#### Evidências
A cada execução do script é gerada uma nova pasta para armazenar os screenshots da execução. Essas pastas são armazenada em na raiz do projeto 'automationpractice'
