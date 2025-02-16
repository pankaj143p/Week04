package java.org.junit.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    StringUtils utils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("tac", utils.reverse("cat"));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(utils.isPalindrome("madam"));
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
    }
}