package cucumber.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobject.HomePage;

public class HomePageSteps {
    @Given("I type {string} in the 'search box' in home page")
    public void i_type_in_the_in_home_page(String dressName) {
       new HomePage(CommonSteps.getDriver()).typeSearchItem(dressName);
    }


    @Then("I click 'search button' in home page")
    public void i_click_in_home_page() {
        new HomePage(CommonSteps.getDriver()).clickSearchButton();
    }
}
