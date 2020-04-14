package cucumber.step;

import io.cucumber.java.en.Then;
import pageobject.EveningDressesPage;

public class VerificationSteps {
    @Then("I see 'Evening Dresses' title in evening dresses page")
    public void i_see_title_in_evening_dresses_page() {
        EveningDressesPage eveningDressesPage = new EveningDressesPage(CommonSteps.getDriver());
        String actualMessage = eveningDressesPage.getEveningPageTitle();
        String expectedMessage = "Evening Dresses";

        eveningDressesPage.verifyEquals("", expectedMessage, actualMessage);
    }
}
