import com.codeborne.selenide.SelenideElement;
import java.util.Optional;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ResultPage {

    private String resultLink = ".result__a";

    public void IsFirstLinkContainsText(String expectedText){
        Optional<SelenideElement> optional = $$(resultLink).stream().findFirst();
        SelenideElement element = optional.get();
        String actualText = element.shouldBe(visible).text();
        //actualText.contains(expectedText);
        assertThat(actualText, containsString(expectedText));
    }
}