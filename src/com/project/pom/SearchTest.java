package com.project.pom;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class SearchTest {

	
	private WebDriver driver;
	HomePage  homePage;
	ResultHomePage resultHomePage;
	
	
	@BeforeEach
	public void setUp() throws Exception {
		homePage = new HomePage(driver);
		resultHomePage = new ResultHomePage(driver);
		driver = homePage.chromeWebDriverConnection();
		homePage.visit("https://www.experta.com.ar/");
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws  InterruptedException{
		
	homePage.searchText();
			

	}

}
