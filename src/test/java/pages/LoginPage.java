package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    final SelenideElement loginButton = $("[data-testid=\"Login menu button\"]");
    final SelenideElement userInput = $("[data-testid=\"Email input\"]");
    final SelenideElement passInput = $x("//*[@placeholder=\"Пароль\"]");
    final SelenideElement loginBtn = $x("//*[text()='Войти']");

    public LoginPage openPage() {
        open("");
        return this;
    }

    public LoginPage login() {
        loginButton.click();
        userInput.setValue("client22904@grouplr15.cwm");
        passInput.sendKeys("ajbPwV");
        loginBtn.click();
        return this;
    }
}
