package br.edu.zoom.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverContext {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\WEB_DRIVERS\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		} else {
			return driver;
		}
	}

	public static void setDriver(WebDriver driver) {
		DriverContext.driver = driver;
	}

}
