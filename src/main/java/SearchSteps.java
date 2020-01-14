import io.cucumber.java.en.When;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.be;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;

public class SearchSteps implements En {

    @When("text '(.*?)' entered")
    public void searchText(String text) {
        $("#search_form_input_homepage").shouldBe(be(visible)).setValue(text);
    }
}
