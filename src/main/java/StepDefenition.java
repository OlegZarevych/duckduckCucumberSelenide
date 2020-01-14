import io.cucumber.java.en.Given;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.open;

public class StepDefenition implements En {



    @Given("the search page is opened")
    public void the_search_page_is_open(){

        open("https://duckduckgo.com/");
    }
}
