package guru99.pages;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class UploadFilePage extends BasePage {

    SelenideElement uploadFileButton = $x("//input[@class='upload_txt']");
    SelenideElement submitButton = $x("//button[@id='submitbutton']");
    SelenideElement successMessage = $x("//h3[@id='res']/center");

    public void navigate() {
        open("/test/upload/");
    }

    public void clickOnChooseFile() {
        uploadFileButton.click();
    }

    public void addFile() {
        File fileToUpload = new File("D:/AQA/99little_bugs_in_the_code.jpg");
        uploadFileButton.uploadFile(fileToUpload);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }

    public boolean isSuccessMessageDisplayed() {
        return successMessage.isDisplayed();
    }
}
