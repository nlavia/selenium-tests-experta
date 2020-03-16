package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultHomePage extends UtilityClass {

	public ResultHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	By searchQuery = By.className("search-query");
	

	
	public String searchResult()  {
		
		findElement(searchQuery);
		return getText(searchQuery);		
		
	}
	
}
