package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import guru99.pages.HomePage;
import guru99.pages.NewToursPage;
import guru99.pages.TableDemoPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SmokeNavigationSteps {

    HomePage homePage = new HomePage();
    NewToursPage newToursPage = new NewToursPage();
    TableDemoPage tableDemoPage = new TableDemoPage();

    // scnerio 1
    @When("user navigate to homePage")
    public void userNavigateToHomePage() {
        homePage.navigate();
    }

    @Then("title of homePage is {string}")
    public void titleOfHomePageIs(String title) {
        assertEquals(title, homePage.getTitle());
    }

    @And("login form is present")
    public void loginFormIsPresent() {
        assertTrue(homePage.isLoginFormPresent());
    }

    // scenario 2
    @Given("user is on homePage")
    public void userIsOnHomePage() {
        homePage.navigate();
    }

    @When("user click on newToursButton")
    public void userClickOnNewToursButton() {
        homePage.clickOnNewToursButton();
    }

    @Then("title of newToursPage is {string}")
    public void titleOfNewToursPageIs(String title) {
        assertEquals(title, newToursPage.getTitle());
    }

    @And("main fragment is present")
    public void mainFragmentIsPresent() {
        assertTrue(newToursPage.getMainMenuFragment().isMainMenuPresent());
    }

    // scenario 3
    @When("user click on tableDemoLink")
    public void userClickOnTableDemoLink() {
        homePage.getMainMenuFragment().clickOnTableDemoLink(0);
    }

    @Then("title of tablePage is correct")
    public void titleOfTablePageIsCorrect() {
        assertTrue(tableDemoPage.getTitle(), true);
    }

    @And("table is present")
    public void tableIsPresent() {
        tableDemoPage.isTablePresent();
    }
}
