package br.edu.zoom.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.edu.zoom.util.DriverContext;


public class EscreverAction {
	WebDriver driver;
	
	public EscreverAction() {
		driver = DriverContext.getDriver();
	}
	
	public void escrever(By elemento,String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	

}
