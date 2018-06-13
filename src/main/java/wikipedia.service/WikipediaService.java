package wikipedia.service;

import java.io.IOException;

public interface WikipediaService
{
    void connectAPI();
    String getMeaning(String input) throws IOException;
}
