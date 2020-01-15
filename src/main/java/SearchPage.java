import static com.codeborne.selenide.Condition.be;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    private String searchInputSelector = "#search_form_input_homepage";
    private String searchButtonSelector = "#search_button_homepage";

    public void searchText(String text) {
        $(searchInputSelector).shouldBe(be(visible)).setValue(text);
        $(searchButtonSelector).shouldBe(visible).click();
    }
}
