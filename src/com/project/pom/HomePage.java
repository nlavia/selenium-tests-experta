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

	
	public void searchText() throws InterruptedException {
		click(searcherLocator);
		Thread.sleep(2000);
		if (isDisplayed(searcherInput)) {
			click(searcherInput);
			Thread.sleep(2000);
			type("ART", searcherInput);
			enter(searcherInput);
		}
		else {
			System.out.print("No se encontro el elemento");
		}
	}

	
}
