package problems.customexception;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvalidAgeExceptionHandleTest {

    @Test
    public void testValidateAge_ExceptionThrown() {
        // Arrange
        int age = 15;
        InvalidAgeException exception = assertThrows(InvalidAgeException.class, () -> {
            InvalidAgeExceptionHandle.validateAge(age);
        });

        // Assert
        assertEquals("Age must be 18 or older", exception.getMessage());
    }
}
