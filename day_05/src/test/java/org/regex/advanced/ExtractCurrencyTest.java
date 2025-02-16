package java.org.regex.advanced;

import org.junit.jupiter.api.Test;

import java.org.regex.advanced.ExtractCurrency;

import static org.junit.jupiter.api.Assertions.*;

class ExtractCurrencyTest {
    @Test
    void test1(){
        String expected = new String("$45.99, 10.50");
        ExtractCurrency ep = new ExtractCurrency();
        assertEquals(expected,ep.extractCurrency("The price is $45.99, and the discount is 10.50."));
    }
}