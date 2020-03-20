package test;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.project.pom.HomePage;



class CotizadorHogarTest {
	
	private WebDriver driver;
	HomePage  homePage;

	@BeforeEach
	void setUp() throws Exception {
		
		homePage = new HomePage(driver);
		driver = homePage.chromeWebDriverConnection();
		homePage.visit("https://www.experta.com.ar/");
	}

	@AfterEach
	void tearDown() throws Exception {
	
		driver.close();
		
	}

	@Test
	void test() throws InterruptedException {
		Thread.sleep(2000);
		//homePage.clickCotizaHogarButton();
		Assert.assertEquals( "Se mostro el cotizador", homePage.clickCotizaHogarButton());
		
		
	}

}
