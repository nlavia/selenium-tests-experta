package com.project.pom;



import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class SearchTest {

	
	private WebDriver driver;
	HomePage  homePage;
		
	
	@BeforeEach
	public void setUp() throws Exception {
		homePage = new HomePage(driver);
		//resultHomePage = new ResultHomePage(driver);
		driver = homePage.chromeWebDriverConnection();
		homePage.visit("https://www.experta.com.ar/");
	}

	@AfterEach
	public void tearDown() throws Exception {
	
	driver.close();
	}

	@Test
	public void test() throws  InterruptedException{
	homePage.searchText();
	homePage.resultGridOn();
	
	Assert.assertEquals( "ART", homePage.resultText());
	
  			

	}

}
