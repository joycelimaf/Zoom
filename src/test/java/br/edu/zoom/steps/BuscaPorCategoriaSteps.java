package br.edu.zoom.steps;

import br.edu.zoom.action.MouseAction;
import br.edu.zoom.page.CategoriaPage;
import io.cucumber.java8.Pt;

public class BuscaPorCategoriaSteps implements Pt {
	MouseAction mouse = new MouseAction();
	
	public BuscaPorCategoriaSteps() {
		
		Quando("clico na {string}", (String String) -> {
			mouse.clicarCategoria(String);
		    
		});

		E("clico em ver todos", () -> {
			Thread.sleep(2000);
		    mouse.clicar(CategoriaPage.lnkVerTodos);
		});

		Entao("clico no produto desejado {string}", (String string) -> {
			Thread.sleep(2000);
		    mouse.clicarProduto(string);
		    Thread.sleep(2000);
		});
	}

	
	
	

}
