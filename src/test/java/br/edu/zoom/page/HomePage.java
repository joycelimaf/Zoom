package br.edu.zoom.page;

import org.openqa.selenium.By;

public class HomePage {
	
	
	//LOGIN
	public static By botaoEntrar = By.xpath("//*[@class='zbtn zbtn--link login']");
	public static By campoEmail = By.xpath("//*[@class='zicon zi-arrow-right f-lbl']");
	public static By campoEmaildigita = By.xpath("//*[@id=\"z-login\"]/div/input");
	
	public static By confirmaEmail = By.xpath("//*[@class='zicon zi-arrow-right btn-zlogin']");
	

	//public static By campoNome = By.xpath("//*/div/input[2]");
	////*[@id="z-signup"]/div/label
	public static By campoNome = By.xpath("[@id=\"z-signup\"]/div/label");
	public static By botaoConfirmaNome = By.xpath("//*[@class='zbtn zbtn--navigation zbtn--large zbtn--block btn-zsignup active']");
	public static By avatar = By.className("avatar");
	public static By validacao = By.xpath("//*[@id=\"header\"]/div/div[3]/div[1]/span[1]");
	
	//MENU ZOOM
    public static By menubotao= By.xpath ("//button[@data-target=\"menu\"]");

    public static By  eletrodomesticos = By.xpath("//div[@class=\\\"zmenu__dropdown\\\"]/a[contains(text(),'Eletrodomésticos' )]\");");

    public static By geladeira = By.xpath("//*[@id=\"header\"]/div/div[1]/nav/div[2]/div[4]/div/a[5]");//não está usando
    
    public static By geladeiraBras = By.xpath("//*[@id=\"header\"]/div/div[1]/nav/div[2]/div[4]/div/a[6]");
}
