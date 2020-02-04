# language: pt
# ReSkill Automacao Bdd Selenium Java
# Autor: Leila Aretakis
@loginzoom
Funcionalidade: Login
  Como usuário, faço login no site utilizando meus dados, e valido a autenticação através do  
  avatar que acessa meu menu de cliente.

  Cenario de Fundo: Acessar o site Zoom
    Dado Abro a homepage Zoom

  Esquema do Cenario: Login no site
    #Dado que estou na homepage do site Zoom
    Quando clico no botão entrar
    E preencho o modal com endereço de email "<email>"
    E clico na seta a direita do email
    E preencho o modal com um nome "<nome>"
    E clico no botão de confirmação
    E clico no avatar do usuário
    Então é exibido o avatar do menu do usuário validando o login no site "<z>".

    Exemplos: 
      | email         | nome | z      |
      | zoom1@zoom.com | zoom | avatar |
