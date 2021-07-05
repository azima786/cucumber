package steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import util.BrowserFactory;

public class LoginStepDefination {
	WebDriver driver;
	LoginPage lp;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.init();
		lp = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on Techfios Login Page$")
	public void User_is_on_Techfios_LoginPage() {
		driver.get("https://techfios.com/billing/?ng=login/");

	}

	@Given("^User is on \"([^\"]*)\" Login Page$")
	public void user_is_on_Login_Page(String page) throws Throwable {
		if (page.equalsIgnoreCase("Techfios")) {
			driver.get("https://techfios.com/billing/?ng=login/");

		} else if (page.equalsIgnoreCase("GoogleSearch")) {
			driver.get("https://www.google.com/");
		}
		Thread.sleep(2000);
	}

	@When("^user enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) throws Throwable {
		lp.UserName(username);

	}
	
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
	   lp.enterCredentials(username, password);
	}

	@When("^user enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
		lp.Password(password);
		Thread.sleep(2000);
	}

	@When("^user click on signon button$")
	public void user_click_on_signon_button() throws Throwable {
		lp.Login();
	}

	@Then("^user should land on Dashboard Page$")
	public void user_should_land_on_Dashboard_Page() throws Throwable {
		String expectedTitle = "Dashboard- iBilling";
		String actual = driver.getTitle();
		Assert.assertEquals(expectedTitle, actual);
		lp.takeScreenshotAtEndOfTest(driver);
	
	}
	


	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
}