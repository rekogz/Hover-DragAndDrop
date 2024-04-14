import com.codeborne.selenide.Condition;
import com.codeborne.selenide.DragAndDropOptions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {

    @Test
    void DragAndDropBox() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        sleep(5000);
        $("#column-a").shouldBe(Condition.text("A"));
        $(element("#column-a").dragAndDrop(DragAndDropOptions.to($("#column-b"))));
        $("#column-a").shouldBe(Condition.text("B"));
        sleep(5000);
    }
}
