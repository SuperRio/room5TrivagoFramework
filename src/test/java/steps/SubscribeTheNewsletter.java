package steps;

import org.openqa.selenium.JavascriptExecutor;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import tests.TestBase;

public class SubscribeTheNewsletter extends TestBase{
	HomePage hPage;

	@Given("^I want to receive updates from trivago$")
	public void i_want_to_receive_updates_from_trivago() throws Throwable {
		hPage = new HomePage(driver);
		hPage.closeCookie();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2500)", "");
		Thread.sleep(2000);
	}

	@When("^I check the newsletter checkbox$")
	public void i_check_the_newsletter_checkbox() throws Throwable {
		hPage.CheckNewsletter();
	}

	@And("^enter my email$")
	public void enter_my_email() throws Throwable {
		hPage.NewsletterEmail();
	}

	@And("^click on inspireMe$")
	public void click_on_inspireMe() throws Throwable {
		hPage.SubmitNewsletter();
	}

	@Then("^I shall get subscribed$")
	public void i_shall_get_subscribed() throws Throwable {
		System.out.println("TC3 Passed!");
	}


}
