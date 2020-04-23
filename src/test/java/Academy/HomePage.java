package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class HomePage extends base{
	@Test
	public void basePageNavigation() throws IOException {
		driver = initializeDriver();
		driver.get("https://www.rahulshettyacademy.com/#/index");
		LandingPage l= new LandingPage(driver);
		l.getLogin().click();;
	}
}
