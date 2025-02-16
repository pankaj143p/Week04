package java.org.regex.advanced;

import org.junit.jupiter.api.Test;

import java.org.regex.advanced.ValidateIP;

import static org.junit.jupiter.api.Assertions.*;

class ValidateIPTest {
    @Test
    void test1(){
        ValidateIP ip = new ValidateIP();
        assertEquals(true,ip.validate("127.0.0.1"));
        assertEquals(true,ip.validate("196.90.0.1"));
    }
    @Test
    void test2(){
        ValidateIP ip = new ValidateIP();
        assertEquals(false,ip.validate("255.256.190.1"));
    }
}