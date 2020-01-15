import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.En;
import org.junit.Test;

public class SearchSteps implements En {

    SearchPage searchPage;
    ResultPage resultPage;
    TestContext context;

    public SearchSteps(TestContext context) {
        this.context = context;
        searchPage = this.context.getSearchPage();
        resultPage = this.context.getResultPage();
    }

    @When("text '(.*?)' entered")
    public void searchText(String text) {
        searchPage.searchText(text);
    }

    @Then("first link contains '(.*?)' text")
    public void containsText(String text) {
        resultPage.IsFirstLinkContainsText(text);
    }
}