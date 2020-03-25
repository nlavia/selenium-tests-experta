package test.java;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.project.pom.HomePage;

public class SearchEngine {

	private WebDriver driver;

	@Test
	public void pruebaBuscador() throws InterruptedException {

		HomePage homePage;

		homePage = new HomePage(driver);
		driver = homePage.chromeWebDriverConnection();
		homePage.visit("https://www.experta.com.ar/");

		homePage.searchText();
		homePage.resultGridOn();

		Assert.assertEquals("ART", homePage.resultText());

		driver.close();

	}

}
