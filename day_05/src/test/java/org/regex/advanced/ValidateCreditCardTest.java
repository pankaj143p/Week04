package java.org.regex.advanced;

import org.junit.jupiter.api.Test;

import java.org.regex.advanced.ValidateCreditCard;

import static org.junit.jupiter.api.Assertions.*;

class ValidateCreditCardTest {
    @Test
    void test1(){
        ValidateCreditCard vc = new ValidateCreditCard();
        assertEquals(true,vc.validate("4012888888881881"));
        assertEquals(true,vc.validate("5105105105105100"));
    }
    @Test
    void test2(){
        ValidateCreditCard vc = new ValidateCreditCard();
        assertEquals(false,vc.validate("8012888888881881"));
        assertEquals(false,vc.validate("8105105105105100"));
    }
}