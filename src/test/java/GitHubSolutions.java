import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubSolutions {

    @Test
    void Solutions() {
//        Configuration.holdBrowserOpen = true;
        open("https://github.com/");
        $(byTagAndText("button", "Solutions")).hover();
        $$(".HeaderMenu-dropdown").get(1);
        $(byText("Enterprise")).click();
        $(".Primer_Brand__Button-module__Button___lDruK").shouldBe(Condition.text("Start a free trial"));
        sleep(3000);
    }
}
