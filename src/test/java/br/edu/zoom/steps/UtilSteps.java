package br.edu.zoom.steps;

import br.edu.zoom.util.NavegadorUtil;
import io.cucumber.java8.Pt;

public class UtilSteps implements Pt{
	NavegadorUtil nav = new NavegadorUtil();
	
	public UtilSteps() {
		Dado("Abro a homepage Zoom",()->{
			nav.abrirUrl("https://www.zoom.com.br/");
		});
		
		E("Fecho navegador",()->{
			nav.fecharNavegador();
		});
	}
	
}
