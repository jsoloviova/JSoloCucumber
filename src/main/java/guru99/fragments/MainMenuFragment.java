package guru99.fragments;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MainMenuFragment {

    SelenideElement navMenu = $x("//nav[@class='navbar navbar-default']");
    ElementsCollection navMenuItems = $$x("//li[@class='dropdown']/a");
    SelenideElement tableDemoLink = $x("//a[text()='Table Demo']");

    public void clickOnAgileProjectLink(int index) {
        navMenuItems.get(index).click();
    }

    public boolean isMainMenuPresent() {
        return navMenu.isDisplayed();
    }

    public void clickOnTableDemoLink(int index) {
        navMenuItems.get(index).click();
        tableDemoLink.click();
    }

}
