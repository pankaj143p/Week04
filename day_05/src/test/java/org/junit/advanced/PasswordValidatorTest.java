package java.org.junit.advanced;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Secure123"));
    }

    @Test
    void testInvalidPasswordShort() {
        assertFalse(validator.isValid("S1"));
    }

    @Test
    void testInvalidPasswordNoUppercase() {
        assertFalse(validator.isValid("secure123"));
    }

    @Test
    void testInvalidPasswordNoDigit() {
        assertFalse(validator.isValid("SecurePass"));
    }
}
