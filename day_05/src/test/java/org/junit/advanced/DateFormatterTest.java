package java.org.junit.advanced;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDateFormat() {
        assertEquals("25-12-2023", formatter.formatDate("2023-12-25"));
    }

    @Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> formatter.formatDate("25/12/2023"));
        assertEquals("Invalid date format", exception.getMessage());
    }
}
