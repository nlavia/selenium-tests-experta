package test.java;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.project.pom.HomePage;

public class CotizadorHogar {

	private WebDriver driver;

	@Test
	public void cotizadorTest() throws InterruptedException {

		HomePage homePage;
		homePage = new HomePage(driver);
		driver = homePage.chromeWebDriverConnection();
		homePage.visit("https://www.experta.com.ar/");

		Thread.sleep(2000);
		Assert.assertEquals("Se mostro el cotizador", homePage.clickCotizaHogarButton());

		driver.close();
	}

}
