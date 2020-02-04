package br.edu.zoom.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import br.edu.zoom.util.DriverContext;

public class MouseOverAction {
	WebDriver driver;
	
	public MouseOverAction() {
		driver = DriverContext.getDriver();
	}
	  public void mouseOuver(By elemento){
			WebElement objetoParaPassarOmouse = driver.findElement(elemento);
			//Create object 'action' of an Actions class
			Actions actions = new Actions(driver);
			//To mouseover on main menu
			actions.moveToElement(objetoParaPassarOmouse).perform();
		  
	  }

}
