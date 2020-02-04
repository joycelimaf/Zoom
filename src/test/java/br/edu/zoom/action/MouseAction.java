package br.edu.zoom.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.edu.zoom.util.DriverContext;

public class MouseAction {
	WebDriver driver;

	public MouseAction() {
		driver = DriverContext.getDriver();
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}
	
	public void clicarCategoria(String categoria) {
		String xpath = "//nav[@class='h-hotlinks']//a[contains(text(),'"+categoria+"')]";
		driver.findElement(By.xpath(xpath)).click();
		
	}
	
	public void clicarProduto(String produto) {
		String xpath = "//h1[@class='prod-name']//a[contains(text(),'"+produto+"')]";
		driver.findElement(By.xpath(xpath)).click();
		
		
	}

}
