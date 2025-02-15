package regex.replace_and_modify_strings.censor_bad_words;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CensorBadWordsTest {

    @Test
    void testCase1(){
        String sentence="This is a damn bad example with some stupid words.";
        String goodstring=CensorBadWords.censoringBadWords(sentence);

        String expected="This is a **** bad example with some **** words. ";
        assertArrayEquals(goodstring.toCharArray(),expected.toCharArray());
    }

    @Test
    void testCase2(){
        String sentence="This is a bad example with some words.";
        String goodstring=CensorBadWords.censoringBadWords(sentence);

        String expected="This is a bad example with some words. ";
        assertArrayEquals(goodstring.toCharArray(),expected.toCharArray());
    }
}
