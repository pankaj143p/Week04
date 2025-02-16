package java.org.regex.extraction;

import org.junit.jupiter.api.Test;
import java.org.regex.extraction.ExtractEmails;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ExtractEmailsTest {
    @Test
    void test1() {
        String input = "user at info@company.org from bhopal";
        ExtractEmails vu = new ExtractEmails();
        vu.validate(input);
        String temp = new String("info@company.org");
        ArrayList<String> expected = new ArrayList<String>();
        expected.add(temp);
        assertEquals(expected, vu.ans);
    }
    @Test
    void test2() {
        String input = "user at info@@company.org from bhopal";
        ExtractEmails vu = new ExtractEmails();
        vu.validate(input);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, vu.ans);
    }
}