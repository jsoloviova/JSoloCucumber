package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import guru99.pages.DragAndDropPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DragAndDropSteps {

    DragAndDropPage dragAndDropPage = new DragAndDropPage();

    @Given("user is on dragAndDrop page")
    public void userIsOnDragAndDropPage() {
        dragAndDropPage.navigate();
    }

    @And("success message is not shown")
    public void successMessageIsNotShown() {
        assertFalse(dragAndDropPage.isSuccessMessageDisplayed());
    }

    @When("user drop debit account {string}")
    public void userDropDebitAccount(String debitItem) {
        dragAndDropPage.dropDebitAccount(debitItem);
    }

    @And("user drop debit amount {string}")
    public void userDropDebitAmount(String debitAmount) {
        dragAndDropPage.dropDebitAmount(debitAmount);
    }

    @And("user drop credit account {string}")
    public void userDropCreditAccount(String creditItem) {
        dragAndDropPage.dropCreditAccount(creditItem);
    }

    @And("user drop credit amount {string}")
    public void userDropCreditAmount(String creditAmount) {
        dragAndDropPage.dropCreditAmount(creditAmount);
    }

    @Then("success message is shown")
    public void successMessageIsDisplayed() {
        assertTrue(dragAndDropPage.isSuccessMessageDisplayed());
    }
}