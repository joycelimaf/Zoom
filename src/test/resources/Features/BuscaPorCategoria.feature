# language: pt
# Autor - Monise Candido
@tag
Funcionalidade: Realizar a busca de um produto por categoria

  @tag1
  Esquema do Cenario: Busca por categoria
    Dado Abro a homepage Zoom
    Quando clico na "<Categoria>"
    E clico em ver todos
    Entao clico no produto desejado "<Produto>"
    E Fecho navegador

    Exemplos: 
      | Categoria | Produto                                                                   |
      | Geladeira | Geladeira Brastemp BRO80AK Frost Free French Door Inverse 540 Litros Inox |
