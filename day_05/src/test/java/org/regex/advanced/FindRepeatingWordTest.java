package java.org.regex.advanced;

import org.junit.jupiter.api.Test;

import java.org.regex.advanced.FindRepeatingWord;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class FindRepeatingWordTest {
    @Test
    void test1(){
        String testSentence = "[is, repeated]";
        HashSet<String> hs = new HashSet<>();
        hs.add("is");
        hs.add("repeated");
        FindRepeatingWord ep = new FindRepeatingWord();
        assertEquals(hs,ep.extractRepeatingWords( "This is is a repeated repeated repeated word test."));
    }
}