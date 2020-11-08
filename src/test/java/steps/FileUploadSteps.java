package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import guru99.pages.UploadFilePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FileUploadSteps {

    UploadFilePage uploadFilePage = new UploadFilePage();

    @Given("user is on uploadFilePage")
    public void userIsOnUploadFilePage() {
        uploadFilePage.navigate();
    }

    @And("title of page is {string}")
    public void titleOfPageIs(String title) {
        assertEquals(title, uploadFilePage.getTitle());
    }

    @When("user click {string} button")
    public void userClickButton(String uploadFileButton) {
        uploadFilePage.clickOnChooseFile();
    }

    @And("add file path")
    public void addFilePath() {
        uploadFilePage.addFile();
    }

    @And("click {string} button")
    public void clickButton(String submitButton) {
        uploadFilePage.clickOnSubmitButton();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        assertTrue(uploadFilePage.isSuccessMessageDisplayed());
    }
}
