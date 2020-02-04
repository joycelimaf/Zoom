package br.edu.zoom.steps;

import br.edu.zoom.action.EscreverAction;
import br.edu.zoom.action.MouseAction;
import br.edu.zoom.action.ValidacaoAction;
import br.edu.zoom.page.HomePage;
import io.cucumber.java8.Pt;

public class LoginSteps implements Pt {
	MouseAction mouse = new MouseAction();
	EscreverAction escrever = new EscreverAction();
	ValidacaoAction valida = new ValidacaoAction();

	public LoginSteps() {

		Quando("clico no botão entrar", () -> {
			mouse.clicar(HomePage.botaoEntrar);
			 Thread.sleep(2000);

		});
		
		E("preencho o modal com endereço de email {string}", (String email) -> {
			mouse.clicar(HomePage.campoEmail);
			Thread.sleep(2000);
			escrever.escrever(HomePage.campoEmaildigita, email);
			Thread.sleep(2000);

		});

		E("clico na seta a direita do email", () -> {
			mouse.clicar(HomePage.confirmaEmail);
			Thread.sleep(4000);
		});

		E("preencho o modal com um nome {string}", (String nome) -> {
			mouse.clicar(HomePage.campoNome);
			Thread.sleep(2000);
			escrever.escrever(HomePage.campoNome, nome);
			Thread.sleep(2000);
		});

		E("clico no botão de confirmação", () -> {
			mouse.clicar(HomePage.botaoConfirmaNome);
			Thread.sleep(2000);
		});

		E("clico no avatar do usuário", () -> {
			mouse.clicar(HomePage.avatar);
			Thread.sleep(2000);
		});

		Então("é exibido o avatar do menu do usuário validando o login no site {string}.", (String z) -> {
			valida.validacaoAvatar(z, HomePage.validacao);
			Thread.sleep(2000);

		});

	}
}