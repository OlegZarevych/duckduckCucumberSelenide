import io.cucumber.java.en.When;
import io.cucumber.java8.En;

public class SearchSteps implements En {

    SearchPage searchPage;
    TestContext context;

    public SearchSteps(TestContext context) {
        this.context = context;
        searchPage = this.context.getSearchPage();
    }

    @When("text '(.*?)' entered")
    public void searchText(String text) {
        searchPage.searchText(text);
    }
}