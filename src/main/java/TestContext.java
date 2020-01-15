public class TestContext {

    private SearchPage searchPage;
    private ResultPage resultPage;

    public  TestContext() {
        searchPage = new SearchPage();
        resultPage = new ResultPage();
    }

    public SearchPage getSearchPage(){
        return searchPage;
    }

    public ResultPage getResultPage(){
        return resultPage;
    }
}
