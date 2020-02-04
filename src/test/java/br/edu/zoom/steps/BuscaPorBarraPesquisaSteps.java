package br.edu.zoom.steps;

import io.cucumber.java8.Pt;

public class BuscaPorBarraPesquisaSteps implements Pt{
	public BuscaPorBarraPesquisaSteps() {
		Dado("que estou na homepage do site Zoom", () -> {
		    // Write code here that turns the phrase above into concrete actions
		    throw new cucumber.api.PendingException();
		});

		Quando("preencho o campo com o produto desejado {string}", (String string) -> {
		    // Write code here that turns the phrase above into concrete actions
		    throw new cucumber.api.PendingException();
		});

		Quando("clico na lupa a direita do campo", () -> {
		    // Write code here that turns the phrase above into concrete actions
		    throw new cucumber.api.PendingException();
		});

		Então("valido a mensagem com o número de resultados encontrados para o produto {string}", (String string) -> {
		    // Write code here that turns the phrase above into concrete actions
		    throw new cucumber.api.PendingException();
		});

		
	
	}

}
