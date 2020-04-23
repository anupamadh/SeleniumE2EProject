package Academy;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String username, String password) throws IOException {
		driver = initializeDriver();
		driver.get("https://www.rahulshettyacademy.com/#/index");
		LandingPage l= new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLogin().click();
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][2];
		data[0][0] ="nonrestricteduser@qw.com";
		data[0][1] ="123456";
		
	/**	data[1][0] ="restricteduser@qw.com";
		data[1][1] ="456788";*/
		
		return data;
	}
}
