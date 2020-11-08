package guru99.pages;

import com.codeborne.selenide.SelenideElement;
import guru99.fragments.LoginFormFragment;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

public class AgileProjectPage extends BasePage {

    LoginFormFragment loginFormFragment = new LoginFormFragment();


    SelenideElement welcomeMessage = $x("//marquee[@class='heading3']");
    String invalidCredentialsAlert = "User or Password is not valid";

    public LoginFormFragment getLoginFormFragment() {
        return loginFormFragment;
    }

    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }

    public boolean invalidCredentialsAlertShown() {
        return switchTo().alert().getText().contains(invalidCredentialsAlert);
    }

}
