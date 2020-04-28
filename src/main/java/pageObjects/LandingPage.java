package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver = null;
	By signin = By.cssSelector("a[href*='sign_in']");
	By title = By.cssSelector(".pull-left>h2");
	By navbar = By.xpath(" //div[@class='nav-outer clearfix']//ul[@class='navigation clearfix']");
	By popup = By.xpath("//button[contains(text(),'NO THANKS')]");
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
public WebElement getLogin() {
	return driver.findElement(signin);
}

public WebElement getTitle() {
	return driver.findElement(title);
}

public WebElement getNavigationBar() {
	return driver.findElement(navbar);
}

public int getPopupSize() {
	return driver.findElements(popup).size();
}
public WebElement getPopup() {
	return driver.findElement(popup);
}

}
