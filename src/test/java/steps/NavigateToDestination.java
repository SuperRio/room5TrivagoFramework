package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import tests.TestBase;

public class NavigateToDestination extends TestBase {
	HomePage hPage;

	@Given("^I want to navigate to a destination$")
	public void i_want_to_navigate_to_a_destination() throws Throwable {
		hPage = new HomePage(driver);
		hPage.closeCookie();
	}

	@When("^I click on the top left menu$")
	public void i_click_on_the_top_left_menu() throws Throwable {
		hPage.ClickOnMenu();
		Thread.sleep(3000);
	}

	@And("^click on my desired destination$")
	public void click_on_my_desired_destination() throws Throwable {
		hPage.ClickOnDestination();

	}

	@Then("^I shall get navigated to it$")
	public void i_shall_get_navigated_to_it() throws Throwable {
		System.out.println("TC$ Passed!");

	}


}
