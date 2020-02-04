package br.edu.zoom.action;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.edu.zoom.page.HomePage;
import br.edu.zoom.page.MenuPage;
import br.edu.zoom.util.DriverContext;

public class ValidacaoAction {
	WebDriver driver;
	
	public ValidacaoAction() {
		driver = DriverContext.getDriver();
		
	}
	
	public void validacaoAvatar(String letraNome,By element) {
		assertEquals(letraNome,driver.findElement(element).getText());
		
	}

	

	public void ValidarMenu(String categoria, By element) {
		assertEquals(categoria, driver.findElement(MenuPage.geladeiraText).getText());
		}
			

	 
	 public void validarProdutoCategoria(String produto,By element) {
		 assertEquals(produto, driver.findElement(element));
	 }

}
