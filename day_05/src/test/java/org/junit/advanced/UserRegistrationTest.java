package java.org.junit.advanced;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    UserRegistration userReg = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> userReg.registerUser("JohnDoe", "john@example.com", "Secure123"));
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> userReg.registerUser("JohnDoe", "johnexample.com", "Secure123"));
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> userReg.registerUser("JohnDoe", "john@example.com", "Pass1"));
        assertEquals("Password must be at least 8 characters long", exception.getMessage());
    }

    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> userReg.registerUser("", "john@example.com", "Secure123"));
        assertEquals("Username cannot be empty", exception.getMessage());
    }
}
