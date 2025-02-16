package java.org.regex.basic;

import org.junit.jupiter.api.Test;

import java.org.regex.basic.HexColorCode;

import static org.junit.jupiter.api.Assertions.*;

class HexColorCodeTest {
    @Test
    void Valid(){
        String input = "#FFA500";
        HexColorCode vu = new HexColorCode();
        assertEquals(true,vu.validate(input));
    }
    @Test
    void Valid2(){
        String input = "#ff4500";
        HexColorCode vu = new HexColorCode();
        assertEquals(true,vu.validate(input));
    }
    @Test
    void inValid(){
        String input = "#ff45000";
        HexColorCode vu = new HexColorCode();
        assertEquals(false,vu.validate(input));
    }
}