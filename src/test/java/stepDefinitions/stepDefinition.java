package stepDefinitions;



import java.io.IOException;



import org.apache.log4j.BasicConfigurator;

import org.junit.Assert;



import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

import pageObjects.LandingPage;

import pageObjects.LoginPage;

import pageObjects.portalHomePage;

import resources.base;



public class stepDefinition extends base{

@Given("Initialize the browser with Chrome")

public void initialize_the_browser_with_Chrome() throws IOException {

// Write code here that turns the phrase above into concrete actions

BasicConfigurator.configure();

driver = initializeDriver();

}



@Given("Navigate to {string} site")

public void navigate_to_site(String string) {

// Write code here that turns the phrase above into concrete actions

driver.get(string);

}



@Given("Click on Login link in home page to land on secure sign in Page")

public void click_on_Login_link_in_home_page_to_land_on_secure_sign_in_Page() {

// Write code here that turns the phrase above into concrete actions

LandingPage l= new LandingPage(driver);

if (l.getPopupSize()>0)

{

l.getPopup().click();

}

l.getLogin().click();

}



@Then("Verify that user is successfully logged in")

public void verify_that_user_is_successfully_logged_in() {

// Write code here that turns the phrase above into concrete actions

portalHomePage p = new portalHomePage(driver);

Assert.assertTrue(p.getSearchBox().isDisplayed());

}





@When("^User enters (.+) and (.+) and logs in$")

public void user_enters_and_and_logs_in(String username, String password) throws Throwable {

LoginPage lp = new LoginPage(driver);

lp.getEmail().sendKeys(username);

lp.getPassword().sendKeys(password);

lp.getLogin().click();

}


@And("^close browsers$")

public void close_browsers() throws Throwable {

driver.quit();

}





}

