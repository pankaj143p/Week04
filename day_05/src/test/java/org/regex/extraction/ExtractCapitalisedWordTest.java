package java.org.regex.extraction;

import org.junit.jupiter.api.Test;

import java.org.regex.extraction.ExtractCapitalisedWord;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExtractCapitalisedWordTest {
    @Test
    void test1() {
        String input = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        ExtractCapitalisedWord vu = new ExtractCapitalisedWord();
        vu.validate(input);
        String[] expected = {"The", "Eiffel", "Tower", "Paris", "Statue", "Liberty", "New", "York"};
        System.out.println(vu.ans);
        assertEquals(Arrays.asList(expected), vu.ans);
    }
}