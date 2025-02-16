package java.org.regex.advanced;

import org.junit.jupiter.api.Test;

import java.org.regex.advanced.ExtractProgName;

import static org.junit.jupiter.api.Assertions.*;

class ExtractProgNameTest {
    @Test
    void test1(){
        String expected = new String("Python, Go, Java");
        ExtractProgName ep = new ExtractProgName();
        assertEquals(expected,ep.extractLanguages("I love Java, Python, and JavaScript, but I haven't tried Go yet."));
    }
}