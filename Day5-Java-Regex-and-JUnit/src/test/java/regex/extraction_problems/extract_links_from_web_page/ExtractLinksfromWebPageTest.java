package regex.extraction_problems.extract_links_from_web_page;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExtractLinksfromWebPageTest {

    @Test
    void testCase1(){
        String webpage="Visit https://www.google.com and http://example.org for more info";
        List<String> links=ExtractLinksfromWebPage.extractingLink(webpage);

        List<String> expected= Arrays.asList("https://www.google.com","http://example.org");
        assertArrayEquals(expected.toArray(),links.toArray());
    }

    @Test
    void testCase2(){
        String webpage="Visit and for more info";
        List<String> links=ExtractLinksfromWebPage.extractingLink(webpage);

        List<String> expected= new ArrayList<>();
        assertArrayEquals(expected.toArray(),links.toArray());
    }
}
