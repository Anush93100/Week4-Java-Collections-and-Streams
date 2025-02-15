package regex.extraction_problems.extract_all_capitalized_words;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtractAllCapitalizedWordsTest {

    @Test
    void testCase1(){
        String sentence="The Eiffel Tower is in Paris and the Statue of Liberty is in New York";
        List<String> capitalWords=ExtractAllCapitalizedWords.extractingAllCapitalWords(sentence);

        List<String> expected= Arrays.asList("The","Eiffel","Tower","Paris","Statue","Liberty","New","York");
        assertArrayEquals(expected.toArray(),capitalWords.toArray());
    }

    @Test
    void testCase2(){
        String sentence="is in and the of is in";
        List<String> capitalWords=ExtractAllCapitalizedWords.extractingAllCapitalWords(sentence);

        List<String> expected=new ArrayList<>();
        assertArrayEquals(expected.toArray(),capitalWords.toArray());
    }
}
