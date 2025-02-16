package java.org.regex.extraction;

import org.junit.jupiter.api.Test;

import java.org.regex.extraction.ExtractDates;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExtractDatesTest {
    @Test
    void test1() {
        String input = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        ExtractDates vu = new ExtractDates();
        vu.validate(input);
        String[] expected = {"12/05/2023", "15/08/2024", "29/02/2020"};
        System.out.println(vu.ans);
        assertEquals(Arrays.asList(expected), vu.ans);
    }
}