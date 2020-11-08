package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import guru99.pages.AgileProjectPage;
import guru99.pages.HomePage;

import static org.junit.Assert.assertTrue;

public class AgileProjectSteps {

    HomePage homePage = new HomePage();
    AgileProjectPage agileProjectPage = new AgileProjectPage();

    @Given("user is on home page")
    public void userIsOnHomePage() {
        homePage.navigate();
    }

    @When("user navigates to agile page")
    public void userNavigatesToAgilePage() {
        homePage.getMainMenuFragment().clickOnAgileProjectLink(2);
    }

    @And("user enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String login, String password) {
        agileProjectPage.getLoginFormFragment().inputCredentials(login, password);
    }

    @And("click login button")
    public void clickLoginButton() {
        agileProjectPage.getLoginFormFragment().clickOnLoginButton();
    }

    @Then("welcome message is correct")
    public void welcomeMessageIsCorrect() {
        assertTrue(agileProjectPage.getWelcomeMessage(), true);
    }

    @Then("invalid credentials message is shown")
    public void invalidCredentialsMessageIsShown() {
        assertTrue(agileProjectPage.invalidCredentialsAlertShown());
    }
}
