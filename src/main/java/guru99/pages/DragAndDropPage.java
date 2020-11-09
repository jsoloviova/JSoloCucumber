package guru99.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class DragAndDropPage extends BasePage {

    SelenideElement To1 = $x("//*[@id='bank']/li");
    SelenideElement To2 = $x("//*[@id='amt7']/li");
    SelenideElement To3 = $x("//*[@id='loan']/li");
    SelenideElement To4 = $x("//*[@id='amt8']/li");
    SelenideElement successMessage = $x("//div[@class='table4_result']/a[@class='button button-green']");

    public void navigate() {
        switchTo().alert().accept();
        open("/test/drag_drop.html");
    }

    public void dropDebitAccount(String debitItem) {
        SelenideElement bankDebitItem = $x("//a[contains(text(),' " + debitItem + " ')]");
        actions().dragAndDrop(bankDebitItem, To1).build().perform();
    }

    public void dropDebitAmount(String debitAmount) {
        SelenideElement debitAmountItem = $x("//a[contains(text(),' " + debitAmount + " ')]");
        actions().dragAndDrop(debitAmountItem, To2).build().perform();
    }

    public void dropCreditAccount(String creditItem) {
        SelenideElement bankDebitItem = $x("//a[contains(text(),' " + creditItem + " ')]");
        actions().dragAndDrop(bankDebitItem, To3).build().perform();
    }

    public void dropCreditAmount(String creditAmount) {
        SelenideElement bankDebitItem = $x("//a[contains(text(),' " + creditAmount + " ')]");
        actions().dragAndDrop(bankDebitItem, To4).build().perform();
    }

    public boolean isSuccessMessageDisplayed() {
        return successMessage.isDisplayed();
    }
}