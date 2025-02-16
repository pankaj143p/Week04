package java.org.regex.basic;

import org.junit.jupiter.api.Test;

import java.org.regex.basic.ValidateUsername;

import static org.junit.jupiter.api.Assertions.*;

class ValidateUsernameTest {
    @Test
    void Valid(){
        String input = "user_123";
        ValidateUsername vu = new ValidateUsername();
        assertEquals(true,vu.validate(input));
    }
    @Test
    void inValid(){
        String input = "123user";
        ValidateUsername vu = new ValidateUsername();
        assertEquals(false,vu.validate(input));
    }
    @Test
    void inValidLength(){
        String input = "usr1";
        ValidateUsername vu = new ValidateUsername();
        assertEquals(false,vu.validate(input));
    }
}