package com.project.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {

	private WebDriver driver;

	public UtilityClass(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver chromeWebDriverConnection() {

		
	// Metodo para setear las propiedades usando el Chromedriver.exe
	//	System.setProperty("webdriver.chrome.driver", ".\\src\\tests\\resources\\chromedriver\\chromedriver.exe" );
		
	
	//Metodo para setear las propiedades usando las librerias de webdriverManager
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;

	}

	// Wrap de los metodos de Basicos de Selenium

	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}

	public List<WebElement> findElements(By locator) {
		return driver.findElements(locator);
	}

	public String getText(WebElement element) {
		return element.getText();
	}

	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}

	public void actionMove(WebElement element) {
		Actions builder = new Actions(driver);
		builder.moveToElement(element, 0, 0).perform();
	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}

	public void enter(By locator) {
		driver.findElement(locator).sendKeys(Keys.ENTER);
		;
	}

	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public void visit(String url) {
		driver.get(url);
	}

}
