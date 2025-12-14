package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ProjectsPage {
    final SelenideElement title = $x("//*[@data-testid=\"Header profile settings\"]");
    final SelenideElement titleBtn = $x("//*[@data-testid=\"All tests client menu button\"]");


    public void waitOpen() {
        title.should(Condition.exist).shouldBe(visible);
        titleBtn.shouldHave(cssValue("background-color", "rgba(250, 251, 251, 1)"));

    }
}
