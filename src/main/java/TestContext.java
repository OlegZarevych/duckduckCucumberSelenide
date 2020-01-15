public class TestContext {

    private SearchPage searchPage;

    public  TestContext() {
        searchPage = new SearchPage();
    }

    public SearchPage getSearchPage(){
        return searchPage;
    }
}
