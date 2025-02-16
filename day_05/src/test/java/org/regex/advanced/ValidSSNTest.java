package java.org.regex.advanced;

import org.junit.jupiter.api.Test;

import java.org.regex.advanced.ValidSSN;

import static org.junit.jupiter.api.Assertions.*;

class ValidSSNTest {
    @Test
    void test1(){
        ValidSSN ip = new ValidSSN();
        assertEquals(true,ip.validate("My SSN is 123-45-6789."));
    }
    @Test
    void test2(){
        ValidSSN ip = new ValidSSN();
        assertEquals(false,ip.validate("My SSN is 123456789."));
    }
}