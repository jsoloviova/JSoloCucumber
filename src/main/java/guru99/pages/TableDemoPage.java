package guru99.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TableDemoPage extends BasePage {

    SelenideElement tableOnPage = $x("//tbody");

    public void isTablePresent() {
        tableOnPage.isDisplayed();
    }
}
