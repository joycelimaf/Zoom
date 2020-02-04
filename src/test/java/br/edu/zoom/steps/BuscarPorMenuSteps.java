package br.edu.zoom.steps;
import br.edu.zoom.action.MouseAction;
import br.edu.zoom.action.MouseOverAction;
import br.edu.zoom.action.ValidacaoAction;
import br.edu.zoom.page.HomePage;
import br.edu.zoom.page.MenuPage;
import io.cucumber.java8.Pt;

public class BuscarPorMenuSteps implements Pt {
	MouseOverAction menu = new MouseOverAction();
	ValidacaoAction acaoMenu = new ValidacaoAction();
	MouseAction menuClick = new MouseAction();

	public BuscarPorMenuSteps() {
		Dado("passar o mouseover no menu", () -> {
			menu.mouseOuver(HomePage.menubotao);
		});

		E("selecionar a {string}", (String string) -> {
		    menu.mouseOuver(HomePage.eletrodomesticos);
		});

		E("selecionar no submenu lateral o {string}", (String string) -> {
		   menuClick.clicar(HomePage.geladeiraBras);
		   Thread.sleep(2000);
		});

		Entao("valido a busca do resultado exibido {string}", (String string) -> {
		   Thread.sleep(2000);
		   acaoMenu.ValidarMenu("Geladeira", MenuPage.geladeiraText);
		   
		});
	}

}




