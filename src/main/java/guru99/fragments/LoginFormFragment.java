package guru99.fragments;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginFormFragment {

    SelenideElement loginButton = $x("//input[@value='LOGIN']");
    SelenideElement userIdInput = $x("//input[@name='uid']");
    SelenideElement passwordInput = $x("//input[@name='password']");

    public void inputCredentials(String login, String password) {
        userIdInput.val(login);
        passwordInput.val(password);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }
}
