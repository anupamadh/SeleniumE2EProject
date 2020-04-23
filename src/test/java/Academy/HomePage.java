package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	@Test
	public void basePageNavigation() throws IOException {
		driver = initializeDriver();
		driver.get("https://www.rahulshettyacademy.com/#/index");
		LandingPage l= new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys("abc123again@gmail.com");
		lp.getPassword().sendKeys("abc123again");
		lp.getLogin().click();
	}
}
