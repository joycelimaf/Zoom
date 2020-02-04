# language: pt
# ReSkill Automacao Bdd Selenium Java
# Autor: Larissa Moura

@buscabarradepesquisa
Funcionalidade: Busca pela barra de pesquisa
  Na homepage do site Zoom, faço uma busca descritiva utilizando a barra de pesquisa.
  
  Cenario de Fundo: Acessar o site Zoom
    Dado Abro a homepage Zoom

  Esquema do Cenario: Login no site
    Dado que estou na homepage do site Zoom
    Quando preencho o campo com o produto desejado "<search>"
    E clico na lupa a direita do campo
    Então valido a mensagem com o número de resultados encontrados para o produto "<produto>"
 
    Exemplos: 
      | email         | produto 			|
      | iphone 11 pro | iphone 11 pro |
