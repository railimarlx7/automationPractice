#language:pt
@CT01
Funcionalidade: Checkout do Carrinho de compras

			Objetivo: Realizar uma compra, finalizar e validar a mensagem de retorno.

  @CT01
  Esquema do Cenário: Realizar checkout de compra.
    Dado navegador aberto na aplicacao web
    Quando pesquiso um item "<item>" e visualizo o resultado
    E preencho os dados do item com quantidade: "<quantidade>", tamanho: "<tamanho>", cor: "<cor>" e adiciono ao carrinho
    E realizo Login com email "<email>" e senha "<senha>"
    Entao realizo o pagamento via cartao de credito e valido a mensagem "<mensagem>"

    Exemplos: 
      | item                        | quantidade | tamanho | cor  | email                | senha                | mensagem                            |
      | Faded Short Sleeve T-shirts |          2 | M       | Blue | automation@globo.com | automation@globo.com | Your order on My Store is complete. |
