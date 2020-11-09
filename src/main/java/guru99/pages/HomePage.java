package guru99.pages;

import com.codeborne.selenide.SelenideElement;
import guru99.fragments.MainMenuFragment;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage {

    MainMenuFragment mainMenuFragment = new MainMenuFragment();

    SelenideElement loginForm = $("form[name='frmLogin']");
    SelenideElement newToursButton = $x("//a[text()='New Tours']");

    public void navigate() {
        open("/");
    }

    public MainMenuFragment getMainMenuFragment() {
        return mainMenuFragment;
    }

    public boolean isLoginFormPresent() {
        return loginForm.isDisplayed();
    }

    public void clickOnNewToursButton() {
        newToursButton.click();
    }


}
