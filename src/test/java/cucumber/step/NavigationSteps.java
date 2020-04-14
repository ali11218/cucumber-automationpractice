package cucumber.step;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobject.EveningDressesPage;
import pageobject.NavigationPage;

public class NavigationSteps {

    @Given("I hoverover on 'WOMEN' tab in home page")
    public void i_hoverover_on_tab_in_home_page() {
        new NavigationPage(CommonSteps.getDriver()).hoverOverWomenTab();
    }

    @And("I click on 'EVENING Dresses' tab in navigation manu")
    public void i_click_on_tab_in_navigation_manu() {
        new NavigationPage(CommonSteps.getDriver()).clickOnEveningDressesLink();
    }


}

