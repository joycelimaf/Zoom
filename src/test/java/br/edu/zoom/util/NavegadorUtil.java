package br.edu.zoom.util;

import org.openqa.selenium.WebDriver;

public class NavegadorUtil extends DriverContext{
	WebDriver driver;
	
	public void abrirUrl(String url)
	{
		driver = DriverContext.getDriver();
		driver.get(url);
		//*
	}
	
	public void fecharNavegador()
	{
		driver = DriverContext.getDriver();
		driver.quit();
		driver = null;
		DriverContext.setDriver(null);
	}
	

}
