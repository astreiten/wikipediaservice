package wikipedia.service;

public class WikipediaServiceModule
{
    private static WikipediaServiceModule instance;
    private ExtractHelper extractHelper;
    private WikipediaService wikipediaService;

    private WikipediaServiceModule()
    {
        extractHelper = new ExtractHelperImpl();
        wikipediaService = new WikipediaServiceImpl(extractHelper);
    }

    public static WikipediaServiceModule getInstance()
    {
        if(instance == null)
        {
            instance =  new WikipediaServiceModule();
        }
        return instance;
    }

    public ExtractHelper getExtractHelper()
    {
        return extractHelper;
    }

    public WikipediaService getService()
    {
        return wikipediaService;
    }
}
