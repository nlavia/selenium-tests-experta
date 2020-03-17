package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends UtilityClass {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By searcherLocator = By.id("searchButton");
	By searcherInput = By.id("search-text-header");
	By resultGrid = By.className("grid-items");
	By resultOutput = By.cssSelector(".search-query");

	By cotizaHogarButton = By.linkText("CONOCÉ MÁS");
    By cotizadorLocator = By.cssSelector(".cotizador-home");

	
	
	
	public void searchText() throws InterruptedException {
		click(searcherLocator);
		Thread.sleep(2000);
		if (isDisplayed(searcherInput)) {
			click(searcherInput);
			Thread.sleep(2000);
			type("ART", searcherInput);
			enter(searcherInput);
			Thread.sleep(2000);
		}
		else {
			System.out.print("No se encontro el buscador");
		}
	}
	
	public void resultGridOn() throws InterruptedException {
		if (isDisplayed(resultGrid)) {

		}
		else {
			System.out.print("No se encontro el Grilla");
		} 
	}

	public String resultText() throws InterruptedException {
		if (isDisplayed(resultOutput)) {
	    getText(resultOutput);
	  
		}
		else {
			System.out.print("No se encontro el elemento buscado");
		} return  getText(resultOutput);
	}

	public String clickCotizaHogarButton() throws InterruptedException {
		Thread.sleep(400);
		click(cotizaHogarButton);
		Thread.sleep(2000);
		if (isDisplayed(cotizadorLocator)) {
		
		 
			}
			else {
				System.out.print("No se encontro el elemento");
			} return  "Se mostro el cotizador";
		
		
	}
	
}
