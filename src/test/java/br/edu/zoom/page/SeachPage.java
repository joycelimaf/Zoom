package br.edu.zoom.page;

import org.openqa.selenium.By;

public class SeachPage {

	/////////////////////////////MENU DO LADO DO ZOON//////////////////////////////////
	public static By menubotao= By.xpath("");

	 //MAIS OPÇÕES 
	 public static By todasgeladeirasa= By.xpath ("//*/li[6]/a[2]");
	 //SELEÇÃO DE GELADEIRA
	 public static By geladeira= By.xpath ("//*/li[1]/div[2]");
	 //VALIDAÇÃO
	 public static By validagela= By.xpath("//*[@id=\"productInfo\"]/h1/span");
	 //passar a imagem 
	 public static By botaodireita=By.xpath("//*[@id=\"overview-gallery-nav\"]/span[2]");
	 //botão criar alerta
	 public static By criaralerta = By.xpath("//*[@id=\"price-alert-page2\"]/div/form/div/p[2]/button");
}
