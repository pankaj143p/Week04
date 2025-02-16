package java.org.regex.extraction;

import org.junit.jupiter.api.Test;

import java.org.regex.extraction.ExtractLinks;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExtractLinksTest {
    @Test
    void test1() {
        String input = "Visit https://www.google.com and http://example.org for more info.";
        ExtractLinks vu = new ExtractLinks();
        vu.validate(input);
        String[] expected = {"https://www.google.com", "http://example.org"};
        System.out.println(vu.ans);
        assertEquals(Arrays.asList(expected), vu.ans);
    }
}