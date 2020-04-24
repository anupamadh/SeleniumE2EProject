package Academy;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class validateTitle extends base{
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home Page");
	}
	
	@Test
	public void basePageNavigation() throws IOException {
		LandingPage l= new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "Featured Courses");
		log.info("Successfully validated text message");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
}
